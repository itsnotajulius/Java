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

### Arithmetic Operators:

Addition: +
Sub: -
Multi \*
Division /
Mod/Remainder %
Power: ^
Increment: ++
Decrement: --
Abbreviated: op= #

Comparison Operators:
Equal: =
== (boolean/int)
Not Equal: !=
Greater: > >=
Less Than: <
<=
String Operators:
Equals: =
text.equals(text) (useful if toLowerCase)

Logical Operators:
AND: &&
OR: ||
Not: !

### Conditions:

```java
If:                         if(condition){..}
If_Else:                    if(condition){..}else{..}
Ternary Operator:           dataType var = (condition) ? conditionMet : .._else_...
Else_if:                    if(condition){..}else if(condition){..}else{..}

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

For Loop:                   for(init;termination;increment)
For:Each                    for(init :array){...}

While:                      while(condition){...}
Do While:                   do{..}while(condition)

Break:                      break;                    (stops)
Continue:                   continue;                 (Next)
```

---

<br/>

## JAVA KEYWORDS:

### MODIFIERS:

- Access Modifers:
  - public (accessible by other classes)
  - private (accessible only in declared class,subclasses can access)
  - protected (only same packahe and subclasses)
  - default (accessed by classes in same package, when no modifiers set)
- Non-Access Modifers:
  - final (cant be inherited by other classes and attri cant be moded spell in caps)
  - static (attr/methods belong to class can be used but static variables are shared across Instances)
    - (eg change one all changes)
  - (classes methods cant use instance variable\this.)
  - abstract (the class cant make objects)
  - abstract (methods can only be used in abstract class)
  - transient (attri and methods are skipped when serializing)
  - synchronized (methods can only be access one thread @ time)
  - volatile (attri is not cached)

### FUNCTIONS:

#### String Functions:

- Concatenation:
  - Text+""+Text

* Cancate: text1.concat("text2")
* Length: text.length()
* Upper Case: text.toUpperCase()
* Lower Case: text.toLowerCase()
* IndexOf: text.indexOf("searchText")
* Check if Digit: text.matchs("[0-9]+.") (+ means one or more times)
* Format Numbers: String.format("format",text) (eg: "%.2f")
* Equal: text.Equal(text) (boolean output)

            Special Charaters:
              Single Quote:             \'text\'
              Double Quote:             \"text\"
              Backslash:                 \\
              New Line:                   \n
              Carriage Return:            \r
              Tab:                        \t
              Backspace:                  \b      (Del)
              Form Feed:                  \f

Integer:
Pa

Math Functions:
Max: Math.max(x,y)
Min: Math.min(x,y)
Square Root: Math.sqrt(x)
Absolute(Positive): Math.abs(x)
Random: Math.random()
Round: Math.round(x)
Pi: Math.Pi()

METHODS:
Void Method: void myMethod(?dataType? ?var?,...){}
Not Void Method: dataType myMethod(?dataType? ?var?,...){return dataTypeVar;}
Method Overloading: dataType1 myMethod(dataType1 var){return;} dataType2 myMethod(dataType2 var){return;} (use the same name)
Recursion Method: dataType myMethod(?dataType? ?var?,...){return myMethod(?var?);}
abstract Method: abstract void myMethod();
Call Method: myMethod(?var?,...);

## OOP:

### Object Oriented Programming:

Definition: OOP is about creating objects that contain both data and methods. It is reuseable and less code and shorted dev time

Classes: Is a blueprint. Is the template for objects

Objects: Is an instance/refence of classes, they inherit all public variables and methods of class
When assigning Instances to Instances you assign it to the object in memory and can modify both at once
No static mean instance has its own variables, with static mean variables of different instances are same

Getters/setters: Used for validation and tests

    Class:                      public class myClass{dataType arriType = data;....}
    Class Constructor:          public myClass(?dataType? ?var?,...){set stuff}
                                (must be public, no void, dont use getters and setters)
                                public myClass(){?set default?}
                                this(?var?,...);
                                (Calling constructer in object)(Make consturc chains for no dups)
    Object:                     myClass myObj = new myClass();
                                (Can be in different java files but same dir)
    Object variable:            myObj.x
    Modi Variable:              myObj.x = stuff
    Current object:             this.x
                                (If parameter has same name as instance/object variable)
    Static and Public:          static access without object, public need object to be accessed



    Inheritance:
      Def:                        A Superclass-name you know another  Subclass-name will need. (Eg PetCode needs Class:dog needs Class: Characteristics)
      To inherit:                 class subclass-Name extends superclass-Name                   (if it has constructer subclass must have constructer)
      Call SupConstruc:           super(?var?,...);                                             (Access Parent Class Construcs)
      Call Sup Method:            super.methodName(...);                                        (Access Parent Class methods)
      Call Sup var:               super.var;                                                    (Access Parent Class vars)
      Override:                   @Override methodStuff                                         (Call child method thats in Superclass needs same methodName and paras)
                                                                                                (Runtime Polymorphism)(Cant override final&private or static only instance/this)

    Polymorphism:
      Def:                        Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
                                  Polymorphism usesthose methods to perform different tasks. This allows us to perform a single action in different ways.
                                  (Eg Superclass Animal has method Methodx(). Subclasses of Animals also have their own implementation of an methodX())



    Encapsulation:
      Definition:                 Is used to make sure sensitive data is hidden from user with private variables and public get and set
                                  Hide things from other classes

    Composition:
      `Note:`                      `Use before Inheritance`
      Definition:                 Describes a class that references one or more objects of other classes. Allows you to model a has-a association between objects.
                                  Inheritance has limits but use that here give access to all. (Pc has case, monitor, motherboard)
                                  Object that has other Objects (Pc has case, monitor, motherboard)(Dog is animal)





    Packages:
      Package:                  Used to group related classes
                                Java API has built-In Packages
      Built-In Pack:            import package.name.*/Class
      User-defined:             package path;
