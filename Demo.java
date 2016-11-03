import org.json.JSONObject;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        Device device = new Device ("0xE8eb35AFBA98fdE9071308b4F7cfB844EE5bf666", "localhost", "1337");
        JSONObject status = device.getValue();
        System.out.println(status);

    }

}