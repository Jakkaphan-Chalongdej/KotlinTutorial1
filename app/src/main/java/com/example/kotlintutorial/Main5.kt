fun main(ages:Array<String>){
    println("Hello World")
    println("My First Kotlin program")

    var jim = "James T Kirk"
    var tim = "Tim Buchalka"
    println(tim)
    var timWeeklySalary =32
    var timMonthlySalary = timWeeklySalary * 4
    println("Tim's weekly salary is$timWeeklySalary")
    println("Monthly, that comes to $timMonthlySalary")
    println()
    val apples = 6
    val oranges  = 5
    val fruit : Int = apples - oranges
    println("$apples apples - $oranges oranges leaves $fruit price(s) of fruit")
    println("A Quarter of the apple is ${apples/4}")
    println()
    val weeks = 234
    val years  = weeks / 52.0
    println("$weeks weeks is $years years")
    println("My name is $tim")
    println("Jim is $jim")
}
