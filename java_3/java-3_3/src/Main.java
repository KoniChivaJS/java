public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.putItem("Hello Wordl!");
        System.out.println("String box: " + stringBox.getItem());
        stringBox.deleteItem();
        System.out.println("String box: " + stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.putItem(911);
        System.out.println("Integer box: " + integerBox.getItem());

    }
}