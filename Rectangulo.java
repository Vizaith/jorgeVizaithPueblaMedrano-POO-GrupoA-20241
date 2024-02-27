import java.util.*;

public class Rectangulo {
    private double l1;
    private double l2;

    public Rectangulo(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public Rectangulo(int l1, int l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public double calcularArea(){
        return l1*l2;
    }

    public double calcularPerimetro(){
        return 2*(l1+l2);
    }

    public double calcularArea(int l1, int l2){
        return (double)l1*l2;
    }

    public double calcularPerimetro(int l1, int l2){
        return 2*((double)l1+l2);
    }

    public static void main(String[] args){
        Rectangulo rectanguloDouble = new Rectangulo(4.5,3.2);
        System.out.println("El area del rectangulo (double) es: "+rectanguloDouble.calcularArea());
        System.out.println("El perimetro del rectangulo (double) es: "+rectanguloDouble.calcularPerimetro());

        Rectangulo rectanguloInt = new Rectangulo(5, 3);
        System.out.println("El area del rectangulo (int) es: "+rectanguloInt.calcularArea(5,3));
        System.out.println("El perimetro del rectangulo (int) es: "+rectanguloInt.calcularPerimetro(5,3)); 
    }
}
