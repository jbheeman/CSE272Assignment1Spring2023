package com.luence.app;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;


class APISynonym {

    static String getSynonym(String word) {
        try {
            URL url = new URL("https://api.api-ninjas.com/v1/thesaurus?word=" + word);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Api-Key", "0LpH0kmFzmnmoZDn+nValw==MFjrJmsDbv5JrDuQ");
            InputStream responseStream = connection.getInputStream();

            Scanner s = new Scanner(responseStream).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";
            String data = result.split("\\[")[1].split("]")[0];
            return data;
        }
        catch (Exception e) {
            System.out.println("Hello");
            System.out.println(e);
            return "";
        }
    }

//    public static void main(String args[]) {
//        Main.getSynonym();
//    }
}
