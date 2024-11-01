package org.ryuu.util;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.ryuu.util.NullOrEmptyUtils.*;

class NullOrEmptyUtilsTest {
    @Test
    void isNullOrEmptyString() {
        boolean isNullOrEmpty;

        String nullString = null;
        isNullOrEmpty = isNullOrEmpty(nullString);
        assertTrue(isNullOrEmpty);

        String emptyString = "";
        isNullOrEmpty = isNullOrEmpty(emptyString);
        assertTrue(isNullOrEmpty);

        String notEmptyString = " ";
        isNullOrEmpty = isNullOrEmpty(notEmptyString);
        assertFalse(isNullOrEmpty);
    }

    @Test
    void isNullOrEmptyCollection() {
        boolean isNullOrEmpty;

        isNullOrEmpty = isNullOrEmpty(new HashSet<>());
        assertTrue(isNullOrEmpty);

        Set<Object> set = new HashSet<>();
        set.add(new Object());
        isNullOrEmpty = isNullOrEmpty(set);
        assertFalse(isNullOrEmpty);

        isNullOrEmpty = isNullOrEmpty(new ArrayList<>());
        assertTrue(isNullOrEmpty);

        List<Object> list = new ArrayList<>();
        list.add(new Object());
        isNullOrEmpty = isNullOrEmpty(list);
        assertFalse(isNullOrEmpty);
    }

    @Test
    void isNullOrEmptyArray() {
        boolean isNullOrEmpty;

        Object[] emptyArray = new Object[0];
        isNullOrEmpty = isNullOrEmpty(emptyArray);
        assertTrue(isNullOrEmpty);

        Object[] array = new Object[]{new Object()};
        isNullOrEmpty = isNullOrEmpty(array);
        assertFalse(isNullOrEmpty);
    }

    @Test
    void isNullOrEmptyMap() {
        boolean isNullOrEmpty;

        Map<Object, Object> emptyMap = new HashMap<>();
        isNullOrEmpty = isNullOrEmpty(emptyMap);
        assertTrue(isNullOrEmpty);

        Map<Object, Object> map = new HashMap<>();
        map.put(new Object(), new Object());
        isNullOrEmpty = isNullOrEmpty(map);
        assertFalse(isNullOrEmpty);
    }
}
