package InterviewQuestions;

import java.util.*;

public class Q13_MepTask {
    // PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]


// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]

// PART 2
// find how many members each group has

    // BÖLÜM 2
// her grubun kaç üyesi olduğunu bul
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> grupVeUyeler= new HashMap<>();

        ArrayList<String> team1= new ArrayList<>(Arrays.asList("Gamze","Merve","Sümeyra","Ramazan"));
        ArrayList<String> team2= new ArrayList<>(Arrays.asList("Hakan","Yunus Emre","Gursoy","Yakup"));

        grupVeUyeler.put("teamA",team1);
        grupVeUyeler.put("teamB",team2);
        System.out.print("grupVeUyeler = " + grupVeUyeler);


        //collections
        Collection<ArrayList<String>> values = grupVeUyeler.values();
        for (ArrayList<String> each: values //each : teamleri temsil eder
        ) {
            System.out.println(each.size()); // 4  ve 4
        }




//set cözüm
        Set<String> keys = grupVeUyeler.keySet();
        for (String w:keys ) {
            ArrayList<String> uyelistesi = grupVeUyeler.get(w);
            System.out.println("grup uyelerinin sayisi : "+w + " "+ uyelistesi.size());
        }

// lambda cözüm
        grupVeUyeler.keySet().stream().forEach(t-> System.out.println(grupVeUyeler.get(t).size()));


    }


}
