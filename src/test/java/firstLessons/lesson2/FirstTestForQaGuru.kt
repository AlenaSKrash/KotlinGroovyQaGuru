package firstLessons.lesson2

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Some creative name for a feature")
@Story("Some creative name for a story")
@Tags(Tag("Smoke"), Tag("Do not smoke"))
class FirstTestForQaGuru {

    private val firstPartOfTheName = "Alena"
    private val secondPartOfTheName = "Avila"
    private val expectedFullName = "AlenaAvila"

    @Test
    @DisplayName("Some creative displayName")
    fun test() {
        firstPartOfTheName + secondPartOfTheName shouldBe expectedFullName
    }
}