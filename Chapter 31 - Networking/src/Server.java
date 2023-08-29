import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (
                ServerSocket serverSocket = new ServerSocket(8080);
                Socket socket = serverSocket.accept();
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        ) {
            System.out.println(socket.getInetAddress().getHostName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
