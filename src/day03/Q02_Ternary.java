package day03;

public class Q02_Ternary {
    public static void main(String[] args) {
        /*
        Ternary kullanarak bir kod yazın fiyat isiminde bir variable tanımlayın eger fiyat 10 dan az ise 'ucuz
        ' 10 ile 20 arasında ise normal, 20 ve 20 den büyükse pahalı yazsın
         */
        int fiyat = 36 ;

       String örnekTernary = fiyat<10 ? "ucuz" : fiyat<20 ? "normal" : "pahalı";
       System.out.println("örnekTernary = " + örnekTernary);




    }

}
