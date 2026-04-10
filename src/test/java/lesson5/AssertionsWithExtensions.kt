package lesson5

import io.kotest.assertions.fail
import io.kotest.matchers.shouldBe

class AssertionsWithExtensions() {
    companion object {
        fun String.containsDigitsWithOptionalPlus(): Boolean =
            isNotEmpty() && removePrefix("+").all { it.isDigit() }

        fun String.hasLengthIn10To15(): Boolean {
            val digits = filter { it.isDigit() }
            return digits.length in 10..15
        }

        infix fun String.shouldBeValidPhoneNumber(expected: Boolean) {
            val actual = this.containsDigitsWithOptionalPlus() && this.hasLengthIn10To15()
            actual shouldBe expected
        }
    }
}