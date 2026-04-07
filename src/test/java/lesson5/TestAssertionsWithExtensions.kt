package lesson5

import io.kotest.matchers.shouldBe
import lesson5.AssertionsWithExtensions.Companion.containsDigitsWithOptionalPlus
import lesson5.AssertionsWithExtensions.Companion.hasValidLength
import lesson5.AssertionsWithExtensions.Companion.shouldBeValidPhoneNumber
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestAssertionsWithExtensions {

    private val phoneNumber = "+79618954971"

    @Test
    @DisplayName("Валидация номера телефона")
    fun checkIfPhoneNumberIsValid() {
            phoneNumber.containsDigitsWithOptionalPlus() shouldBe true
            phoneNumber.hasValidLength() shouldBe true
    }

    @Test
    @DisplayName("Валидация номера телефона infix")
    fun checkIfPhoneNumberIsValidInfix() {
        phoneNumber shouldBeValidPhoneNumber true
    }
}