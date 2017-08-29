Data Classes
---------------
Let's face it, it's really boring writing data classes. That's something that Groovy adressed in the past through annotations, and Kotlin has taken to the next level through introducing Data Classes.   

In java you would typically create a class representing a User like this.

In java
-------------
```java
package edu.osten;

public class User {

    private String id;
    private String name;
    private int age;

    public User (String id, String name, String age){
      this.id = id;
      this.name = name;;
      this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "User(Id=" + id + ", Name=" + name + ", age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
```

**This. Is. Tedious.**

Not to mention most people simply generate this code from their editors and rarely modify it. Such a waste of creativity and lines of code.

In Kotlin
----------------
In kotlin, the same class would look like this.

```kotlin
data class User(val id: String, val name: String, val age: Int)
```

That's it. Same bytecode. Essentially.

But data classes has more features than That:

Default Values
--------------
It's as simple as it sounds, you can make arguments for the constructor optional by providing default values for them right in the data class definition.

```kotlin
data class User(val id: String = "-1", val name: String = "Unknown user", val age: Int = -1)
```

Named parameters
----------------
Never again would you need to remember the exact order of the constructor arguments. Meet named parameters.

```kotlin
val testUser = User(id = "BEEF1337",
                    name = "Eric Christenssen",
                    age = 37)
```

Copying
--------------
Another freebie of the data class, is an automatic copy method where you can name parameters to replace. Let's say i wanted to keep a copy of the username but with another id and age.

We could do something like this

```Kotlin
val fakeNewsUser = user.copy(id = createGuid(), age = 99)
```

Destructuring
--------------
Which we already went through, can desctructure named parameters easily.
```Kotlin
val (name, id) = user
println("User $name with id $id joined the channel")
```
