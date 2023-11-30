package cerney.annotation.basic;

import java.util.HashMap;
import java.util.Map;

public class SuppressWarningsTest {
    public static void main(String[] args) {
        Map map = new SuppressWarningsTest().testSuppressWarnings();
        System.out.println(map);
    }

    private Map testSuppressWarnings() {
        Map nonGenericMap = new HashMap<>();
        nonGenericMap.put("key-1", "value-1");
        nonGenericMap.put("key-2", "value-2");
        nonGenericMap.put("key-3", "value-3");

        return nonGenericMap;
    }
}