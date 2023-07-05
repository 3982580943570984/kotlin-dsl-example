class OlympiadRepository(private val olympiads: MutableList<Olympiad>) {
  fun size(): Int = olympiads.size

  fun findByName(name: String): MutableList<Olympiad> = olympiads.filter{ it.name == name }.toMutableList()

  fun findByInstitution(institution: String): MutableList<Olympiad> = olympiads.filter{ it.institution == institution }.toMutableList()

  fun findParticipantWithMaxScore(): Participant? = olympiads.flatMap{ it.participants }.maxByOrNull{ it.score }
}
