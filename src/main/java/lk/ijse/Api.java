package lk.ijse;

import okhttp3.*;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import java.io.IOException;



    public class Api{
        private static final OkHttpClient client = new OkHttpClient();
        private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

        public static void main(String[] args) {

            String getUrl = "GET /api/users/{id}";
            try {
                String getResponse = doGetRequest(getUrl);
                System.out.println("GET Response: " + getResponse);
            } catch (IOException e) {
                e.printStackTrace();
            }


            String postUrl = "POST /api/users";
            String jsonBody = "{\"key\": \"value\"}";
            try {
                String postResponse = doPostRequest(postUrl, jsonBody);
                System.out.println("POST Response: " + postResponse);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String doGetRequest(String url) throws IOException {
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            }
        }

        public static String doPostRequest(String url, String json) throws IOException {
            RequestBody body = RequestBody.create(JSON, json);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            }
        }
    }


