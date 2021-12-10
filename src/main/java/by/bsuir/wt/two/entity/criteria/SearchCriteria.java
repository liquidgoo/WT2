package main.java.by.bsuir.wt.two.entity.criteria;

/**
 * Class keeping enums of field names for appliance entities filtration
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public final class SearchCriteria {
    /**
     * field names for oven entities filtration
     * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
     *
     */
    public static enum Oven{
        PRICE,POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }
    /**
     * field names for oven entities filtration
     * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
     *
     */
    public static enum Laptop{
        PRICE,BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_Inches
    }
    /**
     * field names for laptop entities filtration
     * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
     *
     */
    public static enum Refrigerator{
        PRICE,POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }
    /**
     * field names for frige entities filtration
     * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
     *
     */
    public static enum VacuumCleaner{
        PRICE,POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }
    /**
     * field names for tabletPC entities filtration
     * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
     *
     */
    public static enum TabletPC{
        PRICE,BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }
    /**
     * field names for speakers entities filtration
     * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
     *
     */
    public static enum Speakers{
        PRICE,POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
    }


    private SearchCriteria() {}
}
