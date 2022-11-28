package StudentCodeChallenge.Ebubekir;

import java.util.Scanner;

public class Calculater {

    double x;
    double y;
    char secim;


    public Calculater(double x, double y, char secim) {
        this.x = x;
        this.y = y;
        this.secim = secim;
    }

    public Calculater() {
    }
    public double toplam (double x, double y){

        return (x+y);
    }
    public double cıkar(double x, double y){

        return (x-y);
    }
    public double carp (double x, double y){

        return (x*y);
    }
    public double bölme (double x, double y){

        return (x/y);
    }
    public void baslangic(){
     Scanner scan = new Scanner(System.in);
        System.out.println("yapmak istediğiniz işlemi seçin\n--->+,/,*,-");
        char secim= scan.next().charAt(0);
        System.out.println("işlem yapmak istediğniiz sayılıarı sırayla girin");
     x= scan.nextDouble();
     y= scan.nextDouble();
     islem();

    }
    public void  islem (){
        switch (secim){
            case '+' :
                System.out.println(x+"+"+"y"+" = "+toplam(x,y));
                break;
            case '-' :
                System.out.println(x+"-"+"y"+" = "+cıkar(x,y));
                break;
            case '/' :
                System.out.println(x+"/"+"y"+" = "+bölme(x,y));
                break;
            case '*' :
                System.out.println(x+"*"+"y"+" = "+carp(x,y));
                break;
        }
    }

}
