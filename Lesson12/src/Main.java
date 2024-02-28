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


    }
}