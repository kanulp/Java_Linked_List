public class Main
{
    public static void main(String[] args)
    {
        PersonalAccount a = new PersonalAccount();
        a.setbalance(1000);

        CheckingAccount c = new CheckingAccount();
        SavingsAccount s = new SavingsAccount();

        System.out.println("Balance" + a.getbalance());

        c.setwithDraw(500);
        c.print();

        System.out.println();

        s.setdeposit(300);
        s.print();
    }
}