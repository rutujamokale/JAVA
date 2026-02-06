package com.tfl.socket;
import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket= new ServerSocket(5000);

            System.out.println("server started...");
            System.out.println("waiting for client");

            Socket socket = serverSocket.accept();

            System.out.println("client connected");


            BufferedReader in =
                    new BufferedReader(
                        new InputStreamReader(socket.getInputStream())
                    );

            PrintWriter out=
                    new PrintWriter(socket.getOutputStream(),true);     
                    
                    
            String message = in.readLine();
            
            System.out.println("client says :" + message);

            System.out.println("hello client ,I received" + message);

            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
