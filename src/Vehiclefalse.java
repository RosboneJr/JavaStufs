public class Vehiclefalse {
    private String Brand;
    private int speed;
    private int distanceTraveled;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public Vehiclefalse(String brand, int speed) {
        this.Brand = brand;
        this.speed = speed;
        this.distanceTraveled = 0;
    }
    public void updateDistance(int speed){
        this.distanceTraveled = this.distanceTraveled + speed;

    }
    @Override
    public String toString(){
        return "Brand: "+ Brand + "; Speed " + speed + "; distancetraveled " + distanceTraveled;
    }
}
