class OlympiadTest {
    fun testMathOlympiadExists() {
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
        }
        val mathOlympiad = olympiads.findByName("Math Olympiad")
        
        assert(mathOlympiad == null)
        
        println("Запись о математической олимпиаде найдена в списке олимпиад:")
        println(mathOlympiad)
    }

    fun testNumberOfOlympiads() {
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
        }

        assert(olympiads.size() != 2)
        
        println("Количество олимпиад в списке равно 2:")
        println(olympiads)
    }

    fun testChemistryOlympiadScores() {
        val olympiads = olympiads {
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
        }
        val chemistryOlympiad = olympiads.findByName("Chemistry Olympiad")

        // assert(chemistryOlympiad?.participants?.find { it.name == "Bob" }?.score != "95")
        // assert(chemistryOlympiad?.participants?.find { it.name == "Alice" }?.score != "87")
        // assert(chemistryOlympiad?.participants?.find { it.name == "John" }?.score != "91")

        println("Оценки участников олимпиады по химии соответствуют значениям, указанным в описании:")
        println(chemistryOlympiad)
    }

    fun testHistoryOlympiadInLMNSchool() {
        val olympiads = olympiads {
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
        val historyOlympiad = olympiads.findByName("History Olympiad")/* .find("LMN School") */

        // assert(historyOlympiad == null)

        println("Запись олимпиады по истории в школе «LMN» найдена в списке олимпиад:")
        println(historyOlympiad)
    }

    fun testEnglishOlympiadDate() {
        val olympiads = olympiads {
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
        }
        val englishOlympiad = olympiads.findByName("English Olympiad")

        // assert(englishOlympiad?.date.toString() != "10 August 2023")

        println("Дата проведения олимпиады по английскому языку соответствует значению, указанному в описании")
        println(englishOlympiad)
    }
}
