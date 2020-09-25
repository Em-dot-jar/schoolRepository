import java.util.ArrayList;

public class AdressBook {
    private ArrayList<BuddyInfo> addresses;
    public AdressBook(){
        addresses = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        addresses.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        addresses.remove(buddy);
    }
    public static void main(String[] args){
        AdressBook Book1 = new AdressBook();
        BuddyInfo Dave = new BuddyInfo("Dave", "188cm");
        Book1.addBuddy(Dave);
        Book1.removeBuddy(Dave);
    }
}
