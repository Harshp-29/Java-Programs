import java.util.Scanner;
class XylemOrPholeum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sod=0;
        int sid=0;
        int ld=num%10;
        sod=sod+ld;
        num=num/10;

        while(num>9)
        {
            ld=num%10;
            sid=sid+ld;
            num=num/10;
        }
        sod=sod+num;
        System.out.println("Sod :"+sod);
        System.out.println("Sid :"+sid);

        if(sid==sod)
        {
            System.out.println("It is Xylem");
        }
        else{
            System.out.println("It is Pholeum");
        }

    }
}