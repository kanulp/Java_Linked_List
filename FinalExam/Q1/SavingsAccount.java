public class SavingsAccount extends Account
{
    double deposit = 0;

    SavingsAccount(){

    }

    public void setdeposit(double d)
    {
        if(balance>=6000)
        {
            System.out.println("TFSA allows limit of 6000$ yearly.");
        }
        deposit = d;
        balance += d;
    }

    public double getdeposit()
    {
        return deposit;
    }

    public void print()
    {
        String output = "Deposited " + deposit +"\nNew balance : " + balance;
        System.out.println(output);
    }
}