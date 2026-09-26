import java.util.Scanner;
class Rectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Breadth: ");
        double b = sc.nextInt();
        System.out.print("Enter the Length: ");
        double l = sc.nextInt();
        double area=l*b;
        double perimeter=2*(l+b);

        if(area>perimeter)
        {
            System.out.print("Perimeter is Greater");
        }
            else if(area<perimeter)
            {
            System.out.print("Area is Greater");
            }
            else{
            System.out.print("Equal");
            }
    }
}