import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // List<String> list = new LinkedList<>(); можно легко подменитьреализацию списка
        list.add("Moscow");
        list.add("Berlin");
        list.add("Tokyo");
        System.out.println("Cities: " + list);
        list.add(1, "Barcelona");
        list.add(3, "Minsk");
        System.out.println("Cities: " + list);
        list.remove(2);
        System.out.println("Cities: " + list);
        System.out.println("First city is " + list.get(0));
        System.out.println("All cities: " + list.size());

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Peach");
        fruits.add("Apricot");
        fruits.add("Apple");

        System.out.print("All fruits: ");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


        Map<String, Integer> map = new HashMap<>();
        // HashMap<String, Integer> map = new TreeMap<>();
        map.put("A", 6);
        map.put("A-", 2);
        map.put("B", 9);
        System.out.println(map);
        map.putIfAbsent("C", 7);
        map.putIfAbsent("B", 11);
        System.out.println(map);
        System.out.println("F=" + map.get("F"));
        System.out.println(map.containsKey("C"));

        System.out.println("-----------------------------");
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry);
        }
        for (String k : map.keySet()) {
            System.out.println(k + "=" + map.get(k));
        }


    }
}