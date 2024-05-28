import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            mostrarMenu();
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println(calcularAreaQuadrado(scanner));
                    break;
                case 2:
                    System.out.println(calcularAreaRetangulo(scanner));
                    break;
                case 3:
                    System.out.println(calcularAreaTriangulo(scanner));
                    break;
                case 4:
                    System.out.println(calcularAreaParalelogramo(scanner));
                    break;
                case 5:
                    System.out.println(calcularAreaLosango(scanner));
                    break;
                case 6:
                    System.out.println(calcularAreaTrapezio(scanner));
                    break;
                case 7:
                    System.out.println(calcularAreaCircunferencia(scanner));
                    break;
                case 8:
                    System.out.println(calcularAreaEVolumePrisma(scanner));
                    break;
                case 9:
                    System.out.println(calcularAreaEVolumeCilindro(scanner));
                    break;
                case 10:
                    System.out.println(calcularAreaEVolumePiramide(scanner));
                    break;
                case 11:
                    System.out.println(calcularAreaEVolumeCone(scanner));
                    break;
                case 12:
                    System.out.println(calcularVolumeEsfera(scanner));
                    break;
                case 13:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opçao invalida. Tente novamente");
                    break;
            }
        } while (escolha != 13);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=============================================");
        System.out.println("              Menu de Opçoes");
        System.out.println("=============================================");
        System.out.println("1.  Area do Quadrado");
        System.out.println("2.  Area do Retangulo");
        System.out.println("3.  Area do Triangulo");
        System.out.println("4.  Area do Paralelogramo");
        System.out.println("5.  Area do Losango");
        System.out.println("6.  Area do Trapezio");
        System.out.println("7.  Area da Circunferencia");
        System.out.println("8.  Area e Volume do Prisma");
        System.out.println("9.  Area e Volume do Cilindro");
        System.out.println("10. Area e Volume da Piramide");
        System.out.println("11. Area e Volume do Cone");
        System.out.println("12. Volume da Esfera");
        System.out.println("13. Sair");
        System.out.print("Escolha uma opçao: ");
    }

    private static String calcularAreaQuadrado(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area do Quadrado");
        System.out.println("=============================================");
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaQuadrado(lado);
        return "A Area do quadrado e: " + area;
    }

    private static String calcularAreaRetangulo(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area do Retangulo");
        System.out.println("=============================================");
        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaRetangulo(base, altura);
        return "A Area do retangulo e: " + area;
    }

    private static String calcularAreaTriangulo(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area do Triangulo");
        System.out.println("=============================================");
        System.out.print("Digite a base do triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triangulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaTriangulo(base, altura);
        return "A Area do triangulo e: " + area;
    }

    private static String calcularAreaParalelogramo(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area do Paralelogramo");
        System.out.println("=============================================");
        System.out.print("Digite a base do paralelogramo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do paralelogramo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaParalelogramo(base, altura);
        return "A Area do paralelogramo e: " + area;
    }

    private static String calcularAreaLosango(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area do Losango");
        System.out.println("=============================================");
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaLosango(diagonalMaior, diagonalMenor);
        return "A Area do losango e: " + area;
    }

    private static String calcularAreaTrapezio(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area do Trapezio");
        System.out.println("=============================================");
        System.out.print("Digite a base maior do trapezio: ");
        double baseMaior = scanner.nextDouble();
        System.out.print("Digite a base menor do trapezio: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Digite a altura do trapezio: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaTrapezio(baseMaior, baseMenor, altura);
        return "A Area do trapezio e: " + area;
    }

    private static String calcularAreaCircunferencia(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area da Circunferencia");
        System.out.println("=============================================");
        System.out.print("Digite o raio da circunferencia: ");
        double raio = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaCircunferencia(raio);
        return "A Area da circunferencia e: " + area;
    }

    private static String calcularAreaEVolumePrisma(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area e Volume do Prisma");
        System.out.println("=============================================");
        System.out.print("Digite a Area da base do prisma: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura do prisma: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPrisma(areaBase, altura);
        double volume = GeometriaEspacial.calcularVolumePrisma(areaBase, altura);
        return "A Area do prisma e: " + area + "\nO volume do prisma e: " + volume;
    }

    private static String calcularAreaEVolumeCilindro(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area e Volume do Cilindro");
        System.out.println("=============================================");
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCilindro(raio, altura);
        double volume = GeometriaEspacial.calcularVolumeCilindro(raio, altura);
        return "A Area do cilindro e: " + area + "\nO volume do cilindro e: " + volume;
    }

    private static String calcularAreaEVolumePiramide(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area e Volume da Piramide");
        System.out.println("=============================================");
        System.out.print("Digite a Area da base da piramide: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura da piramide: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o apótema da piramide: ");
        double apotema = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPiramide(areaBase, apotema);
        double volume = GeometriaEspacial.calcularVolumePiramide(areaBase, altura);
        return "A Area da piramide e: " + area + "\nO volume da piramide e: " + volume;
    }

    private static String calcularAreaEVolumeCone(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Area e Volume do Cone");
        System.out.println("=============================================");
        System.out.print("Digite o raio da base do cone: ");
        double raioBase = scanner.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCone(raioBase, altura);
        double volume = GeometriaEspacial.calcularVolumeCone(raioBase, altura);
        return "A Area do cone e: " + area + "\nO volume do cone e: " + volume;
    }

    private static String calcularVolumeEsfera(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Volume da Esfera");
        System.out.println("=============================================");
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        double volume = GeometriaEspacial.calcularVolumeEsfera(raio);
        return "O volume da esfera e: " + volume;
    }
}
