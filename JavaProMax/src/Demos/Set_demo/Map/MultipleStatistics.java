package Demos.Set_demo.Map;

import java.util.*;

public class MultipleStatistics {
    public static void main(String[] args) {

        Map<Integer, List<String>> data = new HashMap<>();

        Random random = new Random();
        String[] choice = {"A","B","C","D"};
        for (int i = 0; i < 100; i++) {
            List<String> selects = new ArrayList<>();
            for (int j = 0; j < random.nextInt(4)+1; j++) {
                int n =random.nextInt(choice.length);
                if(selects.contains(choice[n])){
                    continue;
                }else {
                    selects.add(choice[n]);
                }
            }
            data.put(i,selects);
        }

        System.out.println(data);

        Map<String,Integer>infos =new HashMap<>();

        Collection<List<String>> values =data.values();

        for (List<String> value : values) {
            for (String s : value) {
                if(infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else {
                    infos.put(s,1);
                }
            }
        }
        System.out.println(infos);

    }
}
