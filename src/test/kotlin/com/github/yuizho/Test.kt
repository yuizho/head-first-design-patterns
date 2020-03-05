package com.github.yuizho

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class Test {
    @Test
    fun test() {
        assertThat("hello").isEqualTo("hello")
    }
}