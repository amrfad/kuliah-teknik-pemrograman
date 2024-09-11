public class DVDFilm extends DVD 
{
    private String pemeran;
    private String sutradara;
    
    // Constructor
    public DVDFilm(String judul, String pemeran, String sutradara, String publisher, String kategori, int stok) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
    }
    
    // Getter dan Setter
    public String getPemeran() {
        return pemeran;
    }

    public void setPemeran(String pemeran) {
        this.pemeran = pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    // Menunjukkan informasi dari DVD
    @Override
    public void showInfo() {
        System.out.println("INFORMASI FILM");
        super.showInfo();
        System.out.println("Pemeran \t: " + getPemeran());
        System.out.println("Sutradara\t: " + getSutradara());
        System.out.print("\n");
    }
}