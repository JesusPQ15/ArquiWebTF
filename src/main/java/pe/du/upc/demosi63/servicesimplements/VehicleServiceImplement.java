package pe.du.upc.demosi63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.du.upc.demosi63.entities.Vehicle;
import pe.du.upc.demosi63.repositories.IVehicleRepository;
import pe.du.upc.demosi63.servicesinterfaces.IVehicleService;

import java.util.List;

@Service
public class VehicleServiceImplement implements IVehicleService {
    @Autowired
    private IVehicleRepository vR;

    @Override
    public void insert(Vehicle vehicle) {
        vR.save(vehicle);
    }

    @Override
    public List<Vehicle> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int idVehicle) {
        vR.deleteById(idVehicle);
    }

    @Override
    public Vehicle listId(int idVehicle) {
        return vR.findById(idVehicle).orElse(new Vehicle());
    }

    @Override
    public void update(Vehicle vehicle) {
        vR.save(vehicle);
    }

    @Override
    public List<Vehicle> buscar(String placa) {
        return vR.buscarPorPlaca(placa);
    }
}
