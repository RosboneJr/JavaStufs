
public class SpecialItem {
    private String type;
    private int delay;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public SpecialItem(String type, int delay, String color) {
        this.type = type;
        this.delay = delay;
        this.color = color;
    }
}

