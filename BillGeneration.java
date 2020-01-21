import java.util.Scanner;
class BillGeneration
{
    public static void main(String args[])
    {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter the Item name: ");
        String name = myscan.nextLine();

        System.out.println("Enter the unit price: ");
        double price = myscan.nextDouble();

        System.out.println("Enter the Quantity: ");
        int quantity = myscan.nextInt();

        System.out.println("Total cost for " + name + " is " + (price * quantity) + "Rupees");
    }
}    