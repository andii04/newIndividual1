public abstract class Airplane implements IAirplane{

    protected int buildYear;
    protected boolean isClosed;
    protected boolean isLocked;
    protected boolean isOpen;
    protected boolean isUnlocked;
    protected int maxSpeed;
    protected String name;
    protected Wing wingLeft,wingRight;
    protected RightNavigationLight rightNavigationLight;
    protected LeftNavigationLight leftNavigationLight;

    public Airplane(int buildYear, boolean isClosed, boolean isLocked, boolean isOpen, boolean isUnlocked, int maxSpeed, String name) {
        this.buildYear = buildYear;
        this.isClosed = isClosed;
        this.isLocked = isLocked;
        this.isOpen = isOpen;
        this.isUnlocked = isUnlocked;
        this.maxSpeed = maxSpeed;
        this.name = name;

        //erzeuge Wings
        wingLeft = new Wing(40,"Wing Left");
        wingRight = new Wing(40,"Wing Right");

        //erzeuge NavigationLights
        leftNavigationLight = new LeftNavigationLight("1",false,"leftNavLight",Position.port,LightType.green);
        rightNavigationLight = new RightNavigationLight("2",false,"rightNavLight",Position.port,LightType.green);

    }




    //methods from interface
    @Override
    public void brake(int Speed) {
        this.maxSpeed = maxSpeed -10;
    }

    @Override
    public void closeDoors() {
        isClosed = true;
    }

    @Override
    public void greeting(String content) {
        System.out.println("Hello on Board");
    }

    @Override
    public void leftTurn() {

    }

    @Override
    public void lockDoors() {
        isLocked = true;
    }

    @Override
    public void openDoors() {
        isOpen = true;
    }

    @Override
    public void rightTurn() {

    }

    @Override
    public void speed() {
        System.out.println("Show speed");
    }

    @Override
    public void UnlockDoors() {
        isUnlocked = true;
    }


}
