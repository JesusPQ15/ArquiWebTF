package pe.du.upc.demosi63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Maintenance")
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idMaintenance;
    @Column(name = "dateMaintenance",nullable = false)
    private LocalDate dateMaintenance;
    @Column(name = "priceMaintenance",nullable = false)
    private  double priceMaintenance;
    @Column(name = "descriptionMaintenance",nullable = false,length = 500)
    private  String descriptionMaintenance;
    @ManyToOne
    @JoinColumn(name = "idVehicle")
    private  Vehicle ve;

    public Maintenance() {
    }

    public Maintenance(int idMaintenance, LocalDate dateMaintenance, double priceMaintenance, String descriptionMaintenance, Vehicle ve) {
        this.idMaintenance = idMaintenance;
        this.dateMaintenance = dateMaintenance;
        this.priceMaintenance = priceMaintenance;
        this.descriptionMaintenance = descriptionMaintenance;
        this.ve = ve;
    }

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
