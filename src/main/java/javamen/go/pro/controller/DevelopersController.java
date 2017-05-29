package javamen.go.pro.controller;

import javamen.go.pro.model.Developer;
import javamen.go.pro.service.DevelopersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * That class - controller for developers
 */
@Controller
@RequestMapping("/devs")
public class DevelopersController {


    @Autowired
    private DevelopersService developersService;


    @RequestMapping(value = "/list", method = RequestMethod.GET )
    public
    @ResponseBody
   String getAllDeveopers() {
      return developersService.getDevelopers().toString();
    }


}
