package com.lwx.decorator.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-03
 * Time: 12:33
 */
public class InputStreamTest {

    public static void main(String[] args) {
        try {
            int c;
            InputStream inputStream = new FileInputStream("D:\\test.txt");
            RemoveNumberInputStream in = new RemoveNumberInputStream(inputStream);
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

