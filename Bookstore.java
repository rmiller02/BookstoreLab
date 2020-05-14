import java.util.*;

public class Bookstore {

    static String Name = "RichBooks";
    static String Address = "1414 S.Tryon St.";
    static Integer SqFeet = 1000;
    static String usedBooks = "Yes!";
    static String newBooks = "Yes!";
    static String storeHours = "8am - 8pm";
    static String storeSchedule = "Mon-Sat";
    

    public static void main(String[] args) {
        // Scanner userInput = new Scanner(System.in);
        System.out.println("What is the address?");

        getAddress();

        System.out.println("Is the store open today?");

        getStoreSchedule();

        System.out.println("What time does it close?");

        getStoreHours();
        

        System.out.println("How big is the store?");

        storeSize();

        System.out.println("Does the store have new or used books?");

        bookTypes();

        

    }

    public static void getAddress() {
        System.out.println(Address);
    }

    public static void getStoreSchedule() {
        System.out.println("We are open " + storeSchedule);
    }

    public static void getStoreHours() {
        System.out.println("Our store hours are from " + storeHours);
    }


    public static void storeSize() {
        System.out.println(SqFeet + " Square Feet");
    }

    public static void bookTypes() {
        System.out.println(usedBooks);
    }

    
}