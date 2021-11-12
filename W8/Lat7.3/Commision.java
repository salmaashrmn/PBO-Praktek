public class Commision extends Hourly{
    private double totalsales;
    private double commisionRate;

    public Commision (String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double comRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        commisionRate = comRate;
    }

    public void addSales(double totalSales){
        totalsales = commisionRate * totalSales;
    }

    public double pay(){
        double payment = super.pay()+totalsales;
        totalsales = 0;
        return payment;
    }

    public String toString(){
        String result = super.toString();

        result += "\nTotal sales: " + totalsales;

        return result;
    }
}
