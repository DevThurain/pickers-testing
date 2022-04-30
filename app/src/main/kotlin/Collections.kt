
val list = listOf<Int>(1,2,3)
val mutableList = mutableListOf<Int>(1,2,3)

val map = mapOf<Int,String>(1 to "one", 2 to "two", 3 to "three")
val mutableMap = mutableMapOf<Int,String>(1 to "one", 2 to "two", 3 to "three")

val set_ = setOf<Int>(1,1,2,3)
val mutableSet = mutableSetOf<Int>(1,1,2,3)
fun main() {
    mutableList.add(4)

    mutableMap.put(4,"four")

    mutableSet.add(4)

    print(mutableSet)

}