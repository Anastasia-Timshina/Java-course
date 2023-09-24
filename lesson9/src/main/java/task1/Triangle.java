package task1;

public class Triangle extends Shape{
    public void draw(){
        System.out.println("I draw" + getClass());
    }
    public void erase(){
        System.out.println("I erase" + getClass());
    }
}
