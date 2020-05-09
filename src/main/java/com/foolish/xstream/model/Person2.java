package com.foolish.xstream.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/24 14:56
 */
@Getter
@Setter
@ToString
public class Person2 {

    private String firstname;
    private String lastname;
    private PhoneNumber2 phone;
    private PhoneNumber2 fax;
}
