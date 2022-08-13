## Error
### * compile-time error
  * syntax error 
  * use of incompatible types of data
  * attempts the language doesn't semantically allow => the semantics of programming lang are well defined. only one interpretation for each statement.   
  * any error identified by the compiler
  * program is not executable      
  
### * runtime error    
  * occurs during program execution
  * divide by zero
  * In Java, many run-time errors are called exceptions

### * logical error
  * produces incorrect results
  * debugging  

## Crucial Object-Oriented Concepts
what we will store in stack?  
f.e) stack of strings?

### Reuse  
We create a collection that is written once, complied into byte code once, 
and will handle any objects efficiently.  
=> type checking & type compatibility is key

### type checking
Java provides compile-time type checking.  
checks if assignment of an object to a reference legal.
````
String x = new Integer(10); 
//not legal
//cannot assign a reference of type String to an object of type Integer
````    


### 1. Inheritance and Polymorphism  
- An `Object` reference can be used to refer to any object, all classes are descendants of the Object class
```
Animal[] creatures = new Mammal[];
creatures[1] = new Reptile();
```
- creature[1] should be both a Mammal & an Animal, but not a Reptile.  
- will compile, but generate a java.lang.ArrayStoreException at run-time.
- `Object` class will not provide compile-time type checking
- look for better solution  

### 2. Generics
- integral part of collections!
- Java can define a class based on a generic type.
- can define a class whose type is not specified until the class is instantiated
- A generic type such as `<T>` cannot be instantiated.
- => merely a placeholder to allow us to define the class of specific type of object when is instantiated.
- possible cause Java allows late/dynamic binding
- the type of the object (the type of the element in the collection) is determined at "run-time" and not at compile-time
- using generic types for creating a collection to store any type of object safely and effectively
- 
