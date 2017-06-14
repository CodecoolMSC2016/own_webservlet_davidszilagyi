package src.routes;

import src.annotation.RouteMethod;
import src.annotation.WebRoute;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by David Szilagyi on 2017. 06. 13..
 */
@WebRoute(path = "/user")
public class UserRoute {

    @RouteMethod(method = "GET")
    public void handleGET(HttpExchange t) throws IOException {
        String response = "GET method invoked on \"/user\" path";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
        System.out.println(response);
    }

    @RouteMethod(method = "POST")
    public void handlePOST(HttpExchange t) throws IOException {
        String response = "POST method invoked on \"/user\" path";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
        System.out.println(response);
    }

    @RouteMethod(method = "PUT")
    public void handlePUT(HttpExchange t) throws IOException {
        String response = "PUT method invoked on \"/user\" path";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
        System.out.println(response);
    }

    @RouteMethod(method = "DELETE")
    public void handleDELETE(HttpExchange t) throws IOException {
        String response = "DELETE method invoked on \"/user\" path";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
        System.out.println(response);
    }
}
