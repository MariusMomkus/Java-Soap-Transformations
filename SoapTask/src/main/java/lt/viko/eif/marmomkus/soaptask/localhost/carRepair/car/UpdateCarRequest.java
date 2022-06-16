package lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car;
import lt.viko.eif.marmomkus.soaptask.model.Car;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "car"
})
@XmlRootElement(name = "updateCarRequest")
public class UpdateCarRequest {

    @XmlElement(required = true)
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car value) {
        this.car = value;
    }

}
