package lt.viko.eif.marmomkus.soaptask;

import lt.viko.eif.marmomkus.soaptask.model.Car;
import lt.viko.eif.marmomkus.soaptask.model.CarRepair;
import org.springframework.stereotype.Component;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Component
public class CarRepository
{
    private CarRepair carrepair;

    public CarRepository(CarRepair carrepair) {this.carrepair = carrepair;}

    public Car get(Integer id)
    {

        return carrepair.getCars().stream().filter(film -> film.getId() == id).findFirst().orElse(null);//carRepair.getFilms().stream().filter(car -> car.getId() == id).findFirst().orElse(null)
    }

    public List<Car> getAll(){
        return carrepair.getCars();
    }

    public void insert(Car car){
        carrepair.getCars().add(car);
    }

    public void update(Car car)
    {
        Car car1 = this.get(car.getId());
        Integer integer = carrepair.getCars().indexOf(car1);
        carrepair.getCars().set(integer, car);
    }

    public void delete(Integer id){
        carrepair.getCars().remove(this.get(id));
    }
}
