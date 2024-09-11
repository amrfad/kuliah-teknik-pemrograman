public class Soal1
{
    // Deklrasi fungsi main/utama
    public static void main(String[] args)
    {
        // Deklarasi variabel bertipe byte
        byte angka1 = 125; 
        byte angka2 = 6;

         // Menambahkan variabel angka1 dan angka2, hasilnya di-casting menjadi byte
        byte hasil = (byte) (angka1 + angka2);
        
        // Mencetak nilai dari variabel hasil
        System.out.println("Hasil: " + hasil);
    }
}