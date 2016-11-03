import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;


public class Device {

    // Variables
    String address;
    String bridgeURI;
    String deviceStatusAPi = "/status/device/";
    String url;
    JSONObject json;

    // Ties the device to an address
    public Device(String address) { this.address = address; }

    // Constructs device
    public Device(String address, String host, String port) {

        this.address = address;
        bridgeURI = "\"http://\"" + deviceStatusAPi +   "\":\" + " + port;
    }

    // Get address value
    public String getAddress() {
        return address;
    }

    public JSONObject getValue() throws JSONException, MalformedURLException, IOException {

        //url = bridgeURI + deviceStatusAPi + "?addr=" + address;
        url = "http://ip.jsontest.com/";
        json = new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));
        return json;
    }
}