package com.github.dalwid.conversor.http;

import com.github.dalwid.conversor.model.Coins;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    private URI uri;
    private String key = "";

    private Coins getHttp(URI uri) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();

        return gson.fromJson(response.body(), Coins.class);
    }

    private Coins uri(String uri) throws IOException, InterruptedException {
        this.uri = URI.create(uri);
        return this.getHttp(this.uri);
    }

    public Coins convertAnyCoinsAndReverse(String coin1, String coin2, double value) throws IOException, InterruptedException {
        String convert = "https://v6.exchangerate-api.com/v6/"+key+"/pair/"+coin1+"/"+coin2+"/"+value;
        return this.uri(convert);
    }

}
