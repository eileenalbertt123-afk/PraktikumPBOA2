/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 20 April 2026
Keterangan: No 2
 */

class Mahasiswa {
    //atribut
    String NIM;
    String Nama;
    String ProgramStudi;

    //c. konstruktor tanpa parameter dengan default NIM=-999, Nama="n/a", dan Programstudi="n/a"
    Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    //d. konstruktor  dengan tiga buah parameter yang menghasilkan objek dengan nilai-nilai komponen sesuai parameter input 
    Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    //e.  konstruktor Mahasiswa dengan satu parameter objek Mahasiswa lain, yang menghasilkan objek hasil ‘kloning’ objek Mahasiswa input
    Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    //a. realisasi kelas mahasiswa dengan operator setProgramStudi

    // tanpa parameter
    void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // dengan String
    void setProgramStudi(String a) {
        this.ProgramStudi = a;
    }

    // dengan objek Mahasiswa
    void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.ProgramStudi;
    }

    // menampilkan detail mahasiswa
    void tampil() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + ProgramStudi);
    }
}

//b. contoh aplikasi kelas Mahasiswa
public class Main2 {
    public static void main(String[] args) {

        // konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        m1.tampil();

        // konstruktor 3 parameter
        Mahasiswa m2 = new Mahasiswa("123", "Budi", "Informatika");
        m2.tampil();

        // konstruktor cloning
        Mahasiswa m3 = new Mahasiswa(m2);
        m3.tampil();

        //penggunaan setProgramStudi

        // tanpa parameter
        m1.setProgramStudi();
        m1.tampil();

        // dengan String
        m1.setProgramStudi("Sistem Informasi");
        m1.tampil();

        // dengan objek Mahasiswa
        m1.setProgramStudi(m2);
        m1.tampil();
    }
}
