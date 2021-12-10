package main.java.by.bsuir.wt.two.dao.control.implementation;


import main.java.by.bsuir.wt.two.dao.control.Controller;
import main.java.by.bsuir.wt.two.entity.Laptop;
/**
 * Controller to manipulate laptop entity object's fields
 *
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public class LaptopController implements Controller {

    /**
     * Controlled laptop entity object
     */
    private Laptop laptop;

    /**
     * Constructor for controller of laptop
     *
     * @param laptop - entity object to be controlled
     */
    public LaptopController(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String takeInfo() {
        return this.laptop.toString();
    }

    @Override
    public boolean containsValue(String key, Object value) {
        boolean answer = true;
        switch (key) {
            case "PRICE":
                if (!(laptop.getPrice() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "BATTERY_CAPACITY":
                if (!(laptop.getBatteryCapacity() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "OS":
                if (!(laptop.getOperatingSystem().equals(value.toString()))) {
                    answer = false;
                }
                break;
            case "MEMORY_ROM":
                if (!(laptop.getMemoryROM() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "SYSTEM_MEMORY":
                if (!(laptop.getSystemMemory() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "CPU":
                if (!(laptop.getCpu() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "DISPLAY_Inches":
                if (!(laptop.getDisplayInches() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;

            default:
                answer = false;
        }
        return answer;
    }

}