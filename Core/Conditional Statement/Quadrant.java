import java.util.Scanner;
class Quadrant
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the X Quadrant: ");
        int x=sc.nextInt();
        System.out.print("Enter the Y Quadrant: ");
        int y=sc.nextInt();   

        if(x==0 && y==0)
        {
            System.out.print("X and Y axis is at Origin");
        }     
        else if(x>0 && y>0)
        {
            System.out.print("It lies in the 1st Quadrant");   
        }
        else if(x<0 && y>0)
        {
            System.out.print("It lies in the 2nd Quadrant");   
        }
        else if(x<0 && y<0)
        {
            System.out.print("It lies in the 3rd Quadrant"); 
        }
        else if(x>0 && y<0)
        {
            System.out.print("It lies in the 4th Quadrant"); 
        }
        else if(x==0 && y!=0)
        {
            System.out.print("It lies on X axis"); 
        }
        else if(x!=0 && y==0)
        {
            System.out.print("It lies on Y axis"); 
        }
    }
}