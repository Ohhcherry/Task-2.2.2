package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarsDao;
import web.dao.CarsDaoImpl;
import web.models.Cars;

import java.util.List;
@Component
public class CarsServiceImpl implements CarsService {

    private CarsDao carsDao = new CarsDaoImpl();
    @Override
    public  List<Cars> gerCarsList(Integer count){
        return carsDao.gerCarsList(count);
    }
}
