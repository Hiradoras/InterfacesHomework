public class Lamborghini extends Car  implements TopSpeed {
    @Override
    public Integer getMaxSpeed(){
        return 210;
    }

    @Override
    public void setHorsePower(Double horsePower) {
        super.setHorsePower(43.2);
    }

    @Override
    public void setVolume(Double volume) {
        super.setVolume(43.5);
    }

    @Override
    public void setGas(Boolean gas) {
        super.setGas(false);
    }

    @Override
    public void setColor(String color) {
        super.setColor("Red");
    }
}
