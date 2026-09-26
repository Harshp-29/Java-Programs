import java.util.Scanner;
class FiveDigitsNumber
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=a.nextInt();

        if(n<=99999 && n>9999)
        {
            System.out.print("It is 5 Digits Number");
        }
        else{
            System.out.print("It is Not 5 Digits Number");
        }
    }
}