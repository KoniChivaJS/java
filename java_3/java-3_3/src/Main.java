public class Main {

    public static <T extends Comparable<T>> T findMax(T[] arr){
        T max = arr[0];
        for(T element : arr){
            if(element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.putItem("Hello Wordl!");
        System.out.println("String box: " + stringBox.getItem());
        stringBox.deleteItem();
        System.out.println("String box: " + stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.putItem(911);
        System.out.println("Integer box: " + integerBox.getItem());


        System.out.println("TASK 4");
        Integer[] intArr = {1,5,777,3,2};
        System.out.println("Max int: " + findMax(intArr));

        Double[] doubleArr = {1.2,9.0,55.2,86.1};
        System.out.println("Max double: " + findMax(doubleArr));

    }
}