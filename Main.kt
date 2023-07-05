fun main() {
  val olympiads = olympiads {
    olympiad {
      name = "Math Olympiad"
      date = 3 July 2012
      institution = "ABC School"
      participant {
        name = "John"
        group = "10A"
        score = "90"
      }
      participant {
        name = "Jane"
        group = "10B"
        score = "99"
      }
    }

    olympiad {
      name = "English Olympiad"
      date = 10 August 2023
      institution = "ABC School"
      participant {
        name = "Peter"
        group = "12A"
        score = "85"
      }
      participant {
        name = "Mary"
        group = "12B"
        score = "92"
      }
    }

    olympiad {
      name = "Physics Olympiad"
      date = 15 October 2023
      institution = "XYZ School"
      participant {
        name = "Tom"
        group = "11A"
        score = "78"
      }
      participant {
        name = "Jerry"
        group = "11B"
        score = "82"
      }
      participant {
        name = "Alice"
        group = "11C"
        score = "90"
      }
    }

    olympiad {
      name = "Chemistry Olympiad"
      date = 20 November 2023
      institution = "PQR School"
      participant {
        name = "Bob"
        group = "12A"
        score = "95"
      }
      participant {
        name = "Alice"
        group = "12B"
        score = "87"
      }
      participant {
        name = "John"
        group = "12C"
        score = "91"
      }
    }

    olympiad {
      name = "History Olympiad"
      date = 5 December 2023
      institution = "LMN School"
      participant {
        name = "Mary"
        group = "10A"
        score = "80"
      }
      participant {
        name = "Peter"
        group = "10B"
        score = "88"
      }
      participant {
        name = "Jane"
        group = "10C"
        score = "93"
      }
    }
  }

  println(olympiads.findByName("Math Olympiad"))
  println(olympiads.findByInstitution("XYZ School"))
  println(olympiads.findParticipantWithMaxScore())

  println(OlympiadTest().testMathOlympiadExists())
  println(OlympiadTest().testNumberOfOlympiads())
  println(OlympiadTest().testChemistryOlympiadScores())
  println(OlympiadTest().testHistoryOlympiadInLMNSchool())
  println(OlympiadTest().testEnglishOlympiadDate())
}
