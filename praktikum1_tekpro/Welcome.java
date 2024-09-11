public class Welcome 
{
    // Deklrasi fungsi main/utama
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!"; // Inisiasi variabel bertipe string
        System.out.println(greeting); // Operasi write/cetak ke layar

        // Perulangan untuk mencetak "=" sebanyak panjang dari varibel greeting
        for (int i = 0; i < greeting.length(); i++)
	        System.out.print("=");

        // Mencetak baris baru
        System.out.println();
    }
}