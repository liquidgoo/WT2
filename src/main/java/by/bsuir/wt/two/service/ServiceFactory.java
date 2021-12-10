package main.java.by.bsuir.wt.two.service;

import main.java.by.bsuir.wt.two.service.implementation.ApplianceServiceImpl;

/**
 * Factory class for appliance entities services
 *
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public final class ServiceFactory {
    /**
     * single factory instance for all the application
     */
    private static final ServiceFactory instance = new ServiceFactory();
    /**
     * Appliance entities service object
     */
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    /**
     * constructor unavailable from out of class
     */
    private ServiceFactory() {
    }

    /**
     * Factory method for appliance service
     *
     * @return ApplianceService - object of appliance service
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Static factory instance returning method instead of constructor
     *
     * @return single factory instance for all the application
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}