package lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id"
})
@XmlRootElement(name = "deleteCarRequest")
public class DeleteCarRequest {

    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

}
