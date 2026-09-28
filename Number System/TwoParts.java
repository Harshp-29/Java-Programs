import java.util.Scanner;
class TwoParts
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int count=0;
        int s=num;

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

        System.out.println("First Half: "+fh);                      
        System.out.println("Second Half: "+sh);                      


        }
        else{
        System.out.print("Not Divided into Equal parts");                      
        }
    }
}