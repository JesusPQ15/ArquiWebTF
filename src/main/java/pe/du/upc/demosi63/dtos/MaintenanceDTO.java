package pe.du.upc.demosi63.dtos;


import pe.du.upc.demosi63.entities.Vehicle;

import java.time.LocalDate;

public class MaintenanceDTO {
    private  int idMaintenance;
    private LocalDate dateMaintenance;
    private  double priceMaintenance;
    private  String descriptionMaintenance;

    private Vehicle ve;

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public LocalDate getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(LocalDate dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public double getPriceMaintenance() {
        return priceMaintenance;
    }

    public void setPriceMaintenance(double priceMaintenance) {
        this.priceMaintenance = priceMaintenance;
    }

    public String getDescriptionMaintenance() {
        return descriptionMaintenance;
    }

    public void setDescriptionMaintenance(String descriptionMaintenance) {
        this.descriptionMaintenance = descriptionMaintenance;
    }

    public Vehicle getVe() {
        return ve;
    }

    public void setVe(Vehicle ve) {
        this.ve = ve;
    }
}
