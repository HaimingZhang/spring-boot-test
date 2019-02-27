package com.hemming.daily.test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JsonTest {


    private static ObjectMapper mapper;

    private static SimpleModule module;

    static {
        mapper = new ObjectMapper();
        module = new SimpleModule();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(module);
    }


    public static void main(String[] args) {
//        String jsonStr = "{\"a\":[1,2],\"b\":[3,4]}";
//        try {
//            Map<String, List<Long>> map = mapper.readValue(jsonStr, Map.class);
//
//            Map<String, List<Long>> map1 = mapper.readValue(jsonStr, new TypeReference<Map<String, List<Long>>>() {
//            });
//            System.out.println(map);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        List<Integer> itemIds = Lists.newArrayList();
        for (int i = 0; i < 5; i++) {
            itemIds.add(i);
        }

        List<List<Integer>> partition = Lists.partition(itemIds, 2);
        List<Integer> collect = partition.stream().flatMap(Collection::stream).collect(Collectors.toList());


    }
}
