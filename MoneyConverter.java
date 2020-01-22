import java.util.Scanner;
class MoneyConverter
{
    public static void main(String args[])
    {
        Scanner first  = new Scanner(System.in);
        System.out.println("Enter the amount in LKR: ");
        int amount = first.nextInt();

        System.out.println("5000 LKR = " + (amount / 182.26) + "$");
        System.out.println("5000 LKR = " + (amount / 222.74) + " Pounds");
        System.out.println("5000 LKR = " + (amount / 206.36) + " Euros");
    }
}