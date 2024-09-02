package pe.du.upc.demosi63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.du.upc.demosi63.entities.Maintenance;
import pe.du.upc.demosi63.repositories.IMaintenanceRepository;
import pe.du.upc.demosi63.servicesinterfaces.IMaintenanceService;

import java.util.List;

@Service
public class MaintenanceServiceImplement implements IMaintenanceService {
    @Autowired
    private IMaintenanceRepository mR;

    @Override
    public List<Maintenance> list() {
        return mR.findAll();
    }

    @Override
    public void insert(Maintenance m) {
        mR.save(m);
    }
}
