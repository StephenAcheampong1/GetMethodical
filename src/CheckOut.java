import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        double itemPrice = 0;
        double totalCost = 0;
        Scanner in = new Scanner(System.in);

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item in dollars: ",0.50,9.99);
            totalCost += itemPrice;
        }while(SafeInput.getYNConfirm(in,"Do you want to add another item"));

        System.out.printf("\nThe total cost of the item(s) is $%.2f%n",+ totalCost);
    }
}
