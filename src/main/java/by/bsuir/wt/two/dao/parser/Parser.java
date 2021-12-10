package main.java.by.bsuir.wt.two.dao.parser;
import main.java.by.bsuir.wt.two.entity.Appliance;
import main.java.by.bsuir.wt.two.entity.criteria.Criteria;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
/**
 * Interface of files parsers getting info about appliance entities
 * @author PlotnikovJediKnight (951005 Plotnikov Vladislav)
 *
 */
public interface Parser {
    /**
     * Parses file with information about appliances
     * @param path - path to parsed file with information about appliances
     * @throws ParserConfigurationException if parser can not be created
     * @throws SAXException for SAX errors
     * @throws IOException if file can not be accessed
     */
    void parse(String path) throws ParserConfigurationException, SAXException, IOException;
    /**
     * Takes all the entity objects fitting criteria
     * @param criteria - params to filter entities
     * @return list of entity objects fiiting criteria
     */
    List<Appliance> take(Criteria criteria);
}