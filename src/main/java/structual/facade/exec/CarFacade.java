package structual.facade.exec;

public class CarFacade {
    public void  startCar(){

        Ignition ignition = new Ignition();
        Clutch clutch = new Clutch();
        Accelerator accelerator = new Accelerator();
        GearStick gearStick = new GearStick();
        HandBreak handBreak = new HandBreak();

        ignition.turnOn();
        clutch.press();
        gearStick.changeGear(1);
        accelerator.press();
        clutch.lift();
        handBreak.pushDown();
        accelerator.press();
        clutch.press();
    }
}
