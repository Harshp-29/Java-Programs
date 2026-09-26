import java.util.Scanner;
class Absolute
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        if(num<0)
        {
            System.out.print("Absolute Value: "+(-num));
        }
        else{
            System.out.print("Absolute Value: "+(num));
        }
    }
}