package infres.ws.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AppServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(8070).addService(new BookHotelRoom()).build();

        server.start();
        server.awaitTermination();

    }
}
