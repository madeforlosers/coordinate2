package coordinate.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
      Class<?> classobj = coordinate.main.Functions.class;
      if (name.equals("aslist")) { // this is stupid!!!!!
        Method method = classobj.getMethod("aslist", Object[].class);
        return method.invoke(classobj, (Object) args);
      } else {
        Class<?>[] parameterTypes = new Class<?>[args.length];
        int inc = 0;
        for (Object t : args) {
          parameterTypes[inc++] = t.getClass();
        }
        Method method = classobj.getDeclaredMethod(name, parameterTypes);
        return method.invoke(coordinate.main.Functions.class, args);
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
    if (name.equals("aslist")) { // bypass
      return true;
    }
    try {
      Class<?>[] parameterTypes = new Class<?>[args.length];
      int inc = 0;
      for (Object t : args) {
        parameterTypes[inc++] = t.getClass();
      }
      coordinate.main.Functions.class.getMethod(name, parameterTypes);
      return true;
    } catch (NoSuchMethodException e) {
      Method[] methods = coordinate.main.Functions.class.getMethods();
      for (Method m : methods) {
        if (m.getName().equals(name)) {
          Error.throwError(2); // this means the function exists, its just wrong args
          return false;
        }
      }
      return false; // this means the function doesnt exist
    }

  }
}