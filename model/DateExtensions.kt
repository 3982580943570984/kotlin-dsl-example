import java.time.LocalDate
import java.time.Month

object DateContext

context(DateContext)
infix fun Int.January(n: Int): LocalDate = LocalDate.of(n, Month.JANUARY, this)

context(DateContext)
infix fun Int.February(n: Int): LocalDate = LocalDate.of(n, Month.FEBRUARY, this)

context(DateContext)
infix fun Int.March(n: Int): LocalDate = LocalDate.of(n, Month.MARCH, this)

context(DateContext)
infix fun Int.April(n: Int): LocalDate = LocalDate.of(n, Month.APRIL, this)

context(DateContext)
infix fun Int.May(n: Int): LocalDate = LocalDate.of(n, Month.MAY, this)

context(DateContext)
infix fun Int.June(n: Int): LocalDate = LocalDate.of(n, Month.JUNE, this)

context(DateContext)
infix fun Int.July(n: Int): LocalDate = LocalDate.of(n, Month.JULY, this)

context(DateContext)
infix fun Int.August(n: Int): LocalDate = LocalDate.of(n, Month.AUGUST, this)

context(DateContext)
infix fun Int.September(n: Int): LocalDate = LocalDate.of(n, Month.SEPTEMBER, this)

context(DateContext)
infix fun Int.October(n: Int): LocalDate = LocalDate.of(n, Month.OCTOBER, this)

context(DateContext)
infix fun Int.November(n: Int): LocalDate = LocalDate.of(n, Month.NOVEMBER, this)

context(DateContext)
infix fun Int.December(n: Int): LocalDate = LocalDate.of(n, Month.DECEMBER, this)

