package src.routes;

import src.annotation.WebRoute;
import com.sun.net.httpserver.HttpExchange;
import src.handler.MainHandler;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by David Szilagyi on 2017. 06. 13..
 */
@WebRoute(path = "/user")
public class UserRoute extends MainHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
        String response = "This is the user route";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
