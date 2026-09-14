package days_7.useinterface;

public class Security implements IPerson{

    @Override
    public String getName() {
        return "Ahmet Bilsin";
    }

    @Override
    public int getWorkTime() {
        return 40;
    }

    @Override
    public double getSalary() {
        return 75000;
    }

    @Override
    public long ticketNo() {
        return 0;
    }
}
