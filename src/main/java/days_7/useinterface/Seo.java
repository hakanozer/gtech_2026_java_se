package days_7.useinterface;

public class Seo implements IPerson{

    @Override
    public String getName() {
        return "Meral Bilirim";
    }

    @Override
    public int getWorkTime() {
        return 20;
    }

    @Override
    public double getSalary() {
        return 500000;
    }

    @Override
    public long ticketNo() {
        return 0;
    }
}
