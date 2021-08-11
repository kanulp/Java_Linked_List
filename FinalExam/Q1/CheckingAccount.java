public class CheckingAccount extends Account
{
    double withDraw = 0;

    CheckingAccount()
    {
        //super(a);
    }

    public void setwithDraw(double w)
    {
        withDraw = w;
        balance -= w;
    }

    public double getwithDraw()
    {
        return withDraw;
    }

    public void print()
    {
       String output = "Withdraw :" + withDraw + "\n New Balance : " + balance;
       System.out.println(output);
    }
}