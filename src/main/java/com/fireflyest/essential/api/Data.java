package com.fireflyest.essential.api;

import java.util.List;

public interface Data {

    void createTable(Class<?> clazz);
    
    List<Object> query(Class<?> clazz);

    List<Object> query(Class<?> clazz, String condition);

    List<Object> query(Class<?> clazz, String key, Object value);

    Object queryOne(Class<?> clazz, String key, Object value);

    List<Object> query(Class<?> clazz, int start, int amount);

    List<Object> query(Class<?> clazz, String condition, int start, int amount);

    List<Object> query(Class<?> clazz, String key, Object value, int start, int amount);

    void update(Object o);

    void delete(Class<?> clazz, String key, Object value);

    void delete(Class<?> clazz, String condition);

    void delete(Object obj);

    int insert(Object obj);
}
