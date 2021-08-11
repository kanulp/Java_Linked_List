
public class Account
{
    int id = 0;
    double balance = 0;
    java.util.Date dateCreated = new java.util.Date();

    Account(){
    }


    public void setid(int i)
    {
        id = i;
    }

    public void setbalance(double b)
    {
        balance = b;
    }

    public int getid()
    {
        return id;
    }

    public double getbalance()
    {
        return balance;
    }

    public String dateCreated()
    {
        String output = "The date created " + dateCreated.toString();

        return output;
    }

    public void printInfo()
    {

        String output = "ID : " + getid() +
                "\nOrginal balance : " + balance +
                "\nCurrent balance: " + getbalance() +
                "\n" + dateCreated();
        System.out.println(output);
    }
}