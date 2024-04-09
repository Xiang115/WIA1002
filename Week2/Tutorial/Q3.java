package Week2.Tutorial;

public class Q3 {
    //Refer to https://github.com/fyiernzy/UM-WIA1002/blob/main/Tutorial/Tutorial2/T2Q3.java

    // What is a raw type?

    // In Java, a raw type refers to a generic class or interface that is used
    // without specifying any type parameters.
    // For example, if you have a generic class List<T> and you use it without
    // specifying the type parameter T,
    // like List myList = new ArrayList();, this is a raw type.

    // Why is a raw type unsafe?

    // It bypasses genetic type checking during compilation and lead to the runtime
    // exception

    // Why is the raw type allowed in Java?

    // To allow backward compatibilities for legacy code since generics are
    // introduced only in JDK 5.
}
