Extensions
-------------

Have you ever found that you are lacking a function on say the List, Int, String or any other built in  interface of a language, but think the decorator pattern brings too much overhead?

With Kotlin, you can statically declare interface extensions. The purpose is essentially to replace the need for XUtils classes.

```kotlin
fun Int.times ( predicate: (Int) -> Unit ) {
    val iterations =  this.toString().toInt()
    for(i in 1 until iterations+1) predicate(i)
}
```

would lead to being able to run the following glorified fixed-values for-loop.
```kotlin
3.times(::println)
```

yields
```
1
2
3
```
