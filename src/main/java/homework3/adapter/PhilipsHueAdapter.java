package homework3.adapter;

public class PhilipsHueAdapter implements SmartLamp {
    private PhilipsHueApi philipsHueApi;

    public PhilipsHueAdapter(PhilipsHueApi philipsHueApi) {
        this.philipsHueApi = philipsHueApi;
    }

    @Override
    public void turnOn() {
        philipsHueApi.sendMessage("ON");
    }

    @Override
    public void turnOff() {
        philipsHueApi.sendMessage("OFF");
    }

}
