package coordinate.main;

import java.lang.reflect.Method;

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
    } catch (Throwable e) {
      e.printStackTrace();
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