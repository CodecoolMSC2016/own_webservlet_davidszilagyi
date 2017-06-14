package src;

import com.sun.net.httpserver.HttpServer;
import src.handler.MainHandler;
import java.net.InetSocketAddress;

/**
 * Created by David Szilagyi on 2017. 06. 13..
 */
public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new MainHandler());
        server.start();
    }
}
