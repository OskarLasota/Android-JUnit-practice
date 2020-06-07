package com.frezzcoding.practice

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    var e = EmailValidator()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun emailValidator_ContainsGmail_ReturnsTrue(){
        assert(e.isEmailValid("football@gmail.com"))
    }
    @Test
    fun emailValidator_DoesNotContainGmail_ReturnsFalse(){
        assertFalse(e.isEmailValid("football@yahoo.com"))
    }
}
