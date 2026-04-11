package lesson6

enum class StudentEnum(
    val studentName: String,
    val lastName : String,
    val year : Int,
    val isFullyFunded: Boolean) {
    FIRST_STUDENT("Alena", "Avila", 1, true),
    SECOND_STUDENT("Jack", "Potato", 2, false)
}