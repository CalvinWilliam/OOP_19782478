import java.util.*;
class ReadConsole
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Zodiac sign: ");
        String Zodiac = scanner.next();
        System.out.print("Enter your Weight(Kg): ");
        double Weight = scanner.nextDouble();
        System.out.print("Enter your Lucky Number: ");
        int LuckyNum = scanner.nextInt();

        System.out.println("Hello, " + name + ".");
        System.out.println("Your lucky number is " + LuckyNum + ".");
        System.out.println("Your weight is " + Weight + "Kg.");
        System.out.println("Your Zodiac sign is " + Zodiac + ".");
    }
}