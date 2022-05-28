# **JAVANOTES**

### Extra:

|                     |     |         |
| ------------------- | --- | ------- |
| Comments            |     | `//`    |
| Multi-Line Comment: |     | `/* */` |

- References Types:
  - Represents an address in memory no actual memory .When assign to another ref to it is just a reference not new(Array/Objext/ any with new) |
- Value Types:
  - Makes a new space in memory when assigned to each other, so addressed to actual memory
- JVM:
  - This lets Java run on any system in the JVM is installed

---

<br>

## **Datatypes:**

Primitive Types:

|           |     |     |     |     |     |     |                                                           |
| --------- | --- | --- | --- | --- | --- | --- | --------------------------------------------------------- |
| Char:     |     |     |     |     |     |     | `char var = 'L';` (L = Letter)                            |
|           |     |     |     |     |     |     | `char var = '\u####'` (\u is unicode, search for unicode) |
| Byte:     |     |     |     |     |     |     | `byte var = #;` (Between -128 and 127)                    |
| Short     |     |     |     |     |     |     | `short var = # `                                          |
| Integer:: |     |     |     |     |     |     | `int var = #;`                                            |
| Float:    |     |     |     |     |     |     | `float var = decimal.7;`                                  |
| Double:   |     |     |     |     |     |     | `double var = decimal.15`                                 |
| Boolean:  |     |     |     |     |     |     | `boolean var = true/false;`                               |
| String:   |     |     |     |     |     |     | `String var = "Text"; `                                   |
| Long:     |     |     |     |     |     |     | `long var =#;`                                            |

</br>

Class Type:

|          |     |     |     |     |     |     |                                        |
| -------- | --- | --- | --- | --- | --- | --- | -------------------------------------- |
| Integer: |     |     |     |     |     |     | `Integer var = new Integer(#);`        |
| Double:  |     |     |     |     |     |     | `Double var = new Double(decimal.15);` |
| String:  |     |     |     |     |     |     | `String var = "Text";`                 |

<br/>

Extra:

|                      |          |     |     |     |     |     |                                                |
| -------------------- | -------- | --- | --- | --- | --- | --- | ---------------------------------------------- |
| Final                |          |     |     |     |     |     | `final dataType VAR = X;`                      |
|                      |          |     |     |     |     |     | (Sets the output as constant, Spell with CAPS) |
| Converting/Parsing:: |          |     |     |     |     |     | `dataType var = dataType.parseType(text)`      |
|                      |          |     |     |     |     |     |                                                |
|                      |          |     |     |     |     |     |                                                |
| Type Casting:        |          |     |     |     |     |     |                                                |
|                      | Widening |     |     |     |     |     | `double var = varByte;`                        |
|                      | Narrow   |     |     |     |     |     | `byte var = (byte) varDouble;`                 |

---

<br/>

## DataStructure

<br/>

### Arrays:

- Single Array:
  - `dataType[ ] varArray;` (No assigned)
  - `dataType[ ] varArray = new dataType[#]` (Sets default: 0,false,null)
  - `dataType[ ] varArray = {element,element,..};`
- TwoD Array
  - `dataType[ ] [ ] varArray = { {} , {} };`
- Assign Array: -
  `varArray = new dataType[ ] {element,..,}`

  - Methods:
    - Length:
      - `varArray.length` (single Array)
      - `varArray[i].length` (2d Array)
    - Sort:
      - `Arrays.sort(varArray)`(Import util.Arrays)
    - Copy array:
      - `Arrays.copyOf(..,..)`
    - Print:
      - `Arrays.toString(varArray)`

  <br/>
  <br/>
  <br/>

### ARRAYLIST:

- ### Single Array:

  ```java
  ArrayList<dataTypeClass> varList = new ArrayList`<dataTypeClass>`()
  ```

  (No Primitive)

  - ### METHODS:
    - Add:
      - `varList.add(item)` (Kinda append)
      - Autoboxing: `varList.add( typeClass.valueOf (item) );` (Note: Java can do this auto)
    - Change item:
      - `varList.set(posInt,newItem)` (Replace item with new Item at posInt)
    - Call item:
      - `varList.get(posInt)`
      - Unboxing: `varList.get( posInt ).typeClassValue( );` (Note: Java can do this auto)
    - Delete:
      - `varList.remove(posInt)`
    - Length:
      - `varList.size()`
    - Contains:
      - `varList.contains(searchItem)`
    - Copy Over:
      - `newList.addAll(varList)` (make a getter method for quick access)
      - `new ArrayList<typeClass>(varList)`
    - To Array:
      - `varList.toArray()`
    - ### Boxing
      - (Note: Java can do this auto)
      - Autoboxing:
        - Converting primitive to dataTypeClass to store in List
          - EG: `datatypeClass.valueOf(#);`
      - Unboxing
        - Converting dataTypeClass back to primitive
          - Eg: `datatypeClassVar.datatypeClassValue(); `

