fun main(ages:Array<String>){
   println("How old are you: ")
    val age = readLine()!!.toInt()
    println("age is $age")

    val message : String
    if(age < 18){
        message = "You're too young to vote"
    }else if (age == 100){
        message= "Congratulations"
    }else{
        message = "You can vote"
    }
    println(message)

}