package lesson5;

import java.util.HashMap;

public class task {
    public static void main(String[] args) {

        HashMap<Integer, String> heroes = new HashMap<>();
        heroes.put(4, "Сидоров");
        heroes.put(8, "Петров");
        heroes.put(16, "Иванов");
        heroes.put(32, "Захаров");
        heroes.put(64, "Птичкин");
        heroes.put(128, "Ручкин");
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(heroes);

        heroes.computeIfPresent(4, (k, v) -> v + '!');
        heroes.computeIfPresent(8, (k, v) -> v + '!');
        heroes.computeIfPresent(16, (k, v) -> v + '!');
        heroes.computeIfPresent(32, (k, v) -> v + '!');
        heroes.computeIfPresent(64, (k, v) -> v + '!');
        heroes.computeIfPresent(128, (k, v) -> v + '!');
        System.out.println(heroes);
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(heroes);

        HashMap<Integer, String> heroesSec = new HashMap<>();
        heroesSec.put(2, "Петр");
        heroesSec.put(1, "Василий");
        heroesSec.put(16, "Александр");
        heroesSec.put(8, "Тимофей");
        heroesSec.put(4, "Захар");
        heroesSec.put(6, "Станислав");
        System.out.println(heroesSec);

        for (Integer item : heroes.keySet()) {
            heroes.merge(item, heroesSec.getOrDefault(item, ""), (newVal, tempVal) -> newVal + tempVal);
        }
        System.out.println(heroes);
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
    }
    
}
