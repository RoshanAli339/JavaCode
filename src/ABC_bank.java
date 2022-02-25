    import java.util.Scanner;

    public class ABC_bank {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ABC_bank ob = new ABC_bank();
            Customer c[] = new Customer[10];
            ob.input_customer(c);
            display(c);
        }

        static void display(Customer c[])
        {
            double bank_pos= 0.0;

            for (int i = 0; i < 5; ++i)
                bank_pos += c[i].balance;

            System.out.println("The ABC bank posses Rs."+bank_pos+" currently.");
        }
        void input_customer(Customer c[])
        {
            Scanner sc = new Scanner(System.in);
            String name;
            long ac_no;
            char ac_type;
            double balance;

            for (int i = 0; i < 5; ++i)
            {
                System.out.print("Enter the name of customer: ");
                name = sc.next();
                System.out.print("1.Current Account('C')\n2.Savings Account('S')\nEnter the respective character to select the account type: ");
                ac_type = sc.next().charAt(0);
                System.out.print("Enter the amount of money you want to deposit the first time: Rs.");
                balance = sc.nextDouble();
                ac_no = (int) (Math.random() * 989999999999l)+10000000000l;
                c[i] = new Customer(name, ac_no, ac_type, balance);
            }
        }
    }

    class Customer
    {
        String name;
        long ac_no;
        char ac_type;
        double balance;

        Customer(String name, long ac_no, char ac_type, double balance)
        {
            this.name = name;
            this.ac_no = ac_no;
            this.ac_type = ac_type;
            this.balance = balance;
        }
    }