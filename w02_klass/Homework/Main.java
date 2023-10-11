import java.util.HashSet;
import java.util.Vector;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Vector<String> events = new Vector<>();

        String str1 = "Linna minek";
        System.out.println(str1);
        String str2 = "Hotelli naasmine";
        System.out.println(str2);
        String str3 = "Hotelli saabumine";
        System.out.println(str3);

        events.add(str1);
        events.add(str2);
        events.add(0, str3);

        System.out.println(events);

        events.remove(0);

        System.out.println(events);
        
        HashSet<String> guestlist = new HashSet<String>();

        guestlist.add("Külaline 1");
        guestlist.add("Külaline 2");
        guestlist.add("Külaline 3");
        guestlist.add("Külaline 2");
        guestlist.add("Külaline 4");
        for (String i : guestlist){
            System.out.println(i);
        }

        guestlist.remove("Külaline 1");
        for (String i : guestlist){
            System.out.println(i);
        }

        HashMap<String, String> shoppinglist = new HashMap<String, String>();

        shoppinglist.put("2-4", "tomatit");
        shoppinglist.put("1", "piim");
        shoppinglist.put("2", "juustu");
        shoppinglist.put("3", "mandariini");

        
        System.out.println(shoppinglist.get("3"));
        System.out.println(shoppinglist.get("1"));
    

        shoppinglist.remove("2-4");

        System.out.println(shoppinglist.get("2"));
        
        for (String i : shoppinglist.values()){
            System.out.println(i);
        }
        
        for (String i : shoppinglist.keySet()){
            System.out.println(i);
        }
        shoppinglist.clear();
        for (String i : shoppinglist.keySet()){
            System.out.println(i);

        /* Vector muudab järjekorda liikmete eemaldamisel, 
        Seti liiikmed ühekordsed, Mapi mitu liiget ühes kirjes võtmega*/
        }
    }
}