public class Box<T> {
    private T item;

    public void putItem(T item) {
        this.item = item;
        System.out.println("Item placed in the box: " + item);
    }
    public void deleteItem(){
        this.item = null;
    }
    public T getItem() {
        return item;
    }
}
