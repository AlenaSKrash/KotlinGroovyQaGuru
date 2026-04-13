package firstLessons.lesson5

import io.kotest.matchers.shouldBe
import firstLessons.lesson5.AssertionsWithExtensions.Companion.containsDigitsWithOptionalPlus
import firstLessons.lesson5.AssertionsWithExtensions.Companion.hasLengthIn10To15
import firstLessons.lesson5.AssertionsWithExtensions.Companion.shouldBeValidPhoneNumber
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestAssertionsWithExtensions {

    private val phoneNumber = "+79618954971"
    private val invalidPhoneNumber = "+++2323232323"

    @Test
    @DisplayName("Валидация номера телефона")
    fun checkIfPhoneNumberIsValid() {
            phoneNumber.containsDigitsWithOptionalPlus() shouldBe true
            phoneNumber.hasLengthIn10To15() shouldBe true
    }

    @Test
    @DisplayName("Валидация  номера телефона infix")
    fun checkIfPhoneNumberIsValidInfix() {
        phoneNumber shouldBeValidPhoneNumber true
    }
}