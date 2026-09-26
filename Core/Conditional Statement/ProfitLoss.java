import java.util.Scanner;
class ProfitLoss
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price: ");
        double cp = sc.nextInt();
        System.out.print("Enter the Selling Price: ");
        double sp = sc.nextInt();

        if(cp>sp)
        {
            System.out.print("Loss is "+(cp-sp)+" Rs");
        }
            else if(cp<sp)
            {
            System.out.print("Profit is "+(sp-cp)+" Rs");
            }
            else{
            System.out.print("No Profit No Loss");
            }
    }
}