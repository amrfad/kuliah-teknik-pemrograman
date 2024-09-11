package Soal2;

public class Constants 
{
    public static void main(String[] args)
    { 
        // konstanta untuk convert inch ke cm
        final double CM_PER_INCH = 2.54;

        // Ukuran dari kertas dalam satuan inch
        double paperWidth = 8.5;
        double paperHeight = 11;
        
        System.out.println("Paper size in centimeters: " +paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
