package pe.du.upc.demosi63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.du.upc.demosi63.entities.Maintenance;
@Repository
public interface IMaintenanceRepository extends JpaRepository<Maintenance,Integer> {
}
