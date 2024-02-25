public class Box<T> {
    private T item;
    public Box() {}

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    public static <K extends Number> String doSmth(K value, String strValue) {
        return value.intValue() + " " + strValue;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("16");
        String item = box.getItem();
        System.out.println(item);

        Box<Integer> intBox = new Box<>();
        intBox.setItem(5);
        int num = intBox.getItem();
        System.out.println(num);

        System.out.println(Box.doSmth(5f,"hello"));
        System.out.println(Box.doSmth(5D,"hello"));

    }
}