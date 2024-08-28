import java.util.Scanner;

public class God 
{
    String name = "";
    int basicS;

    void getInput() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your basic salary");
        basicS = sc.nextInt();
    }

    public static void main(String[] args) 
    {
        God obj = new God();
        obj.getInput();
    }
}
