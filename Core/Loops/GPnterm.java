import java.util.Scanner;
class GPnterm 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n term: ");
        int n = sc.nextInt();

        int a = 3;
        int r = 4;
        int term = a;

        for (int i = 1; i < n; i++) 
        {
            term = term * r;
        }

        System.out.println("The " + n + "th term is: " + term);
       
        sc.close();
    }
}