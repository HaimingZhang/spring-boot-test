package com.hemming.daily.test;

import com.google.common.collect.Lists;
import okhttp3.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestOkClient {

    public static void main(String[] args) throws IOException {
        TestOkClient client = new TestOkClient();
        List<Integer> list = Lists.newArrayList(6001, 6009, 6017, 6025, 6033, 6041, 6049, 6057);
        System.out.println(list);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 3, TimeUnit.SECONDS, new LinkedBlockingDeque<>(10));
        for (Integer integer : list) {
            threadPoolExecutor.submit(() -> {
                try {
                    client.sendReq(integer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

    }


    private void sendReq(Integer integer) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        String content = "{\n \"method\":\"unlockById\",\n \"iface\":\"me.ele.commodity.soa.SkuLockService\",\n    \"ver\":\"1.0.0\",\n    \"reqId\":\"17F9A25016554A18927DCBA504E3F7E7|1544867708877\",\n    \"soa\":{\n      \"req\":\"\",\n      \"rpc\":\"\"\n    },\n    \"context\":{\"routing-key\":\"shardid=1\"},\n    \"args\":{\n        \"lockId\":%s,\n        \"operatorDTO\":\"{\\\"id\\\":2147643625,\\\"type\\\":\\\"SYSTEM\\\"}\"\n    }\n}";
        content = String.format(content, integer);
        RequestBody body = RequestBody.create(mediaType, content);
        Request request = new Request.Builder()
                .url("http://10.3.5.152:10800/rpc")
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "27ce9d34-cf4b-bf79-9505-9ad361a95736")
                .build();

        Response response = client.newCall(request).execute();
    }


}
