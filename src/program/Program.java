package program;

import java.util.List;

import model.Mahasiswa;
import service.MysqlMahasiswaService;

public class Program {

    static MysqlMahasiswaService service =
            new MysqlMahasiswaService();

    public static void main(String[] args) {

        displayAll();

        // INSERT
        System.out.println("=== INSERT ===");

        Mahasiswa m =
                new Mahasiswa(1, "Budi");

        service.add(m);

        displayAll();

        // UPDATE
        System.out.println("=== UPDATE ===");

        Mahasiswa update =
                service.getById(1);

        System.out.println(
                "Data lama : " + update
        );

        update.setNama("Andi");

        service.update(update);

        displayAll();

        // DELETE
        System.out.println("=== DELETE ===");

        service.delete(1);

        displayAll();
    }

    public static void displayAll() {

        List<Mahasiswa> list =
                service.getAll();

        for (Mahasiswa m : list) {

            System.out.println(m);
        }

        System.out.println();
    }
}