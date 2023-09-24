package homework1;

class Dog {
    private Dog() {
        // private constructor
    }
    public void eat(String food){
        if (food.equals("meat")){
            System.out.println("yes, meat!!");
        }else{
            System.out.println("nooo :(");
        }
    }
    public void voice(){
        System.out.println("Gaf");
    }
    public static Dog createDog() {
        return new Dog();
    }
}
