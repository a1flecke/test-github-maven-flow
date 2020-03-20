package net.fleck

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.lang.RuntimeException

class HelloWorld2Test{
    @Test
    fun helloWorld() {
        assertThat(HelloWorld().hello("name")).isEqualTo("Hello name")
    }

    @Test
    fun endlessForLoop() {
        HelloWorld().endlessForLoop()
    }
}