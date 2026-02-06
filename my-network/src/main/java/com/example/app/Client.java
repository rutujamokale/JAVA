package com.example.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to server");

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

        
            out.println("Hello Server!");

            String response = in.readLine();
            System.out.println("Server replied: " + response);

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
