import java.util.Scanner;
class AutomorphicNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting Number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending Number: ");
        int end=sc.nextInt();

        for(int range=start ; range<=end ; range++)
        {
        int num=range;
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
            System.out.println(range+" is Automorphic Number");
        }
        }
    }
}