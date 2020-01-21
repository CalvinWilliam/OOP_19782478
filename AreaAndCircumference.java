class AreaAndCircumference
{
    public static void main(String args[])
    {
        int r = Integer.parseInt(args[0]);
        System.out.println("The Area of the Circle is: " + (Math.PI * Math.pow(r, 2)));
        System.out.println("The Circumference of the cirlce is: " + 2 * Math.PI * r);
    }
}