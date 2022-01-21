* Scala deconstruction is different, more involved than Kotlin's
* Case class is less intuitive: extra apply method needed for secondary constructors
* Immutability makes this assignment waaaay harder than the mutable option
* Functional error handling also makes code a bit unwieldy because of all the `Option`s
* Standard library offers great flexibility (used `Set`, `Option` extensively)
* Higher up in the object tree testing became more painful and mocking became more necessary. Reminded me of lessons
  learned in Growing Object Oriented Software
