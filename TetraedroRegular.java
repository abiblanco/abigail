public class TetraedroRegular extends FiguraTridimensional{
    double arista;
    final int caras=4;
    public TetraedroRegular(double arista) {
        this.arista = arista;

    }
    public TetraedroRegular(){
        this.arista=1;
    }
    @Override
    public double calcularVolumen() {
        double volumen;
        volumen=(Math.sqrt(2))*(Math.pow(arista,3))/12;
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie=(Math.sqrt(3))*(Math.pow(arista,2));
        return superficie;
    }

    @Override
    public String toString() {
        return "La figura es un TetraedroRegular";
    }
}
