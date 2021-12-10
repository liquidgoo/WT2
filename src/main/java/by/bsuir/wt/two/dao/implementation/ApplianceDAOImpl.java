package main.java.by.bsuir.wt.two.dao.implementation;
import main.java.by.bsuir.wt.two.dao.parser.Parser;
import main.java.by.bsuir.wt.two.dao.parser.XMLParser;
import main.java.by.bsuir.wt.two.entity.Appliance;
import main.java.by.bsuir.wt.two.dao.ApplianceDAO;
import main.java.by.bsuir.wt.two.entity.criteria.Criteria;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
/**
 * Data access object class to appliance entities
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public class ApplianceDAOImpl implements ApplianceDAO{

    @Override
    public List<Appliance> find(Criteria criteria) {
        Parser parser=new XMLParser();
        try {
            parser.parse("src/main/resources/warehouse_database.xml");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return parser.take(criteria);
    }


}