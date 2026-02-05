package lesson3

import io.kotest.matchers.nulls.shouldNotBeNull
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Some creative name for a feature")
@Story("Some creative name for a story")
@Tags(Tag("Smoke"), Tag("Do not smoke"))
class TestCheckMassiveIsNotEmpty {

    private val arrayForTest = arrayOf("Alena", "Angela")

    @Test
    @DisplayName("Some creative displayName")
    fun test() {
        arrayForTest.shouldNotBeNull()

        //Но как-то выглядит как ненужная проверка, можно через nullSafety задать условия, что массив по дефолту не null
    }
}