import java.util.HashMap;
import java.util.Map;

public class Tugas {
    public static void main(String[] args){
        Map<String,String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2495839032", "Elen");
        mahasiswaMap.put("2538714612","Cici");
        mahasiswaMap.forEach((nim,nama) -> {System.out.println("Nim: " + nim +", Nama: " + nama);});

    }
}
