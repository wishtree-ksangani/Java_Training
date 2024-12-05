package sealed;

public final class Circle extends Shape {

    @Override
    public String draw(String description) {
        System.out.println("Inside the Circle class");
        return "Circle created";
    }
}
