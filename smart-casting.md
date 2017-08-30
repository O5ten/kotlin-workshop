Smart Casting
--------------

Kotlin is smart. Smart enough to figure out control flow where you have checked an object is a certain type and not null then Kotlin will treat the object as that particular object and treat it as not-null in the languages semantic analysis.

```kotlin
fun someMethod(obj: Any?) {
  if (obj == null || obj !is String) {
    return
  }
  val stringLength = obj.length
}
```
