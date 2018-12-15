public class Main {

    public static void main(String[] args) {

        /*Szenario: Es gibt einen A350, alle Passagiere sind eingestiegen, alle Türen geschlossen,
        das Flugzeug schaltet alle Navigationslichter ein und hebt ab*/

        A350 Airplane1 = new A350(1999,true,true,false,false,2000,"A350") {

        };
        Airplane1.closeDoors();
        Airplane1.lockDoors();
        Airplane1.greeting("Hello on Board");
        Airplane1.wingLeft.calibrate();
        Airplane1.wingRight.calibrate();
        Airplane1.leftNavigationLight.setOn(true);
        Airplane1.rightNavigationLight.setOn(true);


    }




}
