public class Main {

    public static void main(String[] args){

        Figura[] v = new Figura[3];
        v[0] = new Rectangulo(5,2);
        v[1] = new Cuadrado(5);
        v[2] = new Circulo(5);

        Suma r = new Suma(v);
        double sol = r.suma();

        System.out.println(v[0].area());
        System.out.println(v[1].area());
        System.out.println(v[2].area());
        System.out.println(sol);
    }

}