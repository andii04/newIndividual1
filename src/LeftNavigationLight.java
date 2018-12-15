public class LeftNavigationLight implements ILeftNavigationLight{
    private String id;
    private boolean isOn;
    private String manufacturer;
    private Position position;
    private LightType lightType;

    public LeftNavigationLight(String id, boolean isOn, String manufacturer, Position position, LightType lightType) {
        this.id = id;
        this.isOn = isOn;
        this.manufacturer = manufacturer;
        this.position = position;
        this.lightType = lightType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Position getPosition() {
        return position;
    }

    public LightType getLightType() {
        return lightType;
    }

    //methods from interface
    @Override
    public void off() {
        isOn= false;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void setLightType(LightType lightType) {
        this.lightType = lightType;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
}
