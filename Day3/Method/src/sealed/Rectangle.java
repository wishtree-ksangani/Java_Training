package sealed;

public final class Rectangle extends Shape{
    public String draw(String description){
        System.out.println("Inside Rectangle class");
        return "Rectangle Created";
    }

}