</br>
</br>
</br>

### LINKEDLIST

- Single Array:

  - `LinkedList<typeClass> varList = new LinkedList<typeClass>();`

  - METHOD:
    - Add:
      - `varList.add(item)`
    - Add:
      - `varList.remove(#)` - Make a method for finding int indexOf()
    - Delete all:
      - `varList.clear()`
    - Contains:
      - `varList.contains("item")` - Boolean
    - Search Position:
      - `varList.indexOf("item")` - of position
    - Print Out:
      - `varList.toString()`
    - Clone:
      - `varList.clone()` - Object
    - Iterator:
      - `varList.iteraror` - Iterator Class of items
    - Iterator Desc:
      - `varList.descendingiteraror` - Iterator Class of items backwards
    - To Array:
      - `varList.toString(new String[0]);`

#### INTERATORS:

- Used to loop through collections and store path (ArrayList, HashSet)
- Upgrade from Enumeration
- Assign:
  - `Iterator<typeClass> varInter = list.iterator();`
- METHODS
  - Has Next
    - `varInter.hasNext()` - boolean
  - Next
    - `varInter.next()` - Goes to next
  - Remove
    - `varInter.remove()` - Removes current item

</br>
</br>
</br>
----

## OPERATORS:

### Operators:

<div>

| Arithmetic    |     |         |     | Comparison |     |                    |     | Logical |     |      |
| ------------- | --- | ------- | --- | ---------- | --- | ------------------ | --- | ------- | --- | ---- |
| Addition      |     | `+`     |     | Equal      |     | `=`                |     | AND     |     | `&&` |
| Sub           |     | `-`     |     |            |     | `==` (boolean/int) |     | OR      |     |      |
| Multi         |     | `*`     |     | Not Equal  |     | `!=`               |     | Not     |     | `!`  |
| Division      |     | `/`     |     | Greater    |     | `>`                |     |         |     |      |
| Mod/Remainder |     | `%`     |     |            |     | `>=`               |     |         |     |      |
| Power         |     | `^`     |     | Less Than  |     | `<`                |     |         |     |      |
| Increment     |     | `++`    |     |            |     | `<= `              |     |         |     |      |
| Decrement     |     | `--`    |     |            |     |                    |     |         |     |      |
| Abbreviated   |     | `op= #` |     |            |     |                    |     |         |     |      |

<br/>

### [String Operators:](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

| String |     |                                             |
| ------ | --- | ------------------------------------------- |
| Equals |     | `=`                                         |
|        |     | `text.equals(text)` (useful if toLowerCase) |

</br>
</br>

### Conditions:

```java
If:                         if(condition){..}
If_Else:                    if(condition){..}else{..}
Ternary Operator:           dataType var = (condition) ? conditionMet : .._else_...
Else_if:                    if(condition){..}else if(condition){..}else{..}
```

```java
Switch Case:                switch (expression){
                              case checkValue1:
                                executeBox....
                                break;
                              case checkValue2: case checkValue3:
                                ....
                                break;
                              default:
                                executeBox....
                                break;
                            }
```

```java
For Loop:                   for(init;termination;increment)
For:Each                    for(init :array){...}

While:                      while(condition){...}
Do While:                   do{..}while(condition)

Break:                      break;                    (stops)
Continue:                   continue;                 (Next)
```

<br/>

---

<br/>

## JAVA KEYWORDS:

### MODIFIERS:

- Access Modifers:
  - `public` (accessible by other classes)
  - `private` (accessible only in declared class,subclasses can access)
  - `protected` (only same packahe and subclasses)
  - `default` (accessed by classes in same package, when no modifiers set)
- Non-Access Modifers:
  - `final` (cant be inherited by other classes and attri cant be moded spell in caps)
  - `static` (attr/methods belong to class can be used but static variables are shared across Instances)
    - (eg change one all changes)
    - (classes methods cant use instance variable\this.)
  - `abstract` (the class cant make objects)
  - `abstract` (methods can only be used in abstract class)
  - `transient` (attri and methods are skipped when serializing)
  - `synchronized` (methods can only be access one thread @ time)
  - `volatile` (attri is not cached)

