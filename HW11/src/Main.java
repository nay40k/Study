public class Main {
    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>(2);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("Stack size: " + intStack.size());

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack);

        Stack<String> stringStack = new Stack<>(2);
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Kitty");


        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack);
        stringStack.push("Hero");
        System.out.println(stringStack);

        MaxStack maxStack = new MaxStack(2);
        maxStack.push(8);
        maxStack.push(7);
        maxStack.push(6);
        System.out.println(maxStack);

        do {
            System.out.printf("Current max %d, current top %d\n", maxStack.max(), maxStack.pop());
        } while (!maxStack.isEmpty());

        System.out.println(maxStack);

        maxStack.push(40);
        maxStack.push(41);
        maxStack.push(42);
        maxStack.push(443);
        System.out.println(maxStack);

        do {
            System.out.printf("Current max %d, current top %d\n", maxStack.max(), maxStack.pop());
        } while (!maxStack.isEmpty());
        System.out.println(maxStack);

        System.out.printf("Current max %d, current top %d\n", maxStack.max(), maxStack.pop());

        maxStack.push(24);
        System.out.println(maxStack);

    }
}