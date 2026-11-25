class Banking
{
    static double balance;
    static long accno;
    static int pin;
    static String accountName;
    static boolean flag;

    public static void main(String[] args)
    {
        createAccount("Raju", 98765432101L, 1234);

        deposit(98765432101L, 1234, 4000);

        withdraw(98765432101L, 1234, 2000.0);
    }

    public static void createAccount(String name, long accno, int pin)
    {
        if (flag == false)
        {
            accountName = name;
            Banking.accno = accno;
            Banking.pin = pin;

            System.out.println("Account Created!");

            flag = true;
        }
        else
        {
            System.out.println("Account already created!");
        }
    }

    public static void withdraw(long accno, int pin, double amt)
    {
        if (flag && Banking.accno == accno && Banking.pin == pin)
        {
            if (amt > 0 && balance - amt > 2000)
            {
                balance = balance - amt;

                System.out.println("Amount debited!");
                System.out.println("Your balance is: Rs." + balance);
            }
            else
            {
                System.out.println("Insufficient Balance!");
            }
        }
        else
        {
            System.out.println("Account not created or invalid credentials!");
        }
    }

    public static void deposit(long accno, int pin, double amt)
    {
        if (flag && Banking.accno == accno && Banking.pin == pin)
        {
            if (amt > 0)
            {
                balance = balance + amt;

                System.out.println("Amount credited!");
                System.out.println("Your balance is: Rs." + balance);
            }
            else
            {
                System.out.println("Invalid Amount!");
            }
        }
        else
        {
            System.out.println("Account not created or invalid credentials!");
        }
    }
}