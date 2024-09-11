import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B  = sc.nextLine();

        // Menghitung panjang string A + string B
        System.out.println(A.length() + B.length());
        
        // Menentukan apakah string A lebih kecil dari string B secara leksikografikal
        if (A.compareTo(B) < 0){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // Mengkapitalisasi suatu string
        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.println(A + " " + B);

        sc.close();
    }
}
