package pe.du.upc.demosi63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.du.upc.demosi63.entities.Vehicle;

import java.util.List;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {
    @Query("SELECT d FROM Vehicle d WHERE d.plateVehicle LIKE %:placa%")
    public List<Vehicle> buscarPorPlaca(@Param("placa") String placa);
}
