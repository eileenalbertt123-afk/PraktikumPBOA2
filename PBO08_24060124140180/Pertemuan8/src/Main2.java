/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 27 April 2026
Keterangan: GENERIK PADA OPERATOR (no 3)
 */

class OperatorGenerik {
    //prosedur menukarkan nilai kedua masukan
    <T> void Tukar(Datum<T> input1, Datum<T> input2){
        T temp = input1.getIsi();
        input1.setIsi(input2.getIsi());
        input2.setIsi(temp);
    }

    //fungsi generik yang menerima masukan 2 objek keturunan kucing lalu mengembalikan jumlah bobot keduanya
    <T extends Kucing> double Bobot2(Datum<T> k1, Datum<T> k2){
        return k1.getIsi().bobot + k2.getIsi().bobot;

    }
}

public class Main2 {
    public static void main(String[] args) {
        //Integer
        Datum<Integer> i1 = new Datum<>();
        Datum<Integer> i2 = new Datum<>();
        i1.setIsi(209);
        i2.setIsi(103);
        System.out.println("Sebelum Tukar i1: " + i1.getIsi() + ", i2: " + i2.getIsi());
        OperatorGenerik OG = new OperatorGenerik();
        OG.Tukar(i1,i2);
        System.out.println("Setelah Tukar i1: " + i1.getIsi() + ", i2: " + i2.getIsi());
        
        //String
        Datum<String> s1 = new Datum<>();
        Datum<String> s2 = new Datum<>();
        s1.setIsi("A");
        s2.setIsi("B");
        System.out.println("Sebelum Tukar s1: " + s1.getIsi() + ", s2: " + s2.getIsi());
        OG.Tukar(s1,s2);
        System.out.println("Setelah Tukar s1: " + s1.getIsi() + ", s2: " + s2.getIsi());

        //Anabul
        Datum<Anabul> a1 = new Datum<>();
        Datum<Anabul> a2 = new Datum<>();
        a1.setIsi(new Kucing());
        a2.setIsi(new Anjing());
        System.out.println("Sebelum Tukar");
        a1.getIsi().suara();
        a2.getIsi().suara();
        OG.Tukar(a1,a2);
        System.out.println("Setelah Tukar");
        a1.getIsi().suara();
        a2.getIsi().suara();
}
}