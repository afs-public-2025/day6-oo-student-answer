# step1 
- To write a `Person` class, it must have `id`, `name` and `age` attributes, and an `introduce` method.
   The `introduce` method returns a string like:

   >My name is Tom. I am 18 years old.

- To distinguish people with the same name and age, `Person` class needs to add an `id` attribute.
   We judge whether it is the same person by `id` attribute.

# step2
- Write another `Student` class, it also has `id`, `name` and `age` attributes, and an `introduce` method.
   The `introduce` method returns a string like: 

   >My name is Tom. I am 18 years old. I am a student.

   We judge whether it is the same student by `id` attribute. 
   Please reuse existing code as much as possible.

- Write another `Teacher` class, it also has `id`, `name` and `age` attributes, and an `introduce` method.
   The `introduce` method returns a string like:

   >My name is Jerry. I am 21 years old. I am a teacher.

   We judge whether it is the same teacher by `id` attribute.
   Please reuse existing code as much as possible.

# step3
- A class has many students, and one student belongs to only one class. 
   Write another `Klass` class, it has a `number` attributes.
   We judge whether it is the same class by `number` attribute.
   
   `Student` class will add a `klass` attribute to indicate the class to which it belongs.
   `Student` class will provide a `join` method to change the class to which it belongs, 
   and a `isIn` method to judge whether it belongs to the class.

   When belonging to a class, a student will introduce him/herself with class number like:

   >My name is Tom. I am 18 years old. I am a student. I am in class 1.
