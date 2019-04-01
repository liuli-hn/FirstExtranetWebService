package com.dys.bs.test.socket;

import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.FramedataImpl1;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public class WebSockets extends WebSocketServer {


    private static int counter = 0;

    public static void main(String[] arg) {
        //启动WebSocketService

        WebSockets webSocketService = null;
        List<Draft_6455> draft_6455s = Collections.singletonList(new Draft_6455());
        System.out.println(draft_6455s);
        //webSocketService = new WebSockets(9002, new Draft_6455());

        //webSocketService.setConnectionLostTimeout(0);

        //webSocketService.start();

    }



    public WebSockets(int port, Draft d) {

        super(new InetSocketAddress(port), Collections.singletonList(d));

    }


    public WebSockets(InetSocketAddress address, Draft d) {
        super(address, Collections.singletonList(d));
        WebSockets webSockets = new WebSockets(null, null);
    }


    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {

        counter++;

        System.out.print("WebSocket Opened connection number" + counter);

        System.out.print("WebSocket onOpen:" + conn.getRemoteSocketAddress().getAddress().getHostAddress());

    }


    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {

        System.out.print("WebSocket closed:" + conn.getRemoteSocketAddress().getAddress().getHostAddress());

    }


    @Override
    public void onError(WebSocket conn, Exception ex) {

        ex.printStackTrace();

        System.out.print("WebSocket Error:" + ex.getMessage());

    }

    @Override
    public void onStart() {
        System.out.print("WebSocket Server started!");
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        conn.send(message);
    }

    @Override
    public void onMessage(WebSocket conn, ByteBuffer blob) {
        conn.send(blob);
    }

    @Override
    public void onWebsocketMessageFragment(WebSocket conn, Framedata frame) {
        FramedataImpl1 builder = (FramedataImpl1) frame;
        builder.setTransferemasked(false);
        conn.sendFrame(frame);
    }


}
