public class Main {
    public static void main(String[] args){
        Ortoedro o1=new Ortoedro(4,3,7);
        TetraedroRegular T1=new TetraedroRegular(7);
        Cubo c1=new Cubo(3);

        //ortoedro
        o1.calcularSuperficie();
        o1.calcularVolumen();
        o1.toString();

        //tetraedroregular
        T1.calcularSuperficie();
        T1.calcularVolumen();
        T1.toString();

        //CUBO
        c1.calcularSuperficie();
        c1.calcularVolumen();
        c1.toString();

        System.out.println(o1.calcularSuperficie());
        System.out.println(o1.calcularVolumen());
        System.out.println(o1.toString());

        System.out.println(T1.calcularSuperficie());
        System.out.println(T1.toString());
        System.out.println(T1.calcularVolumen());

        System.out.println(c1.calcularSuperficie());
        System.out.println(c1.toString());
        System.out.println(c1.calcularVolumen());

    }
}
