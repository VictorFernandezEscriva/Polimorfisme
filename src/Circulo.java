public class Circulo extends Figura{

    double r;

    public Circulo(double r){
        this.r = r;
    }

    public double area(){
        return (Math.PI * Math.pow(r,2));
    }

}
