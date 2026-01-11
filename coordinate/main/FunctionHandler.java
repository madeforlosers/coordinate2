package coordinate.main;

import java.lang.reflect.Method;
import java.util.Arrays;

public class FunctionHandler {

  public static Object runFunc(String name, Object[] args) {
    try {

      Class classobj = coordinate.main.Functions.class;

      Method[] methods = classobj.getMethods();
      for (Method m : Arrays.copyOfRange(methods, 0, methods.length)) {
        if (m.getName().equals(name)) {
          return m.invoke(coordinate.main.Functions.class, args);
        }

      }

    } catch (Throwable e) {
      e.printStackTrace();
    }
    return -1;

  }

  public static boolean testFunc(String name) {
    try {

      Class classobj = Functions.class;
     
      Method[] methods = classobj.getMethods();
      for (Method m : Arrays.copyOfRange(methods, 0, methods.length)) {
        if (m.getName().equals(name)) {
          return true;
        }

      }

    } catch (Throwable e) {
      e.printStackTrace();
    }
    return false;

  }
}