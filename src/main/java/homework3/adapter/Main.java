package homework3.adapter;

public class Main {
    public static void main(String[] args) {
        XiaomiAdapter xiaomiAdapter = new XiaomiAdapter(new XiaomiLampApi());
        xiaomiAdapter.turnOn();
        xiaomiAdapter.turnOff();

        PhilipsHueAdapter philipsHueAdapter = new PhilipsHueAdapter(new PhilipsHueApi());
        philipsHueAdapter.turnOn();
        philipsHueAdapter.turnOff();
    }
}
