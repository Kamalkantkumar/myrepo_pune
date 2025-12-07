package com.technoelevate.javamock;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FacebookGraphApiExample {

    public static void main(String[] args) {
        try {
            // Specify the Facebook Graph API endpoint
            String apiUrl = "https://graph.facebook.com/v17.0/200633053129010/messages";

            // Replace with your actual page access token
            String accessToken = "YOUR_PAGE_ACCESS_TOKEN";

            // Build the JSON payload
            String payload = "{"
                    + "\"messaging_product\": \"whatsapp\","
                    + "\"to\": \"917799313094\","
                    + "\"type\": \"template\","
                    + "\"template\": {"
                        + "\"name\": \"hello_world\","
                        + "\"language\": {"
                            + "\"code\": \"en_US\""
                        + "}"
                    + "}"
                + "}";

            // Create the HTTP connection
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + accessToken);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Send the POST request
            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                wr.writeBytes(payload);
                wr.flush();
            }

            // Get the response
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                System.out.println("Response: " + response.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
