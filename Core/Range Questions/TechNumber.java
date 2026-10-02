import java.util.Scanner;
class TechNumber
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
        int s=num;
        int sum=0;
        int sq=1;

        while(num>0){
            count++;
            num=num/10;
        }

        if(count%2==0)
        {
            int divide=1;
            for(int i=1 ; i<=count/2 ; i++)
            {
                divide=divide*10;
            }

            int fh = s / divide;  
            int sh = s % divide;  

            sum = fh + sh;
            sq = sum * sum;

            if(sq==s)
            {
                System.out.println(range+" is Tech Number");
            }                 
        }
        else{
        System.out.print("Not Divided into Equal parts");                      
        }
        }
    }
}