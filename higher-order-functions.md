Higher order functions
----------------------
A higher order function is a function that takes a function a parameter, or returns a function.

Examples
------------------
__Lock__ - A function that protects the body function by acquiring the lock, performing the body, and releasing the lock.  
```kotlin
fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}
```

__Twice__
```kotlin
fun <T> twice(anyFunction: (T)->T): (T)->T = {
  anyFunction(anyFunction(it))
}
fun f(x:Int) = x + 3
println(twice(::f)(7)) // 13
```

Lambdas
---------------
In Twice we have both inline functions

```kotlin
  fun f(x: Int) = x + 3
```

and a lambda function

```kotlin
... {
  anyFunction(anyFunction(it))
}
```

inline functions are simple declarations on a single line. Think of them as line-comments ```// ``` anything to the end of the line is considered part of the function. Often useful for concise single statements.

Lambdas are anonymous functions that can be more complex than inline-functions. First of all they have an implicit argument that is named ```it``` unless you give it a name of deconstruct it. You can think of it more as ```/* inline comments */```.

```kotlin
... { v ->
  anyFunction(anyFunction(it))
}
```

Lambdas are great for small tasks such as predicates, criterias, and transforms and usually replace function references.

The following code is equivalent.     

Consider the follwing list of users with three fields, name, gender and age.
```kotlin
val users = listOf(User("Mikael", Gender.Male, 29),
                   User("Eric", Gender.Male, 24),
                   User("Rebecca", Gender.Female, 23))
```

Let's say we want to find all males below 25 as eligible candidates for a junior position in a recruitment site.

With inline function references.
```kotlin
  fun isMale(user: User): boolean = Gender.male == user.gender
  fun below25(user: User): boolean = user.age < 25

  users.filter(::isMale)
       .filter(::below25)
```

With lambdas
```kotlin
   users.filter { it.gender == Gender.Male }
        .filter { it.age < 25 }
```

With java 7
```java
 List<Users> filteredUsers = Lists.newArrayList();
 for(User user : users){
   if(user.gender == Gender.Male && it.age < 25){
     filteredUsers.add(user);
   }
 }
 return filteredUsers;
```

With java 8 streams and lambdas
```java
return users.stream()
       .filter( v -> v.gender == gender.Male )
       .filter( v -> v.age < 25 )
       collect(Collectors.asList());
```
Personally i think Java8 streams is a clunky implementation of monads, whereas both Kotlin, Groovy, Scala are more graceful.  

Closures
-----------
Closures are lambdas that reach outside of the function state to manipulate some local state to where the function is declared.
This is where Java lambdas and most other implementations of them differ. Java lambdas cannot reach outside of the declared scope and modify cariables.

```kotlin
var ints = -20..50
var sum = 0
ints.filter { it > 0 }.forEach {
    sum += it
}
```
I know, i know, List.fold would have been a much nicer implementation of the above. But still, it proves a point.


Concluding Haiku
>Lamdas divine in right palm

>Everywhere else it causes ridiculous cursing complexion

>Causing death by debugging complexion
