public class Soal2
{
    // Deklrasi fungsi main/utama
    public static void main(String[] args)
    {
        int i = 42;
        // Ternary operator yang merupakan bentuk sederhana dari if-else statement
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s); // output: "everything", karena nilai i lebih dari 40 dan kurang dari 50
    }
}