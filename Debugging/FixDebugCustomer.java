public class FixDebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public FixDebugCustomer(int id, double name, String credit)
    {
       idNumber = id;
       this.name = name;
       creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
