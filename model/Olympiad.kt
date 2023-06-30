import java.time.LocalDate

data class Olympiad(
  val name: String,
  val date: LocalDate,
  val institution: String,
  val participants: MutableList<Participant>
)
