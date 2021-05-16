import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection{

    private ArrayList<GeometricObject> shapeList;
    private int numObject;

    public GeometricShapeCollection(int listLength){
        this.numObject = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

    @Override
    public void addShape(GeometricObject shape) {

        if (shapeList.size() < numObject){
            shapeList.add(shape);
        }
        else{
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {
        for (int i=0; i < shapeList.size(); i++) {
            if (shapeList.get(i).getShape().equals("Circle")) {
                System.out.println("Shape = Circle, Area = " + shapeList.get(i).getArea() +
                        ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getShape().equals("Rectangle")) {
                System.out.println("Shape = Rectangle, Area = " + shapeList.get(i).getArea() +
                        ", Perimeter = " + shapeList.get(i).getPerimeter());
            } else if (shapeList.get(i).getShape().equals("Square")) {
                System.out.println("Shape = Square, Area = " + shapeList.get(i).getArea() +
                        ", Perimeter = " + shapeList.get(i).getPerimeter());
            }
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("\nTo add a new shape press 1");
        System.out.println("T0 print the list of shapes press 2");
        System.out.println("To exit press 3");

        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("\nPress 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");

                System.out.print("> ");
                int choice2 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the color of your shape: ");
                String colour = scanner.nextLine();
                System.out.print("Is it filled? (y/n): ");
                String isFilled = scanner.nextLine();
                boolean filled = false;
                if (isFilled.equals("y"))
                    filled = true;
                else if (isFilled.equals("n"))
                    filled = false;
                else
                    System.out.println("Please enter y or n, if the shape is filled or not respectively");

                switch(choice2) {
                    case 1:
                        System.out.print("Insert the radius: ");
                        int radius = scanner.nextInt();
                        Circle circle = new Circle(colour, filled, radius);
                        this.addShape(circle);
                        break;

                    case 2:
                        System.out.print("Insert the length: ");
                        double length = scanner.nextDouble();
                        System.out.print("Insert the width: ");
                        double width = scanner.nextDouble();
                        Rectangle rectangle = new Rectangle(colour, filled, length, width);
                        this.addShape(rectangle);
                        break;

                    case 3:
                        System.out.print("Insert length of a side: ");
                        double side = scanner.nextDouble();
                        Square square = new Square(colour, filled, side);
                        this.addShape(square);
                        break;
                }
                break;

            case 2:
                this.printShapeList();
                break;

            case 3:
                exit = true;
                break;
        }
        return exit;
    }
}
