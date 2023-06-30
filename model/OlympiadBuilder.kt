class OlympiadBuilder {
  var name: String = ""
  var date: String = ""
  var institution: String = ""
  var participants: MutableList<Participant> = mutableListOf()

  fun withName(name: String): OlympiadBuilder {
    this.name = name
    return this
  }

  fun withDate(date: String): OlympiadBuilder {
    this.date = date
    return this
  }

  fun withInstitution(institution: String): OlympiadBuilder {
    this.institution = institution
    return this
  }

  fun withParticipants(participants: MutableList<Participant>): OlympiadBuilder {
    this.participants = participants
    return this
  }

  fun addParticipant(participant: Participant): OlympiadBuilder {
    this.participants.add(participant)
    return this
  }

  fun build(): Olympiad = Olympiad(name, date, institution, participants)
}

fun OlympiadRepositoryBuilder.olympiad(block: OlympiadBuilder.() -> Unit) = olympiads.add(OlympiadBuilder().apply(block).build())

