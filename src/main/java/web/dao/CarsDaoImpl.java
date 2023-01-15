package web.dao;


import org.springframework.stereotype.Component;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDaoImpl implements CarsDao {
    @Override
    public List<Cars> index(Integer count) {
        List<Cars> cars;
        {
            cars = new ArrayList<>();
            cars.add(new Cars("Honda", "civic", 140));
            cars.add(new Cars("BMW", "3", 190));
            cars.add(new Cars("Mercedes", "gt", 600));
            cars.add(new Cars("Lada", "priora", 120));
            cars.add(new Cars("Lambo", "hurricane", 750));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
