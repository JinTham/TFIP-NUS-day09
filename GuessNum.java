import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class GuessNum implements Runnable{
    private Socket sConn;
    //Constructors
    public GuessNum (Socket sConn){
        this.sConn = sConn;
    }
    //Methods
    @Override
    public void run() {
        try (//Output and input stream
            OutputStream os = this.sConn.getOutputStream()) {
            DataOutputStream dos = new DataOutputStream(os);
            InputStream is = this.sConn.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            //Game start
            Random rand = new Random();
            Integer guessNum = rand.nextInt(100);
            String clientGuess = "0";
            String reply;
            System.out.println(Thread.currentThread().getName()+" game start. The answer is "+guessNum);
            while (!clientGuess.equals(String.valueOf(guessNum))){
                clientGuess = dis.readUTF();
                if (clientGuess.equals("exit")){
                    System.out.println("Client give up");
                    break;
                }
                System.out.printf("%s Client guess %s\n",Thread.currentThread().getName(),clientGuess);
                if (Integer.parseInt(clientGuess) < guessNum){
                    reply = "Go higher!\n";
                } else if (Integer.parseInt(clientGuess) > guessNum){
                    reply = "Go lower!\n";
                } else {
                    reply = "You got it right!\n";
                }
                dos.writeUTF(reply);
                dos.flush();
            }
            dis.close();
            is.close();
            dos.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}