package pe.du.upc.demosi63.servicesinterfaces;

import pe.du.upc.demosi63.entities.Vehicle;

import java.util.List;

public interface IVehicleService {
    public void insert(Vehicle vehicle);

    public List<Vehicle> list();

    public void delete(int idVehicle);

    public Vehicle listId(int idVehicle);

    public void update(Vehicle vehicle);

    public List<Vehicle> buscar(String placa);
}
