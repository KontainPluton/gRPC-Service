package infres.ws.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class App {
    public static void main(String[] args) {

        Server server = ServerBuilder.forPort(8080).addService(new HotelImpl()).build();

        server.start();
        server.awaitTermination();

    }
}
