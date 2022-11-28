package day21_11_22;

public class Q03_R {
    //  / Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)
    public static void main(String[] args) {
        String str ="java ile hersey guzel";
        System.out.println("hackerLanguage(str) = " + hackerLanguage(str));


    }

    private static String hackerLanguage(String str) {
        str=str.replaceAll("s","5").replaceAll("a","4")
                .replaceAll("i","3").replaceAll("i","1").replaceAll("o","0");


        return str;
    }
}
