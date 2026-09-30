import java.util.Scanner;
class Fascinating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count=0;
        int temp=num;

        while(num>0)
        {
            count++;
            num=num/10;
        }

        num=temp;
        if(count==3)
        {
            int mult1=1;

            for(int i=1 ; i<=3 ; i++)
            {
                mult1=num*i;
            }
            System.out.print(mult1);


        }

        else{
            System.out.print("It is Invalid Number");
        }

    }
}