package demo;

/**
 * @Author: Mr.Zhou
 * @Date 2020/2/21
 * @Explain:
 */
public class Demo {
    public static void findPersonClass(Person person){
        Class<Person> c1=(Class<Person>) person.getClass();
        System.out.println();
    }
}
