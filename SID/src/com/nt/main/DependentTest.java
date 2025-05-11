// DependentTest.java
package com.nt.main;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishMessageGenerator;

public class DependentTest {
    public static void main(String[] args) {
    FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    Object obj=ctx.getBean("wmg");
    WishMessageGenerator generator =(WishMessageGenerator)obj;
    String msg=generator.showWishMessage("raja");
    System.out.println("result: "+msg);
    ctx.close();
    }
}
