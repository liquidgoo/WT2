package main.java.by.bsuir.wt.two.dao;

import main.java.by.bsuir.wt.two.entity.Appliance;
import main.java.by.bsuir.wt.two.entity.criteria.Criteria;


import java.util.List;
/**
 * Interface for data access objects to appliance entities
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public interface ApplianceDAO {
    /**
     * Searches and filters appliance entity object by params of criteria
     * @param criteria - object with params to filter
     * @return list of found entities or null if nothing is found
     */
    List<Appliance> find(Criteria criteria);
}