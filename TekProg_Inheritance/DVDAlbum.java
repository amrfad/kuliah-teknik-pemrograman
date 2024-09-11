public class DVDAlbum extends DVD 
{
    private String penyanyi;
    private String produser;
    private String topSong;
    
    // Constructor
    public DVDAlbum(String judul, String penyanyi, String produser, String publisher, String topSong,  String kategori, int stok) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topSong = topSong;
    }

    // Getter and Setter
    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String getTopSong() {
        return topSong;
    }

    public void setTopSong(String topSong) {
        this.topSong = topSong;
    }
    
    // Menunjukkan informasi dari DVD
    @Override
    public void showInfo() {
        System.out.println("INFORMASI ALBUM");
        super.showInfo();
        System.out.println("Penyanyi\t: " + getPenyanyi());
        System.out.println("Produser\t: " + getProduser());
        System.out.println("Top Song\t: " + getTopSong());
        System.out.print("\n");
    }

}
