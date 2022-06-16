package lt.viko.eif.marmomkus.soaptask.endpoints;

import lt.viko.eif.marmomkus.soaptask.CarService;
import lt.viko.eif.marmomkus.soaptask.localhost.carRepair.car.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarEndpoint {
    private static final String URI = "http://localhost/carRepair/car";

    private final CarService carService;

    @Autowired
    public CarEndpoint(CarService carService) {
        this.carService = carService;
    }

    @PayloadRoot(namespace = URI, localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCar(@RequestPayload GetCarRequest request){
        GetCarResponse response = new GetCarResponse();
        response.setCar(carService.carRepository.get(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCars(@RequestPayload GetCarsRequest request){
        GetCarsResponse response = new GetCarsResponse();
        response.getCars().addAll(carService.carRepository.getAll());
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "insertCarRequest")
    @ResponsePayload
    public InsertCarResponse carResponse(@RequestPayload InsertCarRequest request){
        carService.carRepository.insert(request.getCar());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatusCode("201");
        serviceStatus.setMessage("Car was inserted");
        InsertCarResponse response = new InsertCarResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "updateCarRequest")
    @ResponsePayload
    public UpdateCarResponse updateCarResponse(@RequestPayload UpdateCarRequest request){
        carService.carRepository.update(request.getCar());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatusCode("202");
        serviceStatus.setMessage("Car was updated");
        UpdateCarResponse response = new UpdateCarResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = URI, localPart = "deleteCarRequest")
    @ResponsePayload
    public DeleteCarResponse deleteCarResponse(@RequestPayload DeleteCarRequest request){
        carService.carRepository.delete(request.getId());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatusCode("203");
        serviceStatus.setMessage("Car was deleted");
        DeleteCarResponse response = new DeleteCarResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }
}
