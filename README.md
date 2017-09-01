Kotlin Workshop
---------------------

TL; DR, just let me get started

1. [Let's get coding](practice-makes-perfect.md)
2. [Higher Order Functions](higher-order-functions.md)
3. [Extensions](extensions.md)
4. [Decomposing Objects](decompose-returns.md)
5. [Inline Strings](inline-code-in-strings.md)  
6. [Data Classes](data-classes.md)
7. [Default Named Arguments](default-named-arguments.md)
8. [Interoperability with JVM Languages](interoperability.md)
9. [Smart Casting](smart-casting.md)
10. [The Billion Dollar Mistake](billion-dollar-mistake.md)

Introduction
---------------------
>Why should i learn yet another JVM-language, i already know Java

Is likely the thought that is going straight through your brain at this moment.

>I Just signed up for the food

Well, being a developer is about creating a toolbox, writing gorgeous(human readable) code is  about craftsmanship. The tools will not craft a scalable service that outperforms everything on the market with 99% unit test coverage, the craftsman will do that. Using better tools will simply shorten the time go get to market and possibly the quality of your craftsmanship.

Toolboxes
-----------------
Your toolbox could be:
- Java
- TDD
- Bash scripting
- Git
- Maven
- Debugging

And that would qualify you for a great many Java Developer jobs, but it would limit you for some. Technology shifts quickly, quicker than any of us can keep up actually. That is why we must be on the top of the industry at all times and try to parse out what will be the next big thing.

__I believe we, as software craftsmen, must spend time and effort to sharpen our tools if we are to constantly build better things.__

Kotlin
-----------------
I believe that Java was not the best language to hit the market during the late 90s and 00s.
The real invention is the virtual machine that can run bytecode, which Java compiles to.
Java was a language that demonstrated the power of the JVM, with a clunky, yet strongly typed and wordy syntax.

I believe Kotlin is the next best thing to learn for the Java Virtual Machine, for a good reason. I first heard of Kotlin at QCon London in March 2015 from Hadi Hariri, the talk was about _"Refactoring to Functional"_ but could just as weel have been a marketing campaign about Kotlin. I had just become versed in Groovy thanks to a well-meaning colleague who suggested we should rewrite our Swing code to use Groovy instead. But i just couldn't get over how loosely typed and runtime volatile Groovy was. For all its faults Groovy was a great load of fun developing, but mostly due to its functional nature. Lambdas, Closures, The extended List and GString interfaces, currying functions, ranges, elvis operator, dynamic programming, def, and so on. Groovy felt modern and incorporated elements from functional programming which i really liked, having touched ```Erlang``` back in school.

As a scripting language, Groovy was great, thanks to its runtime-nature.
But the Runtime explosions caused worry, had i really checked each path through the code so it couldn't explode? Testing became increasingly tough. Misuse of the safe navigation feature increased. elvis operator to resolve null.

At Hadi's talk, i realized, this was what i had been waiting for. He spoke about Lambdas,

Android
-------------
Since then i never really took the time to learn it, life got in the way. Then as things progressed, two years later, i heard at work that Google has added full support for the language in Android. Appearantly something the community has driven for some time. The spike in Google trends for the language during the announcement was huge. So i decided to sit down with the language and look further into the features of it. I ended up writing a small program using Sparkjava to try out the language. I prefer hands-on learning and this workshop is for me to spread that knowledge. 
