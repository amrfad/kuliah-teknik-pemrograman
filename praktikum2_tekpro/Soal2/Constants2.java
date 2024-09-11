package Soal2;

public class Constants2 {
    // penggunaan static untuk menggunakan variabel tanpa perlu instansiasi
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        System.out.println(Constants2.CM_PER_INCH);
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
