package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 70);
        studentMap.put("studentD", 60);
        studentMap.put("studentE", 50);

        System.out.println("studentMap = " + studentMap);

        System.out.println("studentMap.get('studentD') = " + studentMap.get("studentD"));
        System.out.println("studentMap.getOrDefault('studentG') = " + studentMap.getOrDefault("studentG", 100));
        System.out.println("studentMap = " + studentMap);

        studentMap.putIfAbsent("studentA", 1000); // key 에 연결된 value 가 없으면 저장, 있으면 update X
        System.out.println("studentMap = " + studentMap);

        Set<String> keySet = studentMap.keySet(); // key 는 중복 X, 순서 보장 X
        System.out.println("keySet = " + keySet);
        Collection<Integer> values = studentMap.values();
        System.out.println("values = " + values);
    }
}
