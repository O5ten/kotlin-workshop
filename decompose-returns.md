Destructuring Objects
---------------------

Also popularly known as multiple return values. Manu functional programming languages has had something called Tuples for years. They are arbitrary return values that compose different objects with each other. Think about how Objects in JavaScript is sometimes used to manage multiple return values.

```JavaScript
return {
  someIdentifier: identifier,
  anotherObject: object
};
```

Now, it's okay to say there's a design problem with structuring your return values like this. But that's not this discussion.

Tuples in Erlang, then again, Erlangs entire type system revolves around tuples and lists.
```Erlang
fun secureUser() -> {Patrik, 24}.
```

Now imagine if this was a part of the language in all parts of its ecosystem which it is in kotlin, where you can destructure by fields.

```kotlin
val (name, age) = user
```

loops and lists
```kotlin
for ((name, age) in users) {
  //do something with the username and age
}
```

maps
```kotlin
for ((key, value) in map) {
   // do something with the key and the value
}
```

We can do this kind of destructuring on one of **two** things. Either *data classes* or the built in *Triple<A, B, C>* or *Pair<A, B>* classes.

This is really neat when coupled with lambdas. destructuring is what happens when you use lambdas that has more than one argument. Fold for example.

```kotlin
val mean = map.fold { (acc, v) ->
  ...
}
```
