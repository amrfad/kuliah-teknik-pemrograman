import java.math.BigInteger;
import java.util.Scanner;

public class Soal1
{
    public static void main(String[] args)
    {
        // Menerima input untuk banyaknya test case
        int T;
        System.out.print("Berapa banyak data yang ingin diuji: ");
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        
        // Menerima nilai-nilai dan menyimpannya ke array
        BigInteger[] arr = new BigInteger[T];
        for (int i = 0; i < T; i++){
            System.out.print("data ke-"+i+": ");
            arr[i] = sc.nextBigInteger();
        }

        // Menguji nilai bisa ditempatkan di tipe data mana saja
        for (int i = 0; i < T; i++){
            // Jika tidak bisa ditempatkan di mana pun
            if (arr[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || arr[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0){
                System.out.println(arr[i] + " can't be fitted anywhere.");
            } else {
                System.out.println(arr[i] + " can be fitted in:");
                // Jika bisa ditempatkan di Byte
                if (arr[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && arr[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0){
                    System.out.println("* byte");
                }
                // Jika bisa ditempatkan di short
                if (arr[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && arr[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0){
                    System.out.println("* short");
                }
                // Jika bisa ditempatkan di integer
                if (arr[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && arr[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0){
                    System.out.println("* interger");
                } 
                // Jika bisa ditempatkan di Long
                if (arr[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && arr[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0){
                    System.out.println("* long");
                } 
            }
        }
        // Menutup scanner
        sc.close();
    }
}