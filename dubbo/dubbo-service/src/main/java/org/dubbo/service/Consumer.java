package org.dubbo.service;

import java.math.BigDecimal;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Consumer 
{
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        DemoService demoService = (DemoService) context.getBean("demoService");
        // execute remote invocation
        String result = demoService.testDubbo("xuebi");
        // show the result
        System.out.println(result);
    }
}
