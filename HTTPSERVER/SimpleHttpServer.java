import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;
public class SimpleHttpServer {
    public static void main(String[] args) throws Exception {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for the Connection on port 8080....");
        while(true){
                // final Socket clientSocket = server.accept();
                // InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
                // BufferedReader reader = new BufferedReader(isr);
                // String line = reader.readLine();
                // while(!line.isEmpty()){
                //     System.out.println(line);
                //     line = reader.readLine();
                // }

                try(Socket socket = server.accept()){
                    Date today = new Date(12);
                    String httpresponse = "HTTP/1.1 200 OK\r\n\r\n" + today.toString();
                    socket.getOutputStream().write(httpresponse.getBytes("UTF-8"));

                }
        }
    }
}
