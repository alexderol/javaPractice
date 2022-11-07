package StudentCodeChallenge;

public class Ex03_Koray2 {
    /*
  Bir Stringde İLK uniq karakteri bulup return eden method create ediniz.
  Ex:
  String str1="AAABBBCCCDEF";
  String uniqf="D";

   */
    public static void main(String[] args) {


        System.out.println(uniq("AAABBBCCCDEF"));
    }

    private static String uniq(String str) {
        String uniqBos = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                // uniqBos=""+str.charAt(i);//"" kullanarak string yaptık
                uniqBos = String.valueOf(str.charAt(i));// üstteki de olur bu da olur wrapqer yaptık
                break;// ilk karakteri bulup olayı bıraksın diye yaptık

            }

        }

        return uniqBos.length()==0?"uniq karakter yok":uniqBos;
    }

}


