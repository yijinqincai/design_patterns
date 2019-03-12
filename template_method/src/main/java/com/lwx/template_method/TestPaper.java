package com.lwx.template_method;

/**
 * Created with IntelliJ IDEA.
 * Description: 考题试卷
 * User: lwx
 * Date: 2019-03-11
 * Time: 22:39
 */
public abstract class TestPaper {

    private void testQuestion1(){
        System.out.println("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是：A.球磨铸铁 B.马口铁 C.高速合金钢 D。碳素纤维");
        System.out.println("学生答案：" + answer1());
    }

    private void testQuestion2(){
        System.out.println("杨过、程英、陆无双铲除了情花造成：A.使这种植物不再害人 B.使一种珍稀物种灭绝 C.破坏了那个生物圈的生态平衡 D.造成该地区沙漠化");
        System.out.println("学生答案：" + answer2());
    }

    private void testQuestion3(){
        System.out.println("蓝凤凰致使华山师徒、核谷六仙呕吐不止，如果你是大夫，会给他们开什么药：A.阿匹斯林 B.牛黄解毒片 " +
                "C.氟哌酸 D.让他们喝大量的生牛奶 E.以上全不对");
        System.out.println("学生答案：" + answer3());
    }

    public void answerQuestion() {
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }

    abstract String answer1();

    abstract String answer2();

    abstract String answer3();
}
