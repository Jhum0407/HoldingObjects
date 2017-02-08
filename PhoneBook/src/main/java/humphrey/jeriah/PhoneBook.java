package humphrey.jeriah;
import java.util.*;

/**
 * Created by jeriahhumphrey on 2/7/17.
 */
public class PhoneBook {

    private TreeMap<String, String> phoneBook = new TreeMap();


    public String lookUp(String key) {
        return phoneBook.get(key);
    }

    public void addEntry(String name, String number) {
        phoneBook.put(name, number);

    }

    public TreeMap getMap() {
        return phoneBook;
    }

    public String listNames() {
        String list = "";
        for (Map.Entry<String, String> entries : phoneBook.entrySet()) {
            list += "Name: " + entries.getKey() + ", ";
        }
        System.out.println(list);
        return list;
    }

    public String listEntries() {
        String list = "";
        for (Map.Entry<String, String> entries : phoneBook.entrySet()) {
            list += "Name: " + entries.getKey() + " - Number: " + entries.getValue() + "| ";

        }
        System.out.println(list);
        return list;
    }


    public void remove(String key) {
        phoneBook.remove(key);

    }

    public String reverseLookup(String number) {
        ;
        for (Map.Entry<String, String> entries : phoneBook.entrySet()) {
            if(entries.getValue().equals(number)){
                return entries.getKey();
            }
        }
        return null;
    }
}
