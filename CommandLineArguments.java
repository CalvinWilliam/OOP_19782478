class CommandLineArguments
{
    public static void main(String[] args)
    {
        int a;

        a = Integer.parseInt(args[0]);

        System.out.println("Squared value: " + Math.pow(a, 2));
        System.out.println("Square Root: " + Math.sqrt(a));
    }
}