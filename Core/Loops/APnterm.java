import java.util.Scanner;
class APnterm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n term: ");
        int n=sc.nextInt();

        for(int i=1 ; i<=3*n-2 ; i=i+3)
        {       
            System.out.println(i);
        }
    }
}