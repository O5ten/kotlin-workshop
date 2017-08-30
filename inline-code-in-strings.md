Strings in Kotlin
----------------------
Has support for c-style inline variables directly in the String, and also multiline Strings that makes it easy to work with larger text-templates.

Inline Code in Strings
----------------------
```kotlin
val user = User("Mikael", Gender.Male, 29)
println("${user.name} is ${user.age} years old")
```

Multiline Strings
----------------------
```kotlin
val (name) = user
val myMultiLineString = """

This
Is
A
String
That
Belongs
To
$name

"""
```
