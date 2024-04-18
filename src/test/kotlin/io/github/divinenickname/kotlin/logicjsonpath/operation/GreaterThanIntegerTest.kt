package io.github.divinenickname.kotlin.logicjsonpath.operation

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.IllegalArgumentException

internal class GreaterThanIntegerTest {

    @Test
    fun result_isTrue() {
        val obj = GreaterThanOrEq("2", "1")

        val actual = obj.result()

        Assertions.assertTrue(actual)
    }

    @Test
    fun result_equals_isTrue() {
        val obj = GreaterThanOrEq("2", "2")

        val actual = obj.result()

        Assertions.assertTrue(actual)
    }

    @Test
    fun result_isFalse() {
        val obj = GreaterThanOrEq("1", "2")

        val actual = obj.result()

        Assertions.assertFalse(actual)
    }

    @Test
    fun result_notIntegerArg1_throw() {
        val obj = GreaterThanOrEq("1a", "2")

        Assertions.assertThrows(IllegalArgumentException::class.java) { obj.result() }
    }

    @Test
    fun result_notIntegerArg2_throw() {
        val obj = GreaterThanOrEq("1", "a2")

        Assertions.assertThrows(IllegalArgumentException::class.java) { obj.result() }
    }
}
