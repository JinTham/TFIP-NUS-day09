
    import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GuessServer {
    public static void main(String[] args) throws IOException{
        //Setup port
        int port = 3000;
        if (args.length>0){
            port = Integer.parseInt(args[0]);
        }
        System.out.printf("Starting server on port %d\n",port);
        ServerSocket server = new ServerSocket(port);
        while (true){
            //Wait for a connection
            System.out.println("Waiting for incoming connection");
            Socket sConn = server.accept();
            System.out.println("Got a connection");
            //Start threading
            Thread thread = new Thread(new GuessNum(sConn));
            thread.start();
        }
    }
}
