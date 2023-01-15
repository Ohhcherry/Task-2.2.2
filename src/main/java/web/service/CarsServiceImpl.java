package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarsDaoImpl;
import web.models.Cars;

import java.util.List;
@Component
public class CarsServiceImpl implements CarsService {

    CarsDaoImpl carsDao = new CarsDaoImpl();
    @Override
    public  List<Cars> index(Integer count){
        return carsDao.index(count);
    }
}
