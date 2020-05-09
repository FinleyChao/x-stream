package com.foolish.xstream.entity

import lombok.ToString

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/24 14:25
 */
class Person(var firstname: String, var lastname: String) {

    var phone: PhoneNumber? = null

    var fax: PhoneNumber? = null


}