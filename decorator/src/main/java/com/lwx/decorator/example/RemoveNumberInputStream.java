package com.lwx.decorator.example;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-03-03
 * Time: 12:11
 */
public class RemoveNumberInputStream extends FilterInputStream {

    protected RemoveNumberInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        //获取返回的字节，如果是文件末尾返回-1
        int c = super.read();
        if (c != -1) {
            //判断字节是否为数字
            if (Character.isDigit(c)) {
                // '\0' 代表空字符
                char empty = '\0';
                return empty;
            }
        }
        return c;
    }
}
