package com.okta.demo;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

/**
 * Okta API Gateway.
 * 
 * @author Hung
 */
public class OktaAPI {

    public static AppLink[] getAppLinks(String login) {
        try {
            String endpoint = "https://dev-197134.oktapreview.com/api/v1/users/" + login + "/appLinks";
            String resp = Request.Get(endpoint)
                    .addHeader("Accept", "application/json")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", "SSWS 00BQU9KvpIZ0heCpFkQ0QqfEYikBp2NNs2-iDiCr11")
                    .connectTimeout(1000)
                    .socketTimeout(1000)
                    .execute()
                    .returnContent()
                    .asString();
                    
            Gson gson = new Gson();
            AppLink[] apps = gson.fromJson(resp, AppLink[].class);
            
            return apps;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(OktaAPI.getAppLinks("hungusyd@gmail.com"));
    }
}