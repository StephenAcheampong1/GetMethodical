import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        int favInteger = 0;
        double favDoubleNum = 0;
        Scanner in = new Scanner (System.in);

        favInteger = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("\nYour favorite integer is: " +favInteger);

        favDoubleNum = SafeInput.getDouble(in, "Enter your favorite double number");
        System.out.println("\nYour favorite double number is: " +favDoubleNum);

    }
}
