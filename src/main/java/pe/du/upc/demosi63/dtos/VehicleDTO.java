package pe.du.upc.demosi63.dtos;

import java.time.LocalDate;

public class VehicleDTO {
    private int idVehicle;
    private String plateVehicle;
    private  String brandVehicle;
    private String colorVehicle;
    private LocalDate purchaseDateVehicle;

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
