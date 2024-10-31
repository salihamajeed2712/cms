import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    
    public static String FAQ(String a){
        String answer="";
        if(a.matches("1")){
            answer= "you have to signup and wait for the request approval";
            return answer;
         }
        else if(a.matches("2")){
            answer= "you can recover password with your CNIC";
            return answer;
         }
       else if(a.matches("3")){
            answer= "yes, you can visit office any time between 10AM to 1PM";
            return answer;
         }
       else if(a.matches("4")){
            answer= "there is an option in student portel to check your finial result";
            return answer;
         }
        else if(a.matches("5")){
            answer= "visit office for that";
            return answer;
         }
        
        else
        return null;
    }
    
    

    public static void main(String args[]) throws IOException {
       
        Socket socket;
        InputStreamReader inputStreamReader;
        OutputStreamWriter outputStreamWriter;
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        ServerSocket serversocket;

        serversocket = new ServerSocket(5555);
        while (true) {
            try {

                socket = serversocket.accept();

                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);

                while (true) {
                  
                    String msgFromClient = bufferedReader.readLine();
                    System.out.println("Client: " + msgFromClient);
                    String ans = FAQ(msgFromClient);
                    bufferedWriter.write(ans);//answer from server to clint
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    if (msgFromClient.equalsIgnoreCase("BYE")) {
                        break;
                    }
                   
                    break;

                }
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedReader.close();
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
