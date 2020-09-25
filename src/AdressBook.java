import java.util.HashMap;

public class AdressBook {
    private HashMap<String, BuddyInfo> addresses;
    public AdressBook(){
        addresses = new HashMap<>();
    }
    public void addBuddy(String name, BuddyInfo info){
        addresses.put("name", info);
    }
    public void removeBuddy(String name){
        addresses.remove("name");
    }
    public static void main(String[] args){
        System.out.println("Address Book");

    }
}
