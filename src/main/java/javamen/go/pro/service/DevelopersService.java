package javamen.go.pro.service;

import javamen.go.pro.dao.DevelopersDAO;
import javamen.go.pro.model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Владислав on 21.05.2017.
 */
@Service
public class DevelopersService {
    @Autowired
    private DevelopersDAO developersDAO;

    public List<Developer> getDevelopers(){
        return developersDAO.getAllDvelopers();
    }
}
