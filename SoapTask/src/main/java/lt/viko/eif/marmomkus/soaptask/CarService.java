package lt.viko.eif.marmomkus.soaptask;
import lt.viko.eif.marmomkus.soaptask.model.CarRepair;

public class CarService {

    private CarRepair carrepair = new CarRepair(1);

    private lt.viko.eif.marmomkus.soaptask.model.CarRepair CarRepair;
    public CarRepository carRepository = new CarRepository(CarRepair);

}
