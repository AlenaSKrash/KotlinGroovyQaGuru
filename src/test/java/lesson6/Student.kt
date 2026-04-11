package lesson6

val defaultStudent = Student(firstName = null, lastName = null, year = 0, isFullyFunded = null)

data class Student(
    val firstName: String?,
    val lastName: String?,
    val year: Int?,
    val isFullyFunded: Boolean?
)