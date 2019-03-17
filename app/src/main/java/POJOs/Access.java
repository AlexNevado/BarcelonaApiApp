package POJOs;

public class Access {

    private String accessID;
    private String accessAddress;
    private String longitude;
    private String latitude;

    public Access(String accessID, String accessAddress, String longitude, String latitude) {
        this.accessID = accessID;
        this.accessAddress = accessAddress;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getAccessID() {
        return accessID;
    }

    public void setAccessID(String accessID) {
        this.accessID = accessID;
    }

    public String getAccessAddress() {
        return accessAddress;
    }

    public void setAccessAddress(String accessAddress) {
        this.accessAddress = accessAddress;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
