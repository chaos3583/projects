package com.chaos.demo2020.NIODemo;

import com.chaos.demo2020.sortDemo.SelectSort;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("/Users/liaopeng/Downloads/打包品项--20201118152610.xlsx","rw");
        FileChannel channel = accessFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1020);
        ByteBuffer buffer2 = ByteBuffer.allocate(1024);
        int read = channel.read(buffer);
        channel.read(buffer2);
        System.out.println(buffer.equals(buffer2));
        System.out.println(buffer.compareTo(buffer2));
        while (read!=-1){
            buffer.flip();
            while (buffer.hasRemaining()){
//                System.out.println(buffer.get());
            }
            buffer.clear();
        }
        accessFile.close();
    }
}
