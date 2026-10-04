import java.util.Scanner;
class Evil
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int count=0;

        while(num>0){
            int ld=num%2;
            if(ld==1)
            {
                count++;
            }
            num=num/2;
        }

        if(count%2==0)
        {
            System.out.print("It is Evil Number");
        }
        else
        {
            System.out.print("It is Not Evil Number");
        }
    }
}