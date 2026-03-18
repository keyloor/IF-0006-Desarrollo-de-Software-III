public class Box<T> {
    private T value;

    public void save(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}