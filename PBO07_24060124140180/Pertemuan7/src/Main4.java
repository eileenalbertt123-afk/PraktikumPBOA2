/*
Nama: Eileen Albert Tandrio
NIM : 24060124140180
Tanggal: 20 April 2026
Keterangan: No 4
 */

//a. kelas induk
class civitasAkademika {
    //atribut 
    String Nama;

    //method
    String getNomor(){
        return "";
    }

    String getNama(){
        return Nama;
    }
}

class Dosen extends civitasAkademika {
    //atribut
    String NIP;

    //method
     Dosen(String nama, String NIP) {
        this.Nama = nama;
        this.NIP = NIP;
    }

    @Override
    String getNomor(){
        return this.NIP;
    }
}

// Mahasiswa2 digunakan untuk menghindari konflik dengan class Mahasiswa di file lain
class Mahasiswa2 extends civitasAkademika{
    //atribut
    String NIM;
    Dosen DosenWali;

    //Method
    @Override
    String getNomor(){
        return this.NIM;
    }

    Mahasiswa2(String nama, String NIM) {
        this.Nama = nama;
        this.NIM = NIM;
    }

    //i. prosedur setWali untuk mengubah isian komponen dosenwali dengan parameter input dosen
    void setWali(Dosen d){
        this.DosenWali = d;
    }

    //j. prosedur tampilDataMahasiswa untuk menampilkan data NIM, nama mahasiswa dan nama dosen wali
    void tampilDataMahasiswa(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Dosen Wali: " + DosenWali.getNama());
        System.out.println("------------------");
    }
}

//b. kelas seminar
class Seminar{
    //atribut
    civitasAkademika[] pesertas;
    int banyakPeserta;

    //method
    Seminar(){
        pesertas = new civitasAkademika[100];
        banyakPeserta = 0;
    }

    //c. fungsi countPeserta untuk menghitung banyaknya peserta seminar
    int countPeserta(){
        return banyakPeserta;
    }

    //d. prosedur registrasi untuk menambahkan seorang peserta 
    void registrasi (civitasAkademika cv){
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = cv;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas sudah penuh");
        }
    } 

    //g. prosedur tampilPeserta  untuk menampilkan daftar Nomor dan Nama semua peserta seminar
    void tampilPeserta(){
        for (int i = 0; i < banyakPeserta; i++){
            System.out.println("Nomor:" + pesertas[i].getNomor() + "--"+ "Nama: " + pesertas[i].getNama());
        }
    }

    //h. fungsi countMahasiswa untuk menghitung banyaknya peserta mahasiswa
    int countMahasiswa(){
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++){
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}

// main
public class Main4 {
    public static void main(String[] args) {

        Seminar s = new Seminar();

        // e. buat 2 dosen
        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        // e. buat 5 mahasiswa
        Mahasiswa2 m1 = new Mahasiswa2("Andi", "M001");
        Mahasiswa2 m2 = new Mahasiswa2("Budi", "M002");
        Mahasiswa2 m3 = new Mahasiswa2("Citra", "M003");
        Mahasiswa2 m4 = new Mahasiswa2("Dina", "M004");
        Mahasiswa2 m5 = new Mahasiswa2("Eka", "M005");

        // i. set dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // f. registrasi semua peserta
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // c. tampil jumlah peserta
        System.out.println("Jumlah peserta: " + s.countPeserta());

        // g. tampil semua peserta
        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        // h. jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa: " + s.countMahasiswa());

        // j. tampil data mahasiswa
        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
