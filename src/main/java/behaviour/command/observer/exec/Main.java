package behaviour.command.observer.exec;

/*
 * Created by grebena1 on 27.05.2022
 * Description:
 */
public class Main {
    public static void main(String[] args) {

        City city1 = new City();
        City city2 = new City();
        TrafficUpdate trafficUpdate = new TrafficUpdate();

        city1.addPropertyListener(trafficUpdate);
        city2.addPropertyListener(trafficUpdate);

        city1.updateTraffic("traffic 1");
        city2.updateTraffic("traffic 2");

        trafficUpdate.getUpdates();
    }
}
