
fun String.isPalindrome():Boolean {
    val inputReversed = this.reversed()
    return this == inputReversed
}
//Palindrome
fun main(args: Array<String>) {
    println("Tapez votre mot à vérifier")
    println(if (readLine()?.isPalindrome() == true) "C'est un palindrome" else "Ce n'est pas un palindrome" )
}