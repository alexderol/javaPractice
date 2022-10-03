package day03;

public class Q03_NestedTernary {
    public static void main(String[] args) {
       /* final notu tanımlayın, nestedTernary ile cozunuz
                'A'--> "gayet başarılı"
                'B'--> " başarılı"
                'c'--> "Hagayret"
                bu notlar dışındakrkiler dediğerleri yazdırınız

        */
        char finalNotu = 'A';
        String result = finalNotu=='A'? "Gayet Başarılı": finalNotu=='B'? "Başarılı": finalNotu=='C'?"Hagayret":"Diğerleri";
        System.out.println("result = " + result);




    }


}
