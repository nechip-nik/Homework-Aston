package homework3.adapter;


public class XiaomiAdapter implements SmartLamp {
    private final XiaomiLampApi xiaomiApi;

    public XiaomiAdapter(XiaomiLampApi xiaomiApi) {
        this.xiaomiApi = xiaomiApi;
    }

    @Override
    public void turnOn() {
        xiaomiApi.connectXiaomiLampApi();
    }

    @Override
    public void turnOff() {
        xiaomiApi.disconnectXiaomiLampApi();
    }
}
