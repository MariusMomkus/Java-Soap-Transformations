package lt.viko.eif.marmomkus.soaptask.model;


import java.util.ArrayList;
import java.util.List;


public class CarRepair {
    private List<Car> cars = new ArrayList<>();

    public CarRepair() {
    }

    public CarRepair(int x) {

        this.cars.add(new Car("Bmw",1,1982,"2022/05/04","turbine"));
        this.cars.add(new Car("Opel",2,2022,"2022/05/05","fully rusting"));
        this.cars.add(new Car("Audi",3,2005,"2022/05/06","engine"));
        this.cars.add(new Car("dodge",4,1972,"2022/05-/07","gearbox"));
        this.cars.add(new Car("mazda",5,2007,"2022/05/08","electrical"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
