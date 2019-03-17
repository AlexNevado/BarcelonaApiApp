package POJOs;

public class Price {

    private String vehicleType;
    private String fractionType;
    private String fractionTypeDesc;
    private String minutes;
    private String priceAmount;

    public Price(String vehicleType, String fractionType, String fractionTypeDesc, String minutes, String priceAmount) {
        this.vehicleType = vehicleType;
        this.fractionType = fractionType;
        this.fractionTypeDesc = fractionTypeDesc;
        this.minutes = minutes;
        this.priceAmount = priceAmount;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getFractionType() {
        return fractionType;
    }

    public void setFractionType(String fractionType) {
        this.fractionType = fractionType;
    }

    public String getFractionTypeDesc() {
        return fractionTypeDesc;
    }

    public void setFractionTypeDesc(String fractionTypeDesc) {
        this.fractionTypeDesc = fractionTypeDesc;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }
}
