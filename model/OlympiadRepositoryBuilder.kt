class OlympiadRepositoryBuilder {
  var olympiads: MutableList<Olympiad> = mutableListOf<Olympiad>()

  fun withOlympiads(olympiads: MutableList<Olympiad>): OlympiadRepositoryBuilder {
    this.olympiads = olympiads
    return this
  }

  fun build(): OlympiadRepository = OlympiadRepository(olympiads)
}

fun olympiads(block: OlympiadRepositoryBuilder.() -> Unit): OlympiadRepository = OlympiadRepositoryBuilder().apply(block).build()

