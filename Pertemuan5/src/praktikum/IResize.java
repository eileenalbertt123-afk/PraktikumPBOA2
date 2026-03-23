/*
Nama File   : IResize.java
Deskripsi   : Interface IResize
Pembuat     : Eileen 24060124140180
Tanggal     : 9 Maret 2026
*/

package praktikum;

public interface IResize {

    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();
    
    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
} //end interface IResize


