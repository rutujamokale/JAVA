package com.tap.assessment.Entity;

import java.util.HashMap;
import java.util.Map;

public class IOCContainer {
    private static Map<Class<?>, Object> beans = new HashMap<>();

    static {
        beans.put(SubjectService.class, new SubjectServiceImpl());
    }

    public static <T> T getBean(Class<T> clazz) {
        return clazz.cast(beans.get(clazz));
    }
}
