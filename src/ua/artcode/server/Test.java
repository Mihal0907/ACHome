package ua.artcode.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", httpExchange -> {
            System.out.println(httpExchange);
            System.out.println(httpExchange.getProtocol());
            System.out.println(httpExchange.getLocalAddress());

            System.out.println("server accepted a message");

            try (OutputStream outputStream = httpExchange.getResponseBody()) {
                String s = "Hello from server";
                httpExchange.sendResponseHeaders(200, s.length());
                outputStream.write(s.getBytes());
                outputStream.flush();
                outputStream.close();
            }
        });

        server.createContext("/post_info", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                if (httpExchange.getRequestBody().equals("POST")){
                    Scanner scanner = new Scanner(httpExchange.getRequestBody());
                    StringBuilder stringBuilder = new StringBuilder();
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
        });
        server.setExecutor(null);
        server.start();
        System.out.println("Server started");
    }
}
