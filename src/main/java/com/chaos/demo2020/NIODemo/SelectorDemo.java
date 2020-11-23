package com.chaos.demo2020.NIODemo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

public class SelectorDemo {
    public static void main(String[] args) throws IOException {
        SocketChannel channel = SocketChannel.open(new InetSocketAddress("www.baidu.com",80));
        Selector selector = Selector.open();
        int select = selector.select();
        SelectionKey register = channel.register(selector, SelectionKey.OP_READ);

        System.out.println(select);
        int interestSet = register.interestOps();
        System.out.println(interestSet);
        System.out.println(interestSet & SelectionKey.OP_ACCEPT);
    }
}
