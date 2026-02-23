package lesson4

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestCurrencyAmountCheck {
    private val unknownString = "Unknown"
    private val questionChar = '?'
    private val zero = 0

    private val rubles = CurrencyAmount("rubles", '₽', null)
    private val dollars = CurrencyAmount("dollars", '$', 10000000)
    private val nullValues = CurrencyAmount(null, null, null)

    @Test
    @DisplayName("Проверка кол-ва рублей на счете")
    fun checkTheAmountOfRubles() {
        isCurrencyAvailableToSpend(rubles)
    }

    @Test
    @DisplayName("Проверка кол-ва долларов на счете")
    fun checkTheAmountOfDollars() {
        isCurrencyAvailableToSpend(dollars)
    }

    @Test
    @DisplayName("Проверка замены null полей на пустые")
    fun checkTheNullAmountChange() {

        val result = replaceTheFieldIfNull(nullValues)

        result.name shouldBe unknownString
        result.symbol shouldBe questionChar
        result.availableToSpend shouldBe zero
    }
}