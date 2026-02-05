package lesson3

import io.kotest.matchers.nulls.shouldBeNull
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Some creative name for a feature")
@Story("Some creative name for a story")
@Tags(Tag("Smoke"), Tag("Do not smoke"))
class TestCheckTheFirstElementIsExpected {

    private val arrayForTest: Array<String>? = null

    @Test
    @DisplayName("Some creative displayName")
    fun test() {
        arrayForTest.shouldBeNull()
    }
}