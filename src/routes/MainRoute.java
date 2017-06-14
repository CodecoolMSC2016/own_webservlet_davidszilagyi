package src.routes;

import com.sun.net.httpserver.HttpExchange;
import src.annotation.WebRoute;

import java.io.IOException;

/**
 * Created by David Szilagyi on 2017. 06. 14..
 */
public interface MainRoute {
    @WebRoute(method = "GET")
    public void handleGET(HttpExchange t) throws IOException;

    @WebRoute(method = "POST")
    public void handlePOST(HttpExchange t) throws IOException;

    @WebRoute(method = "PUT")
    public void handlePUT(HttpExchange t) throws IOException;

    @WebRoute(method = "DELETE")
    public void handleDELETE(HttpExchange t) throws IOException;
}
