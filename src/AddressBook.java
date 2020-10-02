import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addresses;
    public AddressBook(){
        addresses = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){

        if(buddy != null) addresses.add(buddy);
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < addresses.size()) {
            return addresses.remove(index);
        }
        return null;
    }

    public static void main(String[] args){
        AddressBook Book1 = new AddressBook();
        BuddyInfo Dave = new BuddyInfo("Dave", "188cm");
        Book1.addBuddy(Dave);
        Book1.removeBuddy(0);
    }
}
