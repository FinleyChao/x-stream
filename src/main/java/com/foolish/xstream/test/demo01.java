package com.foolish.xstream.test;
import com.foolish.xstream.model.Person2;
import com.thoughtworks.xstream.XStream;

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/24 14:56
 */
public class demo01 {

    public static void main(String[] args) {
        XStream xstream = new XStream();
        xstream.alias("person",Person2.class);
        //xml字符串
        String xmldemo = "<?xml version=\"1.0\" ?><person><firstname>Joe</firstname><lastname>milo</lastname><phone><code>123</code><number>1234-456</number></phone><fax><code>123</code><number>999-456</number></fax></person>";
        Person2 o = (Person2)xstream.fromXML(xmldemo);
        System.out.println(o.toString());
    }
}
