public class DVD 
{
    private String judul;
    private String publisher;
    private String kategori;
    private int stok;
    
    // Constructor
    public DVD(String judul, String publisher, String kategori, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }
    
    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    // Menunjukkan informasi dari DVD
    public void showInfo() {
        System.out.println("Judul   \t: " + judul);
        System.out.println("Publisher\t: " + publisher);
        System.out.println("Kategori\t: " + kategori);
        System.out.println("Stok    \t: " + stok);
    }

    public void rentOut() {
        this.stok--;
    }

    public void returnRent() {
        this.stok++;
    }
}