import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Bridge {


    public static void main(String[] args) throws IOException, JSONException {

        //Device device = new Device();
        //String url = "https://localhost:1337/status/device/?addr=0xE8eb35AFBA98fdE9071308b4F7cfB844EE5bf666";
        String url = "http://ip.jsontest.com/";
        JSONObject json = new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));
        System.out.println(json.toString());

    }
}
