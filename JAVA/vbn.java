import java.util.Scanner;
class vbn {
    public static void main(String args[])
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age ");
    int value = scanner.nextInt();
    assert value>=18:" Not valid";
    System.out.println("value is " +value);
}
    }
