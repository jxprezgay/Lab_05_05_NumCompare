public class Main
{
    public static void main(String[] args)
    {
        int num1 = 12;
        int num2 = 12;

        System.out.println("What is your first number: ");
        System.out.println("What is your second number: ");

        if (num1 > num2){
            System.out.println("Number 2 is smaller.");
        } else if (num2 > num1) {
            System.out.println("Number 1 is smaller.");
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}