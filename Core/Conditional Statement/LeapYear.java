import java.util.Scanner;
class LeapYear
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year=sc.nextInt();

        if(year<=9999 && year>=1000)
        {
            if(year%400==0 && year%100==0 || year%4==0)
            {
            System.out.print("It is Leap Year");           
            }  
            else{
            System.out.print("It is Not Leap Year");
            }
            }
        else{
        System.out.print("Invalid Year");       
        }
    }
}