package lesson14;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {

        Map<String, Integer> emploeeAges = new HashMap<>();
        emploeeAges.put("Jhon",50);
        emploeeAges.put("Alex",35);
        emploeeAges.put("Tom",45);

//        получаем значение по ключу
        System.out.println(emploeeAges.get("Jhon"));

// посчитать сколько раз встречается каждый символ
        String string = "546446464gldnjbdfhkbhbjkbsdbkdjbjkdvb";
        Map<Character, Integer> result = new HashMap<>();
        for (char c : string.toCharArray()){
            int count;
            if (result.get(c) == null){
                count = 1;
            }else {
                count = result.get(c) + 1;
            }
            result.put(c,count);
        }
        System.out.println(result);

    }
}
