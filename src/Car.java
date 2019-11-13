import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car {
    private String color;
    private Double horsePower;
    private Double volume;
    private Boolean isGas;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Double horsePower) {
        this.horsePower = horsePower;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Boolean getGas() {
        return isGas;
    }

    public void setGas(Boolean gas) {
        isGas = gas;
    }



}
