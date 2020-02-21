package demo;

import java.lang.reflect.*;

/**
 * @Author: Mr.Zhou
 * @Date 2020/2/21
 * @Explain:
 */
public class Test {
    public static void main(String[] args) {
        Class c1 = null;
        try {
            c1 = Class.forName("demo.Student");
           // System.out.println("获得类所代表的完整名称"+c1.getName());
//            Class superclass = c1.getSuperclass();
//            System.out.println("获得父类的完整类名称:"+superclass.getName());
//            Class[] interfaces = c1.getInterfaces();
//            for (Class Inter : interfaces) {
//                System.out.println("c1实现的接口的完整名称:"+Inter);
//            }
//            Constructor[] cons = c1.getConstructors();
//            for (int i = 0; i <cons.length ; i++) {
//                Constructor con=cons[i];
//                int modify=con.getModifiers();  //获取访问权限
//                System.out.print("访问权限为:"+ Modifier.toString(modify)+" ");//使用 Modifier.toString(modify)进行转换访问权限
//                String name=con.getName();
//                System.out.print(name+" ");//获得类的完整路径
//                System.out.print("(");
//                Class[] parameters = con.getParameterTypes();   //循环获取有参构造列表
//                if (parameters!=null&& parameters.length>0){
//                    for (int j = 0; j <parameters.length ; j++) {
//                        if (j<parameters.length-1){
//                            System.out.print(parameters[j].getName()+" arg"+j+",");
//                        }else {
//                            System.out.print(parameters[j].getName()+" arg"+j);
//                        }
//                    }
//                }
//                System.out.println("){}");
//            }
//
           // Method[] methods = c1.getMethods(); //获取方法的访问修饰符（只能获取修饰符为public的方法）
            Method[] methods = c1.getDeclaredMethods();//获取本类的方法
            for (int i = 0; i <methods.length; i++) {
                Method method=methods[i];
                int modify=method.getModifiers();   //获取访问权限
                System.out.print(Modifier.toString(modify)+" ");    //使用 Modifier.toString(modify)进行转换访问权限
                Class returnClass = method.getReturnType();     //该对象表示的方法的返回类型。
                System.out.print(returnClass+" ");
                String name=method.getName();
                System.out.print(name+"(");      //获取方法名
                Class[] parameters = method.getParameterTypes();    //该对象表示的方法的参数类型。
                if (parameters!=null&&parameters.length>0){
                    for (int j = 0; j <parameters.length ; j++) {
                        if (j<parameters.length-1){
                            System.out.print(parameters[j].getName()+" arg"+j+",");
                        }else{
                            System.out.print(parameters[j].getName()+" arg"+j);
                        }
                    }
                }
                System.out.print(")");
                Class[] exceptionTypes = method.getExceptionTypes();    //被该对象表示的方法抛出的异常类型。
                if (exceptionTypes!=null&&exceptionTypes.length>0){
                    System.out.println("throws ");
                    for (int j = 0; j <exceptionTypes.length ; j++) {
                        if (j<exceptionTypes.length-1){
                            System.out.print(exceptionTypes[j].getName()+",");
                        }else{
                            System.out.print(exceptionTypes[j].getName());
                        }
                    }
                }
                System.out.print("{}\n");
            }


            //获取方法属性
           // Field[] fields = c1.getFields();
//            Field[] fields=c1.getDeclaredFields();
//            for (int i = 0; i <fields.length ; i++) {
//                Field field=fields[i];
//                int modify=field.getModifiers();
//                System.out.print(Modifier.toString(modify)+" ");
//                Class type = field.getType();
//                System.out.print(type.getName()+" ");
//                String name=field.getName();
//                System.out.print(name+";");
//            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
