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
      Error.throwError(2);
      //e.printStackTrace();
    }catch(IllegalAccessException e){
      Error.throwError(6);
    }catch(InvocationTargetException e){
      Error.throwError(6);
    }
    return -1;

  }

  public static boolean testFunc(String name) { // modernize this!
    try {

      Class<?> classobj = Functions.class;

      Method[] methods = classobj.getMethods();
      for (Method m : methods) {
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