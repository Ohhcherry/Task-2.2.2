package web.dao;

import web.models.Cars;

import java.util.List;

public interface CarsDao {

    List<Cars> gerCarsList(Integer count);

}
