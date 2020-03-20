package net.fleck

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloWorldTest{
    @Test
    fun helloWorld() {
        assertThat(HelloWorld().hello("name")).isEqualTo("")
    }
}