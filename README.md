9# CYS-PassArr
Listing 22 CYS-PassArr/PassArr.java Page 46

# Section 6   
## Static functions  
 
Classes usually contain, besides fields, constructors and methods (that we will cover
later, when talking about classes) also static functions (or static methods). We can
think about a function as a piece of code that can be executed (invoked) many times
from other functions (for example, from main) in such a way that in each invocation
some data that the function operates on may be different.
The definition of a static function is of the form

```java
[access] static Type funName(Type1 parName1, Type2 parName2, ...) {
// body of the function
}
```

and consists of

• The keyword static (there are also functions which are not static — we will be
talking about them in Sec. 8, p. 60). Before or after this keyword we could place
an access specifier of the function (public or private) — we will discuss it later.  
  
• The name of the type of a result which this function yields (the so called return
type); void, if the function doesn’t return any result.  
  
• A name of the function; it should always start with a lower-case letter but is
otherwise arbitrary.  
  
• In round parentheses, a list of parameters: these are comma separated pairs Type
parName where Type is the name of a type and parName is an (arbitrary) name of
this parameter (it should start with a lower-case letter). The list of parameters
can be empty, but parentheses are always required.  
  
• The body of the function enclosed in braces.  
  
Names of parameters are arbitrary and have nothing to do with names declared in other
functions (as their parameters or variables defined inside them). We invoke (call) the
function just by its name with arguments corresponding to the function’s parameters
enclosed in round parentheses:  
  
```java
... funName(arg1, arg2, ...) ...
```
  
What happens is:  
  
• Copies of the values of arguments are pushed (placed) on the program’s stack
(a special region of memory).
• These copies of the arguments, laying on the stack, can be accessed inside the
body of the functions by names of the corresponding declared parameters. Their
names in the calling function are completely irrelevant, because a function can see
only values laying on the stack. We can say that it doesn’t even know ‘who calls’
it and where from. It only knows that there must be values of the appropriate
type (as declared as the type of parameters) lying on the stack that can be
associated with its parameters. In particular, we can use literals as arguments
— copies of their values will be then pushed on the stack.
• All variables defined inside a function are local to this function — they are
also located on the stack (in the example below, mx is such a local variable).
This region of the program stack, associated with an invocation of a function, is
called this function’s stack frame or activation record. Note that names of
local variables are arbitrary and unrelated to local variables of the same name
appearing in other functions.