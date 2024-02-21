public class Rectangle {
    private int broad;
    private int height;

    public Rectangle(int broad, int height){
        this.broad=broad;
        this.height=height;
    }

    public int calculateArea(){
        return broad*height;
    }

    public int calculatePerimeter(){
        return 2*(broad+height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(5, 10);
        Rectangle rectangle2= new Rectangle(7, 11);
        Rectangle rectangle3= new Rectangle(3, 7);
        Rectangle rectangle4= new Rectangle(6, 12);
        Rectangle rectangle5= new Rectangle(1, 3);
        Rectangle rectangle6= new Rectangle(4, 5);

        System.out.println("The area of the rectangle number 1 is: "+rectangle1.calculateArea());
        System.out.println("The perimeter of the rectangle number 1 is: "+rectangle1.calculatePerimeter());

        System.out.println("The area of the rectangle number 2 is: "+rectangle2.calculateArea());
        System.out.println("The perimeter of the rectangle number 2 is: "+rectangle2.calculatePerimeter());

        System.out.println("The area of the rectangle number 3 is: "+rectangle3.calculateArea());
        System.out.println("The perimeter of the rectangle number 3 is: "+rectangle3.calculatePerimeter());

        System.out.println("The area of the rectangle number 4 is: "+rectangle4.calculateArea());
        System.out.println("The perimeter of the rectangle number 4 is: "+rectangle4.calculatePerimeter());

        System.out.println("The area of the rectangle number 5 is: "+rectangle5.calculateArea());
        System.out.println("The perimeter of the rectangle number 5 is: "+rectangle5.calculatePerimeter());

        System.out.println("The area of the rectangle number 6 is: "+rectangle6.calculateArea());
        System.out.println("The perimeter of the rectangle number 6 is: "+rectangle6.calculatePerimeter());
    }
}
