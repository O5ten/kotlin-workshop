package edu.osten

fun Int.times ( predicate: (Int) -> Unit ) {
    val iterations =  this.toString().toInt()
    for(i in 1 until iterations+1) predicate(i)
}

fun main (args: Array<String>){
    1.times(::println)
}