/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 4 Mei 2026
Keterangan: No 2 (Koleksi Kelas Bentukan)
 */
import java.util.LinkedList;
import java.util.Queue;

class Piaraan {
    // atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // method
    // konstruktor
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // getNbelm()
    public int getNbelm(){
        return nbelm;
    }

    // enqueue Anabul(anabul) -> menambah elemen terakhir
    public void enqueueAnabul (Anabul a){
        Lanabul.add(a);
        nbelm++;
    }

    // isMember(anabul)
    public boolean isMember (Anabul a){
        return Lanabul.contains(a);
    }

    // getAnabul()
    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    // dequeueAnabul()
    public void dequeueAnabul(){
        Lanabul.poll();
    }

    // c. showAnabul
    public void showAnabul(){
        System.out.println("Daftar Anabul: ");
        for (Anabul n : Lanabul){
            System.out.println(n.getNama());
        }
    }

    // d.countKucing
    public int countKucing(){
        int count = 0;
        for (Anabul n : Lanabul){
            if (n instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing
    public double bobotKucing(){
        double total = 0.0;
        for (Anabul n : Lanabul){
            if (n instanceof Kucing){
                total = total + ((Kucing)n).getBobot();
            }
        }
        return total;
    } 

    // f. showJenisAnabul
    public void showJenisAnabul(){
        System.out.println("Daftar Jenis Anabul: ");

        for (Anabul n : Lanabul){
            System.out.println( n.getNama() + "||" + n.getClass().getName());
        }
    }
}

public class Main2 {
    public static void main(String[] args) {

        // membuat objek piaraan
        Piaraan p = new Piaraan();

        // membuat beberapa anabul
        Kucing k1 = new Kucing("Milo", 4.5);
        Kucing k2 = new Kucing("Mimi", 3.2);
        Anjing a1 = new Anjing("Bruno");
        Burung b1 = new Burung("Ciki");

        // enqueue ke antrean
        p.enqueueAnabul(k1);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(b1);

        // a & b
        System.out.println("Jumlah elemen : " + p.getNbelm());

        // c
        p.showAnabul();

        // d
        System.out.println("\nJumlah keluarga kucing : "
                + p.countKucing());

        // e
        System.out.println("Total bobot kucing : "
                + p.bobotKucing());

        // f
        System.out.println();
        p.showJenisAnabul();

        // getAnabul
        System.out.println("\nAnabul pertama : "
                + p.getAnabul().getNama());

        // isMember
        System.out.println("Apakah Milo ada? "
                + p.isMember(k1));

        // dequeue
        p.dequeueAnabul();
        System.out.println("\nSetelah dequeue:");
        p.showAnabul();
    }
}