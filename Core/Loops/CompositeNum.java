import java.util.Scanner;
class CompositeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        boolean flag = true;

        if (num <= 1)
        {
            System.out.println(num + " is neither Prime nor Composite");
        } 
        else {
            for (int i = 2; i < num; i++) 
            {
                if (num % i == 0) 
                {
                    flag = false;
                    break;
                }
            }

            if (flag == true) 
            {
                System.out.println("It is a Prime Number");
            } 
            else
            {
                System.out.println("It is a Composite Number");
            }
        }

        sc.close();
    }
}
