import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
     private static Singleton obj;
     public String str;
     private Singleton()
     {
         
     }
    public static Singleton getSingleInstance()
    {
        if(obj==null)
        {
                    obj=new Singleton();   
        }
        return obj;
    }
}
