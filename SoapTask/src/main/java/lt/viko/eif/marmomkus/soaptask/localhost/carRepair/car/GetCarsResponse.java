package lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car;

import lt.viko.eif.marmomkus.soaptask.model.Car;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "cars"
})
@XmlRootElement(name = "getCarsResponse")
public class GetCarsResponse extends GetCarResponse {

    protected List<Car> cars;

    public List<Car> getCars() {
        if (cars == null) {
            cars = new ArrayList<Car>();
        }
        return this.cars;
    }

}
