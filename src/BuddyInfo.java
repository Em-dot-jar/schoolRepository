public class BuddyInfo {

    private final String name;
    private final String height;
    public BuddyInfo(String nameString, String heightString) {
        name = nameString;
        height = heightString;
    }

    public static String getName(BuddyInfo buddy) {
        return buddy.name;
    }
    public static String getHeight(BuddyInfo buddy) {
        return buddy.height;
    }

    public static void main(String[] args) {
        BuddyInfo Buddy1 = new BuddyInfo("Dave", "188cm");
        System.out.println("Hello " + getName(Buddy1) + getHeight(Buddy1));
    }
}