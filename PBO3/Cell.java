package PBO3;

/** Generic cell yang dapat menyimpan satu nilai dengan tipe tertentu. */
public class Cell<T> {
    private T data;

    public Cell(T data) {
        this.data = data;
    }

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        if (data == null) {
            System.out.println("Tipe data: belum ada nilai (null)");
        } else {
            System.out.println("Tipe data: " + data.getClass().getSimpleName());
        }
    }
}
