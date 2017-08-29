Default Arguments
---------------


Named Arguments
---------------
```kotlin
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
...
}
```
we could call this using only default arguments

``` reformat(str) ```

reformat(str, true, true, false, '_')
With named arguments we can make the code much more readable

reformat(str,
    normalizeCase = true,
    upperCaseFirstLetter = true,
    divideByCamelHumps = false,
    wordSeparator = '_'
)
and if we do not need all arguments

reformat(str, wordSeparator = '_')
