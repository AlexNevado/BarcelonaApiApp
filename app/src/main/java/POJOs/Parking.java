package POJOs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Parking implements Serializable {

    private String parkingCode;
    private String name;
    private String address;
    private ArrayList<Access> parkingAccessList;
    private String maxWidth;
    private String maxHeight;
    private boolean isGuarded;
    private boolean isInfoPoint;
    private String scheduleOpen;
    private String scheduleClosed;
    private boolean isExterior;
    private boolean isHandicapped;
    private boolean isElectric;
    private boolean isWC;
    private boolean isElevator;
    private boolean isConsigna;
    private ArrayList<Price> parkingPriceList;
    private String referenceTarif;
    private String owner;
    private String parkingType;

    public Parking(){

    }

    public String getParkingCode() {
        return parkingCode;
    }

    public void setParkingCode(String parkingCode) {
        this.parkingCode = parkingCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Access> getParkingAccessList() {
        return parkingAccessList;
    }

    public void setParkingAccessList(ArrayList<Access> parkingAccessList) {
        this.parkingAccessList = parkingAccessList;
    }

    public String getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }

    public String getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    public boolean isGuarded() {
        return isGuarded;
    }

    public void setGuarded(boolean guarded) {
        isGuarded = guarded;
    }

    public boolean isInfoPoint() {
        return isInfoPoint;
    }

    public void setInfoPoint(boolean infoPoint) {
        isInfoPoint = infoPoint;
    }

    public String getScheduleOpen() {
        return scheduleOpen;
    }

    public void setScheduleOpen(String scheduleOpen) {
        this.scheduleOpen = scheduleOpen;
    }

    public String getScheduleClosed() {
        return scheduleClosed;
    }

    public void setScheduleClosed(String scheduleClosed) {
        this.scheduleClosed = scheduleClosed;
    }

    public boolean isExterior() {
        return isExterior;
    }

    public void setExterior(boolean exterior) {
        isExterior = exterior;
    }

    public boolean isHandicapped() {
        return isHandicapped;
    }

    public void setHandicapped(boolean handicapped) {
        isHandicapped = handicapped;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isWC() {
        return isWC;
    }

    public void setWC(boolean WC) {
        isWC = WC;
    }

    public boolean isElevator() {
        return isElevator;
    }

    public void setElevator(boolean elevator) {
        isElevator = elevator;
    }

    public boolean isConsigna() {
        return isConsigna;
    }

    public void setConsigna(boolean consigna) {
        isConsigna = consigna;
    }

    public ArrayList<Price> getParkingPriceList() {
        return parkingPriceList;
    }

    public void setParkingPriceList(ArrayList<Price> parkingPriceList) {
        this.parkingPriceList = parkingPriceList;
    }

    public String getReferenceTarif() {
        return referenceTarif;
    }

    public void setReferenceTarif(String referenceTarif) {
        this.referenceTarif = referenceTarif;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getParkingType() {
        return parkingType;
    }

    public void setParkingType(String parkingType) {
        this.parkingType = parkingType;
    }


}
