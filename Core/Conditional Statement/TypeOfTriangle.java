import java.util.Scanner;
class TypeOfTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a=sc.nextInt();
        System.out.print("Enter the second side: ");
        int b=sc.nextInt();
        System.out.print("Enter the third side: ");
        int c=sc.nextInt();

        if( a == b && c == b)
        {
        System.out.print("It is Equilateral Triangle");          
        }
        else if(a==b || a==c || b==c)
        {
        System.out.print("It is Isosceles Triangle");                    
        }
        else{
        System.out.print("It is Scalene Triangle");                              
        }
    }
}