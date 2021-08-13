package com.company.design.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
