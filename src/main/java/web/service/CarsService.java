package web.service;

import web.models.Cars;

import java.util.List;

public interface CarsService {
    List<Cars> gerCarsList(Integer count);
}
