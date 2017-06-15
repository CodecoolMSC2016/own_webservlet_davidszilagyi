package src.routes;

import com.sun.net.httpserver.HttpExchange;
import src.annotation.WebRoute;

import java.io.IOException;

/**
 * Created by David Szilagyi on 2017. 06. 14..
 */
public abstract class MainRoute {
    @WebRoute(method = "GET")
    public abstract void handleGET(HttpExchange t) throws IOException;

    @WebRoute(method = "POST")
    public abstract void handlePOST(HttpExchange t) throws IOException;

    @WebRoute(method = "PUT")
    public abstract void handlePUT(HttpExchange t) throws IOException;

    @WebRoute(method = "DELETE")
    public abstract void handleDELETE(HttpExchange t) throws IOException;
}
