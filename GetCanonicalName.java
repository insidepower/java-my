import java.util.HashMap;
import java.io.Serializable;

public class GetCanonicalName{
  public static void main(String args[]){
    System.out.println(int.class.getName());
    // output: int
    System.out.println(int.class.getCanonicalName());
    // output: int
    System.out.println(int.class.getSimpleName());
    // output: int

    System.out.println();

    //class
    System.out.println(String.class.getName());
    // output: java.lang.String
    System.out.println(String.class.getCanonicalName());
    // output: java.lang.String
    System.out.println(String.class.getSimpleName());
    // output: String

    System.out.println();

    //inner class
    System.out.println(HashMap.SimpleEntry.class.getName());
    // output: java.util.AbstractMap$SimpleEntry
    System.out.println(HashMap.SimpleEntry.class.getCanonicalName());
    // output: java.util.AbstractMap$SimpleEntry
    System.out.println(HashMap.SimpleEntry.class.getSimpleName());
    // output: SimpleEntry

    System.out.println();

    //anonymous inner class
    System.out.println(
        "new Serializable(){}.getClass().getName(): "+
        new Serializable(){}.getClass().getName());
    System.out.println(
        "new Serializable(){}.getClass().getCanonicalName() : "+
        new Serializable(){}.getClass().getCanonicalName());
    System.out.println(
        "new Serializable(){}.getClass().getSimpleName() :"+
        new Serializable(){}.getClass().getSimpleName());
  }
}

/*
 *
new Serializable(){}.getClass().getName(): GetCanonicalName$1
new Serializable(){}.getClass().getCanonicalName() : null
new Serializable(){}.getClass().getSimpleName() :
 */
