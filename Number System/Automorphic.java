import java.util.Scanner;
class Automorphic
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int count=0;
        int sq=num*num;
        int devide=1;
        int temp=num;

        while(num>0){
            count++;
            num=num/10;
        }

        for(int i=1 ; i<=count ; i++)
        {
            devide = devide * 10;
        }
        int res=sq%devide;

        if(res==temp)
        {
            System.out.println("It is Automorphic Number");
        }
        else {
            System.out.println("It is Not Automorphic Number");
        }
    }
}