package lesson2

import io.kotest.matchers.string.shouldNotContain
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Feature("Some creative name for a feature")
@Story("Some creative name for a story")
@Tag("Smoke")
class SecondTestForQaGuru {

    private val whatDoIWant = "Million dollars"
    private val whatDoIHave = "Million rubles"

    @Test
    @DisplayName("The second creative displayName")
    fun test() {
        whatDoIHave shouldNotContain whatDoIWant
    }
}