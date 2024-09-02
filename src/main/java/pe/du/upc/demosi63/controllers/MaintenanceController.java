package pe.du.upc.demosi63.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.du.upc.demosi63.dtos.MaintenanceDTO;
import pe.du.upc.demosi63.entities.Maintenance;
import pe.du.upc.demosi63.servicesinterfaces.IMaintenanceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mantenimientos")
public class MaintenanceController {
    @Autowired
    private IMaintenanceService mS;

    @GetMapping("/listarprobandoruta")
    public List<MaintenanceDTO>listar(){
        return mS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MaintenanceDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody MaintenanceDTO dto){
        ModelMapper m=new ModelMapper();
        Maintenance ma=m.map(dto, Maintenance.class);
        mS.insert(ma);
    }
}
