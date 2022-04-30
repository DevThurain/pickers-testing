
fun main(){
    val age = 16

    when(age){
        16 -> print("exactly 16")

        in 16..25 -> println("between 16 and 25")

        in 25..50 -> println("between 25 and 50")
    }
    println()

    val list = listOf<Int>(1,2,3,4,5)

    for(i in list){
        print(i.toString())
    }
    println()


    for(i in list.indices){
        print(i.toString())
    }
    println()


    for((index, value) in list.withIndex()){
        print("$index - $value")
    }
    println()


    for(i in 0..5){
        print(i.toString())
    }
    println()


    for(i in 0..5 step 2){
        print(i.toString())
    }
    println()


    for(i in 10 downTo 2){
        print(i.toString())
    }


}