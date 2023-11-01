package task4;

/*Создать класс студент с полями группа, фамилия, возраст
Создать массив из не менее чем 6 разных студентов, отсортировать его.
Порядок сортировки должен быть таким- группа>возраст>фамилия*/

import java.io.Serializable;
import java.lang.reflect.Array;


public class Student implements Serializable {
        private String group;
        private String surname;
        private int age;

        public Student(String group, String surname, int age) {
            this.group = group;
            this.surname = surname;
            this.age = age;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


    public static void main(String[] args) {
        Student ann = new Student("4a", "Johnson", 17);
        Student pete = new Student("5d", "Hathaway", 18);
        Student lisa = new Student("11e", "Peterson", 20);




    }
}
