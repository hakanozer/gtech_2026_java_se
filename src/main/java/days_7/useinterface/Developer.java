package days_7.useinterface;

public class Developer implements IPerson{

    @Override
    public String getName() {
        return "Veli Bil";
    }

    @Override
    public int getWorkTime() {
        return 40;
    }

    @Override
    public double getSalary() {
        return 175000;
    }

    @Override
    public long ticketNo() {
        return 0;
    }
}
