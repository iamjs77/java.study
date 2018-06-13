package org.windfree.net;

import org.windfree.net.server.TcpServer;

public class App {
    public static void main(String[] args) {
        TcpServer server = new TcpServer(7000);
        server.start();
        System.out.println(System.getProperty("user.dir"));
        System.out.println("TCP Server start.");
        while(true) {
            try {
                Thread.sleep(1000   );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
