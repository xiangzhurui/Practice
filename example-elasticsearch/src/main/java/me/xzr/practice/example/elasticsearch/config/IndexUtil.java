package me.xzr.practice.example.elasticsearch.config;

import com.google.gson.JsonObject;

public interface IndexUtil {
    /**
     * 创建索引
     */
    JsonObject putIndex(String index);

    JsonObject delete(String index);

}
