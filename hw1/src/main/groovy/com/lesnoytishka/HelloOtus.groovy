package com.lesnoytishka

import com.google.common.math.IntMath

class HelloOtus {

    static void printHello() {
        var sum = IntMath.checkedAdd(5, 7)
        assert sum == 12
        println('Hello Otus!')
    }
}
