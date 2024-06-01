object Exp6_3 {
    def countVowels(words: List[String]): Int = {
        var totalVowels = 0
        for (word <- words) {
            val letters = word.split("")
            for (letter <- letters) {
                if ("aeiou".contains(letter.toLowerCase)) {
                    totalVowels += 1
                }
            }
        }
        return totalVowels
    }
    def main(args: Array[String]): Unit = {
        var words: List[String] = List("this", "is", "a", "String")
        var x = countVowels(words)
        println(x)
    }
}