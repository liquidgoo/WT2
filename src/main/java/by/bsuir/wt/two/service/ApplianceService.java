package main.java.by.bsuir.wt.two.service;

import main.java.by.bsuir.wt.two.entity.Appliance;
import main.java.by.bsuir.wt.two.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface of appliance service
 *
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public interface ApplianceService {
    /**
     * Filters appliances according to criteria
     * @param criteria - object with parameters for filtration
     * @return list of appliance entities objects fitting criteria params
     */
    List<Appliance> find(Criteria criteria);

    /**
     * Finds cheapest appliance of groupName type
     * @param groupName - type of appliances
     * @return cheapest appliance of the type
     */
    Appliance findCheapest(String groupName);
}