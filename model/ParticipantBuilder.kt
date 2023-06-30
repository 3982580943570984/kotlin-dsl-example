class ParticipantBuilder {
  var name: String = ""
  var group: String = ""
  var score: String = ""

  fun withName(name: String): ParticipantBuilder {
    this.name = name
    return this
  }

  fun withGroup(group: String): ParticipantBuilder {
    this.group = group
    return this
  }

  fun withScore(score: String): ParticipantBuilder {
    this.score = score
    return this
  }

  fun build(): Participant = Participant(name, group, score)
}

fun OlympiadBuilder.participant(block: ParticipantBuilder.() -> Unit) = participants.add(ParticipantBuilder().apply(block).build())
