import java.util.Scanner;
class mini_ATM{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance=50000;
        int deposit=0;
        int withdraw=0;
        System.out.println("welcome to INDIAN BANK");
        while (true)
        {
            System.out.println("Press 1 to check the balance");
            System.out.println("Press 2 to deposit the amount");
            System.out.println("Press 3 to withdraw the amount");
            System.out.println("Press 4 to get the receipt");
            System.out.println("Press 5 to exit");

            System.out.print("choose any number:");
            int num=input.nextInt();

            switch (num)
            {
                case 1:
                    System.out.println("your balance is : "+balance);
                    break;
                case 2:
                    System.out.print("enter the amount to deposit:");
                    deposit=input.nextInt();
                    balance=balance+deposit;
                    System.out.println("your amount is successfully deposited");
                    System.out.println("your total amount is :"+balance);
                    break;
                case 3:
                    System.out.print("enter the amount to withdraw:");
                    withdraw=input.nextInt();
                    balance=balance-withdraw;
                    System.out.println("your amount is successfully withdrawn");
                    System.out.println("your withdraw amount is :"+withdraw);
                    break;
                case 4:
                    System.out.println("Welcome to INDIAN BANK");
                    System.out.println("your balance is :"+balance);
                    System.out.println("your deposit amount is :"+deposit);
                    System.out.println("your withdraw amount is :"+withdraw);
                    System.out.println("THANK YOU");
                    break;
                case 5:
                    System.out.println("EXIT!");
                    System.exit(0);
                    break;
            }

        }
    }
}
