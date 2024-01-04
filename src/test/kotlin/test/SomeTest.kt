package test

import foo.bar
import foo.main
import org.junit.jupiter.api.Test

class SomeTest {
    @Test
    fun someTest() {
        println(bar())
        main() // throws java.lang.NoSuchMethodError: 'java.lang.String foo.UtilKt.foo()'
    }
}