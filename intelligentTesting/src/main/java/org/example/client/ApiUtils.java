package org.example.client;

public class ApiUtils {
    public static final String BASE_URL = "http://localhost:8080";

    public static ApiService getSOServer(){
        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }
}
