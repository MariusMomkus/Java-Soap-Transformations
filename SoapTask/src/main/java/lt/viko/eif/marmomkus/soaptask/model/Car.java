package lt.viko.eif.marmomkus.soaptask.model;

public class Car {
    private String model;
    private int id;
    private double year;
    private String arrivalTime;
    private String issue;


    public Car() {
    }

    public Car(String model, int id, double year, String arrivalTime, String issue) {
        this.model = model;
        this.id = id;
        this.year = year;
        this.arrivalTime = arrivalTime;
        this.issue = issue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
