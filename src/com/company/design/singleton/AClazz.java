package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
