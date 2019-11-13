public class Wolksvogen extends Car  implements TopSpeed {

    @Override
    public Integer getMaxSpeed() {
        return 180;
    }

    @Override
    public void setColor(String color) {
        super.setColor("Brown");
    }

    @Override
    public void setGas(Boolean gas) {
        super.setGas(false);
    }

    @Override
    public void setVolume(Double volume) {
        super.setVolume(42.2);
    }

    @Override
    public void setHorsePower(Double horsePower) {
        super.setHorsePower(25.4);
    }

}
