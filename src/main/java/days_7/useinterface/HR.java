package days_7.useinterface;

public class HR implements IPerson{

    @Override
    public String getName() {
        return "Selin Bilirler";
    }

    @Override
    public int getWorkTime() {
        return 40;
    }

    @Override
    public double getSalary() {
        return 140000;
    }

    @Override
    public long ticketNo() {
        return 0;
    }
}
