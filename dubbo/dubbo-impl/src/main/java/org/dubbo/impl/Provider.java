package org.dubbo.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Provider 
{
    public static void main( String[] args ) throws IOException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"dubbo-demo-provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
