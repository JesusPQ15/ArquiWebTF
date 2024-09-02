package pe.du.upc.demosi63.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.du.upc.demosi63.dtos.VehicleDTO;
import pe.du.upc.demosi63.entities.Vehicle;
import pe.du.upc.demosi63.servicesinterfaces.IVehicleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehiculos")
public class VehicleController {

    @Autowired
    private IVehicleService vs;

    @PostMapping
    public void registrar(@RequestBody VehicleDTO dto) {
        ModelMapper m = new ModelMapper();
        Vehicle d = m.map(dto, Vehicle.class);
        vs.insert(d);
    }

    @GetMapping
    public List<VehicleDTO> listar() {
        return vs.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VehicleDTO.class);
        }).collect(Collectors.toList());
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        vs.delete(id);
    }

    @GetMapping("/{id}")
    public VehicleDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        VehicleDTO dto=m.map(vs.listId(id),VehicleDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody VehicleDTO dto) {
        ModelMapper m = new ModelMapper();
        Vehicle d = m.map(dto, Vehicle.class);
        vs.update(d);
    }

    @GetMapping("/buscar")
    public List<VehicleDTO> buscar(@RequestParam String placa) {
        return vs.buscar(placa).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VehicleDTO.class);
        }).collect(Collectors.toList());
    }

}
