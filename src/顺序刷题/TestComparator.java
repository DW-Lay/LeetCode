package 顺序刷题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @classname TestComparator
 * @description：类的描述
 * @author：dml
 * @date 2020/11/23 10:35
 * @version: 1.0
 */
public class TestComparator {
    class Dog{
        public int age;
        public String name;
        public Dog(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }
        @Override
        public String toString() {
            return "Dog [age=" + age + ", name=" + name + "]";
        }
    }
    public static void main(String[] args) {
        List<Dog> list= new ArrayList<>();
        list.add(new TestComparator().new Dog(5, "DogA"));
        list.add(new TestComparator().new Dog(8, "DogB"));
        list.add(new TestComparator().new Dog(7, "DogC"));
        Collections.sort(list, new Comparator<Dog>() {

            @Override
            public int compare(Dog o1, Dog o2) {
                return o2.age-o1.age;
            }
        });
        System.out.println("给狗狗按照年龄倒序："+list);

    }
}
