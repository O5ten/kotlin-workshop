Default Arguments
---------------
Data classes and regular functions in Kotlin has the possibility to assign default values in order to avoid overloading and overshadowing methods.

The single function reformat below
```kotlin
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
...
}
```
Would be callable in __4!__ ways. But most importantly.

```kotlin
reformat("my FormatTable string") //My Formattable String
```

Named Arguments
---------------
In Java we would be stuck with a bunch of booleans in a series, it would be really easy to make a mistake. And mistakes are bound to happen when they can.

```reformat(str, true, true, false, '_')```

With named arguments we can make the code much more readable

```kotlin
reformat(str,
    normalizeCase = true,
    upperCaseFirstLetter = true,
    divideByCamelHumps = false,
    wordSeparator = '_'
)
```
and if we do not need all arguments we can mix naming and non-named parameters as long as the named parameters are the trailing arguments. Kotlin resolves it. 

```kotlin
reformat(str, wordSeparator = '_')
```