---

<br/>

## FUNCTIONS:

### [String Functions:](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

- Concatenation:
  - `Text+""+Text`
- Cancate:
  - `text1.concat("text2")`
- Length:
  - `text.length()`
- Upper Case:
  - `text.toUpperCase()`
- Lower Case:
  - `text.toLowerCase()`
- IndexOf:
  - `text.indexOf("searchText")`
- Check if Digit:
  - `text.matchs("[0-9]+.")` (+ means one or more times)
- [Format:](https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax)
  - `String.format("format",text)` (eg: "%.2f" - 2 decimal places)
- Equal:
  - `text.Equal(text)` (boolean output)

<br>

- Special Charaters:

  |                  |     |            |
  | ---------------- | --- | ---------- |
  | Single Quote:    |     | `\'text\'` |
  | Double Quote     |     | `\"text\"` |
  | Backslash:       |     | `\\`       |
  | New Line:        |     | `\n`       |
  | Carriage Return: |     | `\r`       |
  | Tab:             |     | `\t`       |
  | Backspace:       |     | `\b` (Del) |
  | Form Feed:       |     | `\f`       |

<br/>

### [Math Functions:](https://www.w3schools.com/java/java_ref_math.asp)

- Max:
  - `Math.max(x,y)`
- Min:
  - `Math.min(x,y)`
- Square Root:
  - `Math.sqrt(x)`
- Absolute(Positive):
  - `Math.abs(x)`
- Random:
  - `Math.random()`
- Round:
  - `Math.round(x)`
- Pi:
  - `Math.Pi()`

---

<br/>

## METHODS:

Void Method: void myMethod(?dataType? ?var?,...){}
Not Void Method: dataType myMethod(?dataType? ?var?,...){return dataTypeVar;}
Method Overloading: dataType1 myMethod(dataType1 var){return;} dataType2 myMethod(dataType2 var){return;} (use the same name)
Recursion Method: dataType myMethod(?dataType? ?var?,...){return myMethod(?var?);}
abstract Method: abstract void myMethod();
Call Method: myMethod(?var?,...);

---

<br/>

## OOP:

### Object Oriented Programming:

Definition: OOP is about creating objects that contain both data and methods. It is reuseable and less code and shorted dev time

Classes: Is a blueprint. Is the template for objects

Objects: Is an instance/refence of classes, they inherit all public variables and methods of class
When assigning Instances to Instances you assign it to the object in memory and can modify both at once
No static mean instance has its own variables, with static mean variables of different instances are same

Getters/setters: Used for validation and tests

Class: public class myClass{dataType arriType = data;....}
Class Constructor: public myClass(?dataType? ?var?,...){set stuff}
(must be public, no void, dont use getters and setters)
public myClass(){?set default?}
this(?var?,...);
(Calling constructer in object)(Make consturc chains for no dups)
Object: myClass myObj = new myClass();
(Can be in different java files but same dir)
Object variable: myObj.x
Modi Variable: myObj.x = stuff
Current object: this.x
(If parameter has same name as instance/object variable)
Static and Public: static access without object, public need object to be accessed

Inheritance:
Def: A Superclass-name you know another Subclass-name will need. (Eg PetCode needs Class:dog needs Class: Characteristics)
To inherit: class subclass-Name extends superclass-Name (if it has constructer subclass must have constructer)
Call SupConstruc: super(?var?,...); (Access Parent Class Construcs)
Call Sup Method: super.methodName(...); (Access Parent Class methods)
Call Sup var: super.var; (Access Parent Class vars)
Override: @Override methodStuff (Call child method thats in Superclass needs same methodName and paras)
(Runtime Polymorphism)(Cant override final&private or static only instance/this)

Polymorphism:
Def: Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
Polymorphism usesthose methods to perform different tasks. This allows us to perform a single action in different ways.
(Eg Superclass Animal has method Methodx(). Subclasses of Animals also have their own implementation of an methodX())

Encapsulation:
Definition: Is used to make sure sensitive data is hidden from user with private variables and public get and set
Hide things from other classes

Composition:
`Note:` `Use before Inheritance`
Definition: Describes a class that references one or more objects of other classes. Allows you to model a has-a association between objects.
Inheritance has limits but use that here give access to all. (Pc has case, monitor, motherboard)
Object that has other Objects (Pc has case, monitor, motherboard)(Dog is animal)

<br>

Abstract:

