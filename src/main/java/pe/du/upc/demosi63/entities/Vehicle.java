package pe.du.upc.demosi63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehicle;
    @Column(name = "plateVehicle",nullable = false,length = 40)
    private String plateVehicle;
    @Column(name = "brandVehicle",nullable = false,length = 40)
    private  String brandVehicle;
    @Column(name = "colorVehicle",nullable = false,length = 40)
    private  String colorVehicle;
    @Column(name = "purchaseDateVehicle",nullable = false)
    private LocalDate purchaseDateVehicle;

    public Vehicle() {
    }

    public Vehicle(int idVehicle, String plateVehicle, String brandVehicle, String colorVehicle, LocalDate purchaseDateVehicle) {
        this.idVehicle = idVehicle;
        this.plateVehicle = plateVehicle;
        this.brandVehicle = brandVehicle;
        this.colorVehicle = colorVehicle;
        this.purchaseDateVehicle = purchaseDateVehicle;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getPlateVehicle() {
        return plateVehicle;
    }

    public void setPlateVehicle(String plateVehicle) {
        this.plateVehicle = plateVehicle;
    }

    public String getBrandVehicle() {
        return brandVehicle;
    }

    public void setBrandVehicle(String brandVehicle) {
        this.brandVehicle = brandVehicle;
    }

    public String getColorVehicle() {
        return colorVehicle;
    }

    public void setColorVehicle(String colorVehicle) {
        this.colorVehicle = colorVehicle;
    }

    public LocalDate getPurchaseDateVehicle() {
        return purchaseDateVehicle;
    }

    public void setPurchaseDateVehicle(LocalDate purchaseDateVehicle) {
        this.purchaseDateVehicle = purchaseDateVehicle;
    }
}
