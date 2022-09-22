public class Suma {
    Figura[] vector;
    double sum;

    public Suma(Figura[] v){
        this.vector=v;
    }

    public double suma(){
    sum = vector[0].area()+vector[1].area()+vector[2].area();
    return sum;
    }

}
