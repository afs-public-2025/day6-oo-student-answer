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

# step4
- There will be teachers in the class, and a teacher can teach multiple classes.
   `Teacher` class will provide an `assignTo` method to assign to a class.
   `Teacher` class will provide an `belongsTo` method to judge whether he/she is teaching the class.
   
   When assigned to one class, a teacher will introduce him/herself with class taught like:

   >My name is Jerry. I am 21 years old. I am a teacher. I teach Class 1.

   When assigned to some classes, a teacher will introduce him/herself with classes taught like:

   >My name is Jerry. I am 21 years old. I am a teacher. I teach Class 2, 3.

- The teacher knows the students he/she teaches.
   `Teacher` class will provide an `isTeaching` method to judge whether he/she is teaching the student.

   As long as the student is in any class taught by the teacher, the teacher is teaching him/her.

# step5
- A class can assign a student to be the class leader. 
   `Klass` class will provide an `assignLeader` method to assign a student as leader.
   `Klass` class also provide an `isLeader` method to judge whether a student is the leader.

   When serving as leader, a student will introduce him/herself as class leader like:

    >My name is Tom. I am 18 years old. I am a student. I am the leader of class 1.

   The student who serves as the leader must be in the class.
   If assign a student not in the class as leader, the `assignLeader` method will to print the following message:

    >It is not one of us.
 