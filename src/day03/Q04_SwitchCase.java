package day03;

public class Q04_SwitchCase {
    public static void main(String[] args) {
        /*
        günleri gösterebilen bir program yazın
        gün pazartesi veyasalı ise:
        java dersi günleri,
        gün perşembe veya cuma ise : Selenyum dersi günleri,
        gün çarsamba veya cumartesi ise SQL dersi günleir
        aksi halde : izin günü
        (if kullanmayın)
         */
        String day = "wednesday";
        switch (day) {
            case "Monday":
            case "Tuesday":
                System.out.println("Java Class");
                break;
            case "Thursday":
            case "firday":
                System.out.println("Selenium Class");
                break;
            case "wednesday":
            case "Saturday":
                System.out.println("SQL Class");
                break;
            default:
                System.out.println("Day off");


        }


    }

}
