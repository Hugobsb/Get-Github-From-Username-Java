/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.getgitbyusername.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Scanner;
import org.json.*;

/**
 *
 * @author HUGOBASTOSDASILVABEN
 */
public final class ConnectionFactory {

    private JSONObject object;

    ConnectionFactory(String username) {
        try {
            JSONObject jsonObject = new JSONObject(callURL("https://api.github.com/users/"+username));
            
            setObject(jsonObject);
        } catch (JSONException e) {
            throw new RuntimeException("Exception while creating JSON Object: " + username, e);
        }
    }

    public JSONObject getObject() {
        return object;
    }

    public void setObject(JSONObject object) {
        this.object = object;
    }

    public static String callURL(String myURL) {
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        
        try {
            URL url = new URL(myURL);
            urlConn = url.openConnection();
            
            if (urlConn != null) {
                urlConn.setReadTimeout(60 * 1000);
            }
            
            if (urlConn != null && urlConn.getInputStream() != null) {
                in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
                
                try (BufferedReader bufferedReader = new BufferedReader(in)) {
                    int cp;
                    while ((cp = bufferedReader.read()) != -1) {
                        sb.append((char) cp);
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception while creating bufferedReader: " + myURL, e);
                }
            }
            
            in.close();
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:" + myURL, e);
        }

        return sb.toString();
    }
}
