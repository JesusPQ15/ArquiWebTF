package pe.du.upc.demosi63.servicesinterfaces;

import pe.du.upc.demosi63.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    public List<Maintenance> list();
    public void insert(Maintenance m);
}
