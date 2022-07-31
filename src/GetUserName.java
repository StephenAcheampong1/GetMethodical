import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args)
    {
        String firstName = "";
        String lastname = "";
        Scanner in = new Scanner(System.in);

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastname = SafeInput.getNonZeroLenString(in,"Enter your last name");

        System.out.println("\nYour user name is: " + firstName + " " + lastname);
    }
}