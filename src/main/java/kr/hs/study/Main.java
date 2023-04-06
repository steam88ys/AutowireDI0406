package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestBean1 obj1 = ctx.getBean(TestBean1.class);

        int sum=0;
        int count =0;
        for(int i=obj1.getN(); i<= obj1.getM(); i++) {
            sum+=i;
            count++;
        }
        System.out.println("합: "+sum);
        System.out.println("평균: "+sum/count);

        ctx.close();
    }
}