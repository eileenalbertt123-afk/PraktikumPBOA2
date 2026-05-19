// kelas generik Datum
public class Datum<T> {
    // atribut
    private T isi;

    // method
    // mengembalikan nilai isi datum
    public T getIsi() {
        return isi;
    }

    // mengubah isi datum menjadi isi baru
    public void setIsi(T a) {
        this.isi = a;
    }
}