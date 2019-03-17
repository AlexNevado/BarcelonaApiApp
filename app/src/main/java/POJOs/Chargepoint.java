package POJOs;

import java.io.Serializable;

public class Chargepoint implements Serializable {
    private String ParkingID;
    private String ParkingName;
    private String Address;
    private String Lat;
    private String Lng;
    private String ParkingLevel;
    private String Place;
    private String Vehicle;
    private String ChargeBoxID;
    private String Schuko;
    private String Menneke;
    private String Status;
    private String Created;
    private String Updated;

    public Chargepoint() {}

    public String getParkingID() {
        return ParkingID;
    }

    public void setParkingID(String parkingID) {
        ParkingID = parkingID;
    }

    public String getParkingName() {
        return ParkingName;
    }

    public void setParkingName(String parkingName) {
        ParkingName = parkingName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLng() {
        return Lng;
    }

    public void setLng(String lng) {
        Lng = lng;
    }

    public String getParkingLevel() {
        return ParkingLevel;
    }

    public void setParkingLevel(String parkingLevel) {
        ParkingLevel = parkingLevel;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getVehicle() {
        return Vehicle;
    }

    public void setVehicle(String vehicle) {
        Vehicle = vehicle;
    }

    public String getChargeBoxID() {
        return ChargeBoxID;
    }

    public void setChargeBoxID(String chargeBoxID) {
        ChargeBoxID = chargeBoxID;
    }

    public String getSchuko() {
        return Schuko;
    }

    public void setSchuko(String schuko) {
        Schuko = schuko;
    }

    public String getMenneke() {
        return Menneke;
    }

    public void setMenneke(String menneke) {
        Menneke = menneke;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getUpdated() {
        return Updated;
    }

    public void setUpdated(String updated) {
        Updated = updated;
    }
}
