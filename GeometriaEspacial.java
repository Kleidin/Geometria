public class GeometriaEspacial {
    private GeometriaEspacial() {}

    public static double calcularAreaPrisma(double areaBase, double altura) {
        return 2 * areaBase + altura * GeometriaPlana.calcularAreaRetangulo(Math.sqrt(areaBase), Math.sqrt(areaBase));
    }

    public static double calcularVolumePrisma(double areaBase, double altura) {
        return areaBase * altura;
    }

    public static double calcularAreaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }

    public static double calcularVolumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static double calcularAreaPiramide(double areaBase, double apotema) {
        double ladoBase = Math.sqrt(areaBase);
        double perimetroBase = 4 * ladoBase;
        return areaBase + (perimetroBase * apotema) / 2;
    }

    public static double calcularVolumePiramide(double areaBase, double altura) {
        return (areaBase * altura) / 3;
    }

    public static double calcularAreaCone(double raio, double altura) {
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        return Math.PI * raio * (raio + geratriz);
    }

    public static double calcularVolumeCone(double raio, double altura) {
        return (Math.PI * Math.pow(raio, 2) * altura) / 3;
    }

    public static double calcularVolumeEsfera(double raio) {
        return (4 * Math.PI * Math.pow(raio, 3)) / 3;
    }
}
