package lesson6

import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestsCheckStudentData {
    private val newStudent = defaultStudent.copy(
        firstName = "Alena",
        lastName = "Avila",
        year = 1,
        isFullyFunded = false
    )

    @Test
    @DisplayName("Сравнение нового студента с дефолтным")
    fun checkStudentsDataDifference() {
        // Полное сравнение объектов
        newStudent shouldNotBe defaultStudent

        // Частичное сравнение по полям
        newStudent.firstName shouldNotBe defaultStudent.firstName
        newStudent.lastName shouldNotBe defaultStudent.lastName
        newStudent.year shouldNotBe defaultStudent.year
        newStudent.isFullyFunded shouldNotBe defaultStudent.isFullyFunded
    }

    @Test
    @DisplayName("Сравнение нового студента с дефолтным используя enum")
    fun checkStudentsDataDifferenceEnum() {
        // Полное сравнение объектов
        StudentEnum.FIRST_STUDENT shouldNotBe defaultStudent
        StudentEnum.SECOND_STUDENT shouldNotBe defaultStudent

        // Частичное сравнение по полям
        StudentEnum.FIRST_STUDENT.studentName shouldNotBe defaultStudent.firstName
        StudentEnum.FIRST_STUDENT.lastName shouldNotBe defaultStudent.lastName
        StudentEnum.SECOND_STUDENT.year shouldNotBe defaultStudent.year
        StudentEnum.SECOND_STUDENT.isFullyFunded shouldNotBe defaultStudent.isFullyFunded
    }
}