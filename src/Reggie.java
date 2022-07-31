import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = "";
        String mNumber = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in,"Enter your Social Security Number","\\d{3}-\\d{2}-\\d{4}");
        mNumber = SafeInput.getRegExString(in, "Enter your M number","(M|m)\\d{5}");
        menuChoice =SafeInput.getRegExString(in,"Select menu choice","[OoSsVvQq]"); // O-Open, S-Save, V-View, Q-Quit

        System.out.println("\nThe SSN you entered is: " +SSN);
        System.out.println("\nYour M Number is: " +mNumber);
        System.out.println("\nMenu choice is: " +menuChoice);

    }
}
