package OOP;

public class Car {
    private int maxspeed;
    private String model;
    private int volume;

    public Car(String model) {
        this.model = model;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public void setMaxspeed(int maxspeed) {
        if (maxspeed>400){

        }else
            this.maxspeed = maxspeed ;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "OOP.Car{" +
                "maxspeed=" + maxspeed +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }
}
