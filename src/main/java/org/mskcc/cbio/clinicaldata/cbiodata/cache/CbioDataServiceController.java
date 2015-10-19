package org.mskcc.cbio.clinicaldata.cbiodata.cache;

import io.netty.buffer.ByteBuf;
import io.reactivex.netty.RxNetty;
import io.reactivex.netty.protocol.http.client.HttpClientResponse;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Copyright (c) 2015 Memorial Sloan-Kettering Cancer Center.
 * <p/>
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 * documentation provided hereunder is on an "as is" basis, and
 * Memorial Sloan-Kettering Cancer Center
 * has no obligations to provide maintenance, support,
 * updates, enhancements or modifications.  In no event shall
 * Memorial Sloan-Kettering Cancer Center
 * be liable to any party for direct, indirect, special,
 * incidental or consequential damages, including lost profits, arising
 * out of the use of this software and its documentation, even if
 * Memorial Sloan-Kettering Cancer Center
 * has been advised of the possibility of such damage.
 * <p/>
 * Created by Fred Criscuolo on 7/12/15.
 * criscuof@mskcc.org
 */
/*
Represents a prototype cache manager that issues commands to a cache service using
a Netty interface. Primary function is to signal to a read-through cache that its
underlying data store (e.g. database) has been modified and that its current contents
should be purged and refreshed.
The cache service must implement a Netty server
 */
public class CbioDataServiceController {
    private final int port;

    public CbioDataServiceController () {
        this.port = CbioDataService.DEFAULT_PORT;
    }

    /*
    Public method that sends a reset cache command to a cache service that also supports
    a Netty server
     */
    public String sendResetRequest() throws InterruptedException, ExecutionException, TimeoutException {
        return RxNetty.createHttpGet("http://localhost:" + port + "/" +CbioDataService.RESET_CACHE_COMMAND)
                .flatMap((HttpClientResponse<ByteBuf> response) -> {
                    printResponseHeader(response);
                    return response.getContent().<String> map(content -> {
                        return content.toString(Charset.defaultCharset());
                    });
                })
                .toBlocking()
                .toFuture().get(1, TimeUnit.MINUTES);
    }

    public void printResponseHeader(HttpClientResponse<ByteBuf> response) {
        System.out.println("New response received.");
        System.out.println("========================");
        System.out.println(response.getHttpVersion().text() + ' ' + response.getStatus().code()
                + ' ' + response.getStatus().reasonPhrase());
        for (Map.Entry<String, String> header : response.getHeaders().entries()) {
            System.out.println(header.getKey() + ": " + header.getValue());
        }
    }

    public static void main (String...args){
        // clear the clinical attribute cache
        CbioDataServiceController controller = new CbioDataServiceController();
        try {
            controller.sendResetRequest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}
