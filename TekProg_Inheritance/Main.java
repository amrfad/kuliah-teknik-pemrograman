public class Main 
{
    public static void main(String[] args)
    {
        DVDAlbum[] albums = new DVDAlbum[3];
        albums[0] = new DVDAlbum("The Black Parade", "My Chemical Romance", "Rob Cavalo", "Reprise Records", "Welcome To The Black Parade", "R", 2374);
        albums[0].showInfo();

        DVDFilm[] films = new DVDFilm[3];
        films[0] = new DVDFilm("Interstellar", "Matthew McConaughey, Anne Hathaway, Jessica Chastain", "Christopher Nolan", "Warner Bros. Pictures", "SU", 192);
        films[0].showInfo();

        System.out.println("Stok DVD sebelum dipinjam: " + films[0].getStok());
        films[0].rentOut();
        System.out.println("Stok DVD setelah dipinjam: " + films[0].getStok());
    }
}
