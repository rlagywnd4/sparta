package org.example.week02;

import java.util.*;

public class assignment {
    public static void main(String[] args) {

        List<String> listStorage = new ArrayList<>();
        Set<String> setStorage = new HashSet<>();
        Map<Integer, String> mapStorage = new HashMap<>();

        int circuitKey = 1;

        Scanner sc = new Scanner(System.in);
        String dataStructure = sc.nextLine();

        String title = sc.nextLine();

        if (dataStructure == "List") {
            while (true) {
                String content = sc.nextLine();
                if (content.equals("끝")) {
                    break;
                }
                listStorage.add(content);
            }
        } else if (dataStructure == "Set") {
            while (true) {
                String content = sc.nextLine();
                if (content.equals("끝")) {
                    break;
                }
                setStorage.add(circuitKey + ". " +content);
                circuitKey++;
            }
        } else {
            while (true) {
                String content = sc.nextLine();
                if (content.equals("끝")) {
                    break;
                }
            mapStorage.put(circuitKey, content);
            circuitKey++;
            }
        }

        System.out.println("[ " + dataStructure + "으로 저장된 " + title + " ]");
        if (dataStructure == "List") {
                for (int i = 0; i < listStorage.size(); i++) {
                    System.out.println((i + 1) + ". " + listStorage.get(i));
                }
        } else if (dataStructure == "Set") {
                for (int i = 1; i <= setStorage.size(); i++) {
                    System.out.println(setStorage.contains(i + ". "));
                }
        } else {
                for(int i = 1; i <= mapStorage.size(); i++) {
                    System.out.println(i + ". " + mapStorage.get(i));
                }
        }

    }
}
