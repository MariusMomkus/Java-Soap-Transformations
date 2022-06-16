package lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car;
import lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car.entity.Car;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory
{


    public ObjectFactory() {
    }

    public InsertCarResponse createInsertCarResponse() {
        return new InsertCarResponse();
    }

    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    public GetCarResponse createGetCarResponse() {
        return new GetCarResponse();
    }

    public Car createFilm() {
        return new Car();
    }

    public GetCarsRequest createGetCarsRequest() {
        return new GetCarsRequest();
    }

    public InsertCarRequest createInsertCarRequest() {
        return new InsertCarRequest();
    }

    public UpdateCarResponse createUpdateCarResponse() {
        return new UpdateCarResponse();
    }

    public UpdateCarRequest createUpdateCarRequest() {
        return new UpdateCarRequest();
    }

    public GetCarsResponse createGetCarsResponse() {
        return new GetCarsResponse();
    }

    public DeleteCarRequest createDeleteCarRequest() {
        return new DeleteCarRequest();
    }

    public DeleteCarResponse createDeleteCarResponse() {
        return new DeleteCarResponse();
    }

    public GetCarRequest createGetCarRequest() {
        return new GetCarRequest();
    }

}
