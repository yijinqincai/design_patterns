package com.lwx.state.example;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lwx
 * Date: 2019-04-08
 * Time: 21:54
 */
public class WorkClient {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

        work.setFinish(Boolean.TRUE);

        work.setHour(19);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();

    }

}
