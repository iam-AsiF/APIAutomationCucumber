package Core;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import org.apache.http.params.CoreConnectionPNames;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ApiCall {
    public static Response getCall(HashMap<String, Object> headers, String path) {
        System.out.println("Control here in api call");
        System.out.println(RestAssured.baseURI + path);
        //Response getResponse = given().urlEncodingEnabled(false).headers(headers).auth().preemptive().basic("username","").when().get(path);
        Response getResponse;
        getResponse = given().urlEncodingEnabled(false).headers(headers).when().get(path);

        return getResponse;

    }
    public static Response postCall(HashMap<String, Object> headers, String body, String path) {
        System.out.println(path);
        System.out.println(headers);
        //Added RestAssuredConfig ConnectionTimeout here for POC.
        RestAssuredConfig config = RestAssured.config()
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 1000));


        Response postResponse;
        if (body != null) {
            //postResponse = given().urlEncodingEnabled(false).config(config).headers(headers).auth().preemptive().basic(username,"").when().body(body).post(path);
            postResponse = given().urlEncodingEnabled(false).config(config).headers(headers).when().body(body).post(path);
            return postResponse;
        } else {
            postResponse = given().config(config).headers(headers).when().body(body).post(path);
            return postResponse;
        }
    }

    public static Response putCall(HashMap<String, Object> headers, String body, String path) {
        System.out.println(path);
        System.out.println(headers);
        //Added RestAssuredConfig ConnectionTimeout here for POC.
        RestAssuredConfig config = RestAssured.config()
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 1000));


        Response putResponse;
        if (body != null) {
            //putResponse = given().urlEncodingEnabled(false).config(config).headers(headers).auth().preemptive().basic(username,"").when().body(body).post(path);
            putResponse = given().urlEncodingEnabled(false).config(config).headers(headers).when().body(body).post(path);
            return putResponse;
        } else {
            putResponse = given().config(config).headers(headers).when().body(body).post(path);
            return putResponse;
        }
    }

    public static Response patchCall(HashMap<String, Object> headers, String body, String path) {
        System.out.println(path);
        System.out.println(headers);
        //Added RestAssuredConfig ConnectionTimeout here for POC.
        RestAssuredConfig config = RestAssured.config()
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 1000));


        Response patchResponse;
        if (body != null) {
            //patchResponse = given().urlEncodingEnabled(false).config(config).headers(headers).auth().preemptive().basic(username,"").when().body(body).post(path);
            patchResponse = given().urlEncodingEnabled(false).config(config).headers(headers).when().body(body).post(path);
            return patchResponse;
        } else {
            patchResponse = given().config(config).headers(headers).when().body(body).post(path);
            return patchResponse;
        }
    }





}