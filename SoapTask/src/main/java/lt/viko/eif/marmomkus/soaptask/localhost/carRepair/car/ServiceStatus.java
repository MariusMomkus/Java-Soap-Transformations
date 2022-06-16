package lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceStatus", propOrder = {
    "statusCode",
    "message"
})
public class ServiceStatus {

    @XmlElement(required = true)
    protected String statusCode;
    @XmlElement(required = true)
    protected String message;


    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String value) {
        this.statusCode = value;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

}
