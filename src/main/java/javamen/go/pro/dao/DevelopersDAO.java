package javamen.go.pro.dao;

import javamen.go.pro.model.Developer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Владислав on 28.05.2017.
 */
@Repository
public class DevelopersDAO {

    private List<Developer> developerList = Arrays.asList(new Developer(1,"FFFF",4,4),
            new Developer(2,"DDDD",2,2));

    public List<Developer> getAllDvelopers(){
        return developerList;
    }

}
