package lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {
        "model",
        "year",
        "arrivaltime",
        "issue",
        "cars"
})
public class Car {

    @XmlElement(required = true)
    protected String model;
    protected double year;

    @XmlElement(required = true)
    protected String arrivaltime;
    @XmlElement(required = true)
    protected String issue;
    protected List<String> cars;
    @XmlAttribute(name = "id")
    protected Integer id;


    public String getModel() {
        return model;
    }

    public void setModel(String value) {
        this.model = value;
    }


    public double getYear() {
        return year;
    }


    public void setYear(double value) {
        this.year = value;
    }


    public String getArrivaltime() {
        return arrivaltime;
    }


    public void setArrivaltime(String value) {
        this.arrivaltime = value;
    }


    public String getIssue() {
        return issue;
    }

    public void setIssue(String value) {
        this.issue = value;
    }


    public List<String> getCars() {
        if (cars == null) {
            cars = new ArrayList<String>();
        }
        return this.cars;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

}
