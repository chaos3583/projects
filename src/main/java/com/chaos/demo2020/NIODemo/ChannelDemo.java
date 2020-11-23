package com.chaos.demo2020.NIODemo;

import java.io.*;
import java.nio.channels.FileChannel;

public class ChannelDemo {
    public static void main(String[] args) throws FileNotFoundException {
        RandomAccessFile accessFile = new RandomAccessFile("/Users/liaopeng/Downloads/打包品项--20201118152610.xlsx","rw");
        FileChannel channel = accessFile.getChannel();

        FileInputStream fileInputStream = new FileInputStream("/Users/liaopeng/Downloads/打包品项--20201118152610.xlsx");
        FileChannel channel1 = fileInputStream.getChannel();

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/liaopeng/Downloads/打包品项--20201118152610.xlsx");
        fileOutputStream.getChannel();
    }
}
