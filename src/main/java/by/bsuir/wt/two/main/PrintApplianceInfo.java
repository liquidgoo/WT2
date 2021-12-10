package main.java.by.bsuir.wt.two.main;

import main.java.by.bsuir.wt.two.entity.Appliance;
import main.java.by.bsuir.wt.two.dao.control.Controller;
import main.java.by.bsuir.wt.two.dao.control.ControllerFactory;


/**
 * Class for printing fields of appliance entity object to console
 *
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public class PrintApplianceInfo {
    /**
     * Prints fields of appliance entity object to console
     * @param appliance - appliance entity object
     */
    public static void print(Appliance appliance) {
        ControllerFactory controllerFactory = ControllerFactory.getInstance();
        Controller controller = controllerFactory.takeApplianceController(appliance);
        System.out.println(controller.takeInfo());
    }
}