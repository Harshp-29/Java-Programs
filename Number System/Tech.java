import java.util.Scanner;
class Tech
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
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
                System.out.print("It is Tech Number");
            }                 
            else{
                System.out.print("It is Not Tech Number");
            }

        }
        else{
        System.out.print("Not Divided into Equal parts");                      
        }
    }
}