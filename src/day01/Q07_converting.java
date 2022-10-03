package day01;

public class Q07_converting {
    /*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   //  Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
   // formül
   // c = (f-32)*5/9
*/
    public static void main(String[] args) {

        int gallon = 1000;
        double liters = gallon*3.785;
        String result1 = gallon + "gallon değeri" + liters+ "litredir";
        System.out.println("result1 = " + result1);

        double litre = 100;
        double galon = litre/3.785;
        String result2 = litre + "litre değeri" + galon + "a eşittir";
        System.out.println("result2 = " + result2);

        double fahrenhayt = 100;
        double celcius = (fahrenhayt-32)*5/9;
        System.out.println("celcius = " + celcius);

        double fahri = 100;
        double cemil = (fahri-32)*5/9;
        System.out.println((int)(cemil*100)/100.0);












    }









}
