package main.java.by.bsuir.wt.two.entity;

/**
 * Abstract appliance entity class to be extended with other appliance entities' classes
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public abstract class Appliance {
    /**
     * price of the appliance
     */
    protected double price;

    /**
     * Gets appliance price
     * @return price of the appliance
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets appliance price
     * @param price - value to be set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}