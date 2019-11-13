public class Mercedes extends Car implements TopSpeed {
    @Override
    public Integer getMaxSpeed(){
        return 190;
    }

    @Override
    public void setColor(String color) {
        super.setColor("Black");
    }

    @Override
    public void setGas(Boolean gas) {
        super.setGas(false);
    }

    @Override
    public void setVolume(Double volume) {
        super.setVolume(34.0);
    }

    @Override
    public void setHorsePower(Double horsePower) {
        super.setHorsePower(45.3);
    }
}
