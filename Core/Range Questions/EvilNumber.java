import java.util.Scanner;
class EvilNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start Number: ");
        int start=sc.nextInt();
        System.out.print("Enter End Number: ");
        int end=sc.nextInt();

        for(int range=start ; range<=end ; range++)
        {
        int num=range;
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
            System.out.println(range+" is Evil Number");
        }
        }
    }
}