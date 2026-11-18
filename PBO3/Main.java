package PBO3;

/** Program utama Latihan 3: menggunakan Cell<Integer> dan Cell<String>. */
public class Main {
    public static void main(String[] args) {
        Cell<Integer> integerCell = new Cell<>(100);
        Cell<String> stringCell = new Cell<>("Belajar Generic Java");

        System.out.println("Nilai integer: " + integerCell.getValue());
        integerCell.displayType();

        System.out.println("Nilai string: " + stringCell.getValue());
        stringCell.displayType();

        System.out.println("Keuntungan generic: tipe nilai diperiksa saat kompilasi,");
        System.out.println("sehingga kesalahan tipe lebih mudah diketahui dan casting dapat dikurangi.");
    }
}