- Def

  > process of hiding certain details and showing only essential information to the user.

  > Abstraction can be achieved with either abstract classes or interfaces

  - The abstract keyword is a non-access modifier, used for classes and methods:

    > **Abstract class:** is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

    > **Abstract method:** can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

  > An abstract class can have both abstract and regular methods

- Abstract Method:
  - public void method();
- Abstract Class:
  - public abstract class Class{... }

<br/>

Interfaces:

- Def:

  > Another way to `achieve abstraction` in Java, is with **`interfaces`**.

  > An `interface` is a `completely "abstract class"` that is used to _group related methods_ with **empty bodies**

  > To `access` the interface methods, the interface must be `"implemented"` (kinda like inherited) by another class with the implements keyword (instead of extends).

- Interface:
  - `interface FirstInterface {.. methods...}`
- Implements
  - `class className implements FirstInterface, ... { ... overried methods...}`
- Note:

  > Like abstract classes, cannot be used to create objects

  > Interface methods do not have a body - the body is provided by the "implement" class

  > On implementation of an interface, you must `override` all of its `methods`

  > **Interface methods** are by default `abstract and public`

  > **Interface attributes** are by default `public, static and final`
  > An interface has `no constructor `

<br>

- Why And When To Use Interfaces?
  1. To achieve security - hide certain details and only show the important details of an object (interface).
  2. Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces.

EG:

```java
  interface FirstInterface {
    public void myMethod(); // interface method
  }

  interface SecondInterface {
    public void myOtherMethod(); // interface method
  }

  class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
      System.out.println("Some text..");
    }
    public void myOtherMethod() {
      System.out.println("Some other text...");
    }
  }
```

<br/>

Inner Classes:

- Def

  > Possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

  > To access the inner class, create an object of the outer class, and then create an object of the inner class

- Non Static Class
  - `class OuterClass {... class InnerClass {...} ... }`
  - Calling
    - `OuterClass` **`myOuter`** `= new OuterClass()`
    - `OuterClass.InnerClass` **`myInner `**`= myOuter.new InnerClass()` - need instance of OuterClass
- Static Class
  - `class OuterClass {...` **`static`** `class InnerClass {...} ... }`
  - Calling
    - `OuterClass.InnerClass` **`myInner `**`= new OuterClass.InnerClass()` - Don't need OuterClass instance
- Private inner Class

  - `class OuterClass {... private class InnerClass {...} ... }`
  - Calling
    - `OuterClass` **`myOuter`** `= new OuterClass()`
    - Can't call Inner but OuterClass can see InnerClass

- Local inner Class
  - `method {... class LocalInnerClass {...} ... }`
  - Calling
    - `InnerClass` **`myInner`** `= new InnerClass()`
    - Can only call in local method
- anonymous inner Class
  - `var.method(new InnerClass() {...} ... }`
  - Calling
    - Made there an then in method
    - Has no name
    - Can be passed as parmeter

## <br/>

---

### Packages:

- Package:
  - Used to group related classes
  - Java API has built-In Packages
- Built-In Pack:
  - import package.name.\*/Class
- User-defined:
  - package path;

---

<br/>

## GENERICS

- Def:

  > No having things in raw state (eg. Lists)

- Use generics
  > You create a generic type declaration public class className<typeParm>. This can be used anywhere inside the class.

```java
public class className<typeParm> {
    private typeParm t;

    public void set(typeParm t) { this.t = t; }
    public typeParm get() { return t; }
}
```

> This same technique can be applied to create generic interfaces.

Multiple Type Parameters

```java
public interface className<K, V> {
    public K getKey();
    public V getValue();
}

public class subClass<K, V> implements className<K, V> {
    private K key;
    private V value;

    public subClass(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}
```

<br/>

Bounded Types Parameters:

- Def:

  > To restrict the types that can be used as type arguments in a parameterized type. This is what bounded type parameters are for.

  > To declare bounded type parameter, list the type parameter's name, followed by the `'extends'` , followed by its upper bound

- Multiple Bounds
  - `<typeParm extends B1 & B2 & B3>`
  - If any is class, then must be class 1st.

EG:

```java
  public class className<typeParm extends Class/Interface &...> ?implements Interface1<typeParm>,..? {

    private typeParm n;

    public className(typeParm n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }
}
```

<br/>

### Type Parameter Naming Conventions

The most commonly used type parameter names are:

- E - Element (used extensively by the Java Collections Framework)
- K - Key
- N - Number
- T - Type
- V - Value
- S,U,V etc. - 2nd, 3rd, 4th types
