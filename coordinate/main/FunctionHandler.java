package coordinate.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.lang.*;
import java.lang.reflect.Method;
import java.util.*;

public class FunctionHandler {
    
    public static Object runFunc(String name, Object[] args) {
      try {
       // JSONObject a =new JSONObject(new JSONTokener(new FileReader("coordinate/main/functions.json")));
        
        Class classobj = coordinate.main.Functions.class;

            // Get Method Object
         Method[] methods = classobj.getMethods();
         for(Method m : Arrays.copyOfRange(methods,0,methods.length)){
          if(m.getName().equals(name)){
            return m.invoke(coordinate.main.Functions.class,args);
          }
          
         }
        
      } catch (Throwable e) {
        e.printStackTrace();
      }
      return -1;
      
        
    }
    public static boolean testFunc(String name) {
      try {
       // JSONObject a =new JSONObject(new JSONTokener(new FileReader("coordinate/main/functions.json")));
        
        Class classobj = Functions.class;
          // fuhc
            // Get Method Object
         Method[] methods = classobj.getMethods();
         for(Method m : Arrays.copyOfRange(methods,0,methods.length)){
          if(m.getName().equals(name)){
            return true;
          }
          
         }
        
      } catch (Throwable e) {
        System.out.println(e);
      }
      return false;
        
    }
}