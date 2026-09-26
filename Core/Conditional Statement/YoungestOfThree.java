import java.util.Scanner;
class YoungestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age of Amey: ");
        int a = sc.nextInt();
        System.out.print("Enter the Age of Jay: ");
        int b = sc.nextInt();
        System.out.print("Enter the Age of Harsh: ");
        int c = sc.nextInt();

        if(a<b)
        {
            if(a<c)    System.out.print("Amey is Yongest");
            else    System.out.print("Harsh is Yongest"); 
        }
        else{
            if(b<c)    System.out.print("Jay is Yongest");
            else System.out.print("Harsh is Youngest");
        }
    }
}