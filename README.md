Object-oriented programming is a core of Java Programming, which is used for designing a program using classes and objects. OOPs, can also be characterized as data controlling for accessing the code. In this approach, programmers define the data type of a data structure and the operations that are applied to the data structure.
Objects are always called instances of a class which are created from a class in java or any other language. They have states and behaviour.

These objects always correspond to things found in the real world, i.e., real entities. So, they are also called run-time entities of the world. These are self–contained 
which consists of methods and properties which make data useful. Objects can be both physical and logical data. 

List of OOPs Concepts in Java
1) Encapsulation
2) Polymorphim
3) Abstraction
4) Inheritance
5) Class/Object

1) Encapsulation:
Encapsulation is one of the fundamental concepts in object-oriented programming (OOP).By definition, encapsulation describes bundling data and methods that work on that data within one unit, like a class in Java. We often often use this concept to hide an object’s internal representation or state from the outside. 
This is called information hiding.The general idea of this mechanism is simple. For example, you have an attribute that is not visible from the outside of an object. You bundle it with methods that provide read or write access. Encapsulation allows you to hide specific information and control access to the object’s internal state.

Encapsulation is Defined by   Various Access Specifiers:
i) Public
ii) Private
ii) Protected

i) Public
This is the least restrictive access modifier. Methods and attributes that use the public modifier can be accessed within your current class and by all other classes.Public methods and attributes become part of the public API of your class and of any component in which you include them. That is almost never a good idea for any 
attribute, so you should think twice before using this modifier on a method.

ii) Private
The most restrictive and most commonly used access modifier, the private modifier makes an attribute or method only accessible within the same class. Subclasses or any other classes within the same or a different package can’t access this attribute or method.

iii) Protected
Attributes and methods with the access modifier protected can be accessed within your class, by all classes within the same package and by all subclasses within the same or other packages.

The protected modifier gets mostly used for internal methods that need to be called or overridden by subclasses. You can also use the protected modifier to allow subclasses to access internal attributes of a superclass directly.

2) Polymorphim:
'Poly' means Many and 'Morph' means forms. Polymorphism is one of the core concepts of object-oriented programming (OOP) and describes situations in which something occurs in several different forms. In computer science, it describes the concept that you can access objects of different types through the same interface. 
Each type can provide its own independent implementation of this interface.
Java supports 2 types of polymorphism:

i) Static or compile-time Polymorphism
ii) Dynamic Polymorphism

i) Static polymorphism
Java, like many other OOP languages, allows you to implement multiple methods within the same class that use the same name. But, Java uses a different set of parameters called method overloading and represents a static form of polymorphism.

ii) Dynamic polymorphism
This form of polymorphism doesn’t allow the compiler to determine the executed method. The JVM needs to do that at runtime.

Within an inheritance hierarchy, a subclass can override a method of its superclass, enabling the developer of the subclass to customize or completely replace the behavior of that method.

3) Inheritance:

Inheritance is a technique of modelling real-world relationships, and OOP is all about real-world objects. Here's an example: a car, a bus, and a bicycle all fall under the umbrella term "vehicle." 
That is, they have inherited the attributes of the vehicle class, implying that they are all utilised for transportation.

Advantages:
Class: A class is a collection of objects with similar attributes. It's a blueprint or template from which items are made.

Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.

Super Class/Parent Class: The features of a subclass are inherited from the superclass. It's also known as a parent class or a base class.

Reusability: Reusability, as the name implies, is a feature that allows you to reuse the fields and methods of an existing class while creating a new one. The fields and methods defined in the preceding class can be reused.

i) Single Inheritance
In Single Inheritance one class extends another class (one Base Class and one Derrieved Class only).

ii) Multilevel Inheritance
In Multilevel Inheritance, one class can inherit from a derived class. Hence, the derived class becomes the base class for the new class.

iii) Multiple Inheritance
Multiple Inheritance is one of the inheritance in Java types where one class extending more than one class. Java does not support multiple inheritance.

iv) Hierarchical Inheritance
In Hierarchical Inheritance, one class is inherited by many sub classes.

v) Hybrid or Virtual Inheritance
Hybrid inheritance is one of the inheritance types in Java which is a combination of Single and Multiple inheritance.


4) Class/Object

Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. 
For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

There are Two Types of Class
i) Base Class
ii) Derrieved Class


