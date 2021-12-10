package main.java.by.bsuir.wt.two.main;

import java.util.List;
import main.java.by.bsuir.wt.two.entity.Appliance;
import main.java.by.bsuir.wt.two.entity.criteria.Criteria;
import main.java.by.bsuir.wt.two.entity.criteria.SearchCriteria.Oven;
import main.java.by.bsuir.wt.two.entity.criteria.SearchCriteria.TabletPC;
import main.java.by.bsuir.wt.two.entity.criteria.SearchCriteria.VacuumCleaner;
import main.java.by.bsuir.wt.two.service.ApplianceService;
import main.java.by.bsuir.wt.two.service.ServiceFactory;

public class Main {

    public static void main(String[] args) {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();
        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.PRICE.toString(), 15);
        List<Appliance> appliances = service.find(criteriaOven);

        int i;
        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        criteriaOven.add(Oven.DEPTH.toString(), 80);
        appliances = service.find(criteriaOven);

        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
        appliances = service.find(criteriaTabletPC);

        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        System.out.println("Vacuum cleaners:");
        appliances = service.find(new Criteria(VacuumCleaner.class.getSimpleName()));

        for(i = 0; i < appliances.size(); ++i) {
            PrintApplianceInfo.print((Appliance)appliances.get(i));
        }

        System.out.println("Cheapest appliance:");
        PrintApplianceInfo.print(service.findCheapest(""));
        System.out.println("Cheapest oven:");
        PrintApplianceInfo.print(service.findCheapest(Oven.class.getSimpleName()));
    }
}
