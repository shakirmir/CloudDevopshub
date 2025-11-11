public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// The fix was simple: Java requires that the public class name exactly matches the filename (case-sensitive). 
// I renamed helloworld.java → HelloWorld.java, and now it compiles and runs without errors.
// compile and run the program using:
// javac HelloWorld.java
// java  HelloWorld