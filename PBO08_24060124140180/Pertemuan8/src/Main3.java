/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 27 April 2026
Keterangan: LARIK GENERIK (no 4)
 */

class Data<T> {
    // atribut
    T[] ruang;
    int banyak;

    // method
    // konstruktor
    Data(){
        ruang = (T[]) new Object[100]; // array generik
        banyak = 0;
    }

    //mengembalikan isi data
    public T getIsi (int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];
        } else {
            System.out.println("Posisi tidak valid");
            return null;
        }
    }

    // mengubah isi data menjadi isi baru
    public void setIsi(int posisi, T isi) {
        if (posisi >= 1 && posisi <= 100){
            ruang [posisi-1] = isi;
            if (posisi > banyak) {
                banyak = posisi;
            }
        } else {
          System.out.println("Posisi tidak valid");
        }
    }

    //mengembalikan banyak elemen
    public int getSize(){
        return banyak;
    }
}

public class Main3 {
    public static void main(String[] args) {
    //objek data untuk anabul
    Data<Anabul> A1 = new Data<>();

    //b. set isi
    A1.setIsi(1,new Anjing());
    A1.setIsi(2,new Kucing());
    A1.setIsi(3,new Burung());

    //c.get isi
    System.out.println("Isi posisi 1:");
    A1.getIsi(1).suara();
    System.out.println("Isi posisi 2:");
    A1.getIsi(2).suara();
    System.out.println("Isi posisi 3:");
    A1.getIsi(3).suara();

    //d.getSize
    System.out.println("Jumlah elemen: " + A1.getSize());
    }  
}
