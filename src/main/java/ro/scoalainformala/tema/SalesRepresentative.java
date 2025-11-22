package ro.scoalainformala.tema;

public class SalesRepresentative {

    private final int numberOfSales;
    private final int quotaPerSale;

    public SalesRepresentative(int numberOfSales, int quotaPerSale) {
        this.numberOfSales = numberOfSales;
        this.quotaPerSale = quotaPerSale;
    }

    public int getRevenue() {
        return numberOfSales * quotaPerSale;
    }

    @Override
    public String toString() {
        return "SalesRep{ sales=" + numberOfSales +
                ", quota=" + quotaPerSale +
                ", revenue=" + getRevenue() + " }";
    }
}