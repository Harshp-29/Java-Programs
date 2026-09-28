import java.util.Scanner;
class EqualParts
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        if(num%2==0)
        {
        System.out.print("Divided into Equal parts");           
        }
        else{
        System.out.print("Not Divided into Equal parts");           
        }
    }
}