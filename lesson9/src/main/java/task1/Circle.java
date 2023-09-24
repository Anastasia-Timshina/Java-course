package task1;

public class Circle extends Shape{
    public void draw(){
        System.out.println("I draw" + " circle");
    }

    public void erase(){
        System.out.println("I erase" + getClass());
    }
}
