package coordinate.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  FunctionHandler.java
 *      Runs functions from Functions.java based on
 *      function name string and argument types
 * 
 *  TODO:
 *      comment code more
*/

public class FunctionHandler {

  public static Object runFunc(String name, Object[] args) {
    try {
      Class<?> classobj = coordinate.main.FunctionRedirect.class;
      Method method;
      int inc;
      switch (name) {

        case "aslist":
          method = classobj.getMethod("aslist", Object[].class);
          return method.invoke(classobj, (Object) args);

        case "callfunc":
          method = classobj.getMethod("callfunc", Long.class, Object.class, Object.class, Object.class,
              Object.class);
          Object[] h = Arrays.copyOf(args, 5);

          inc = 0;

          for (Object g : h) {
            if (inc >= args.length) {
              h[inc] = new Object();
            }
            inc++;
          }

          return method.invoke(classobj, h);

        case "send":
          method = classobj.getMethod("send", Object.class);
          return method.invoke(classobj, args);

        case "empty":
          return FunctionRedirect.empty();

        default:
          Class<?>[] parameterTypes = new Class<?>[args.length];

          inc = 0;
          for (Object t : args) {
            parameterTypes[inc++] = t.getClass();
          }

          method = classobj.getDeclaredMethod(name, parameterTypes);
          return method.invoke(coordinate.main.FunctionRedirect.class, args);

      }

    } catch (NoSuchMethodException e) {
      Error.throwError(8);

    } catch (IllegalAccessException e) {
      e.printStackTrace();
      Error.throwError(6);
    } catch (InvocationTargetException e) {
      e.printStackTrace();
      Error.throwError(6);
    }
    return -1;

  }

  public static boolean testFunc(String name, Object[] args) { // modernize this!
    if (name.equals("aslist") || name.equals("callfunc") || name.equals("send") || name.equals("empty")) { // bypass
      return true;
    }
    try {
      Class<?>[] parameterTypes = new Class<?>[args.length];
      int inc = 0;
      for (Object t : args) {
        parameterTypes[inc++] = t.getClass();
      }
      coordinate.main.FunctionRedirect.class.getMethod(name, parameterTypes);
      return true;
    } catch (Exception e) {
      Method[] methods = coordinate.main.FunctionRedirect.class.getMethods();
      for (Method m : methods) {
        if (m.getName().equals(name)) {
          // e.printStackTrace();
          Error.throwError(2); // this means the function exists, its just wrong args
          return false;
        }
      }
      return false; // this means the function doesnt exist
    }

  }
}