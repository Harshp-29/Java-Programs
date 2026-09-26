import java.util.Scanner;
class GreatestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();

        if(a>=b && a>=c)  
        {
         System.out.print(a+" is Greatest");           
        }  
            else if(b>=c && b>=a)
            {                         
                System.out.print(b+" is Greatest");           
            }
            else
            {                         
                System.out.print(c+" is Greatest");           
            }  
    }
}