fun main() {
  val olympiads = olympiads {
    olympiad {
      name = "Math Olympiad"
      date = "2022-03-15"
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
      name = "Science Olympiad"
      date = "2022-05-20"
      institution = "XYZ School"
      participant {
        name = "Tom"
        group = "11A"
        score = "87"
      }
      participant {
        name = "Jerry"
        group = "11B"
        score = "92"
      }
    }
  }

  println(olympiads.findByName("Math Olympiad"))
  println(olympiads.findByInstitution("XYZ School"))
  println(olympiads.findParticipantWithMaxScore())
}
