package LabTest.Practise.LabT1b.Friday;

public class Coordinates implements Comparable<Coordinates> {
    private double latitude;
    private double longitude;

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    @Override
    public int compareTo(Coordinates o) {
        return (this.latitude != o.getLatitude()) ? Double.compare(latitude, o.getLatitude())
                : Double.compare(longitude, o.getLongitude());
    }

    public boolean isValid() {
        return (latitude >= -90 && latitude <= 90) ? (longitude >= -180 && longitude <= 180) : false;
    }

    @Override
    public String toString() {
        return String.format("%10.2f %10.2f", latitude, longitude);
    }
}
