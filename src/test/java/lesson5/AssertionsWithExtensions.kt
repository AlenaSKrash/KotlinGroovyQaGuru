package lesson5

class AssertionsWithExtensions() {
    companion object {
        fun String.containsDigitsWithOptionalPlus(): Boolean {
            if (startsWith("+")) { return drop(1).all { it.isDigit() } }
            return all { it.isDigit() }
        }

        fun String.hasValidLength(): Boolean {
            val digits = filter { it.isDigit() }
            return digits.length in 10..15
        }

        fun String.isValidPhoneNumber(): Boolean {
            return containsDigitsWithOptionalPlus() &&
                    hasValidLength()
        }

        infix fun String.shouldBeValidPhoneNumber(expected: Boolean) {
            val actual = this.isValidPhoneNumber()
            if (actual != expected) {
                throw AssertionError("Phone '$this': expected $expected, got $actual")
            }
        }
    }
}