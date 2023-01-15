
package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.models.Cars;
import web.service.CarsServiceImpl;
import java.util.List;

@Controller
public class CarsController {

    private final CarsServiceImpl carsService;
    @Autowired
    public CarsController(CarsServiceImpl carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5", required = false) Integer count) {
        List<Cars> viewCars = carsService.index(count);
        model.addAttribute("allCars", viewCars);
        return "cars";
        }
    }
