public class Cubo extends FiguraTridimensional{
    double lado;
    final int caras=6;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo(){
        this.lado=1;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen=Math.pow(lado,3);
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie=6*(Math.pow(lado,2));
        return superficie;
    }

    @Override
    public String toString() {
        return "La figura es un Cubo";
    }
}
