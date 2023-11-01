package task3;

import java.io.*;

public class Student  implements Serializable {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student nastya = new Student("Nastya", 17);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\nasta\\IdeaProjects\\texts\\tms3.txt"));
        objectOutputStream.writeObject(nastya);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\nasta\\IdeaProjects\\texts\\tms3.txt"));
        Student nastyaRestored = (Student) objectInputStream.readObject();
        objectInputStream.close();

        try (FileReader fr = new FileReader( "C:\\Users\\nasta\\IdeaProjects\\texts\\tms3.txt" )) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print(( char) i);
            }
        } catch (Exception e) {
            e.printStackTrace() ;
        }
    }
}
