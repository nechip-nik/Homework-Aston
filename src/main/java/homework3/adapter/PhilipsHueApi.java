package homework3.adapter;

public class PhilipsHueApi {
    public void sendMessage(String command) {
        if(command.equals("ON")) {
            System.out.println("Light is on");
        }
        else {
            System.out.println("Light is off");
        }
    }
}
