package com.foolish.xstream.test

import com.foolish.xstream.entity.Person
import com.foolish.xstream.entity.PhoneNumber
import com.thoughtworks.xstream.XStream
import org.springframework.web.servlet.view.xslt.XsltView


/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/24 14:30
 */
class XStreamTest {




}

fun main1(args: Array<String>) {

    val phoneNumber = PhoneNumber(123, "1234-456")
    val fax = PhoneNumber(123, "999-456")
    val person = Person("Joe", "milo")
    person.phone = phoneNumber
    person.fax = fax
    var xStream = XStream()
    xStream.alias("person", Person::class.java)
    val xml = xStream.toXML(person)
    println(xml)
}

fun main(args: Array<String>) {
    var xStream = XStream()
    xStream.alias("person", Person::class.java)
    var xmldemo = "<person><firstname>Joe</firstname><lastname>milo</lastname><phone><code>123</code><number>1234-456</number></phone><fax><code>123</code><number>999-456</number></fax></person>";
    val fromXML = xStream.fromXML(xmldemo)
    var person = fromXML as Person
    println(person)
}