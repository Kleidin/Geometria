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
                    System.out.println(calcularAreaEVolumeTroncoCone(scanner));
                    break;
                case 13:
                    System.out.println(calcularAreaEVolumeTroncoPiramide(scanner));
                    break;
                case 14:
                    System.out.println(calcularAreaEVolumeEsfera(scanner));
                    break;
                case 15:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (escolha != 15);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=============================================");
        System.out.println("              Menu de Opções");
        System.out.println("=============================================");
        System.out.println("1.  Área do Quadrado");
        System.out.println("2.  Área do Retângulo");
        System.out.println("3.  Área do Triângulo");
        System.out.println("4.  Área do Paralelogramo");
        System.out.println("5.  Área do Losango");
        System.out.println("6.  Área do Trapézio");
        System.out.println("7.  Área da Circunferência");
        System.out.println("8.  Área e Volume do Prisma");
        System.out.println("9.  Área e Volume do Cilindro");
        System.out.println("10. Área e Volume da Pirâmide");
        System.out.println("11. Área e Volume do Cone");
        System.out.println("12. Área e Volume do Tronco do Cone");
        System.out.println("13. Área e Volume do Tronco da Pirâmide");
        System.out.println("14. Área e Volume da Esfera");
        System.out.println("15. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static String calcularAreaQuadrado(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área do Quadrado");
        System.out.println("=============================================");
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaQuadrado(lado);
        return "A área do quadrado é: " + area;
    }

    private static String calcularAreaRetangulo(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área do Retângulo");
        System.out.println("=============================================");
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaRetangulo(base, altura);
        return "A área do retângulo é: " + area;
    }

    private static String calcularAreaTriangulo(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área do Triângulo");
        System.out.println("=============================================");
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaTriangulo(base, altura);
        return "A área do triângulo é: " + area;
    }

    private static String calcularAreaParalelogramo(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área do Paralelogramo");
        System.out.println("=============================================");
        System.out.print("Digite a base do paralelogramo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do paralelogramo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaParalelogramo(base, altura);
        return "A área do paralelogramo é: " + area;
    }

    private static String calcularAreaLosango(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área do Losango");
        System.out.println("=============================================");
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaLosango(diagonalMaior, diagonalMenor);
        return "A área do losango é: " + area;
    }

    private static String calcularAreaTrapezio(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área do Trapézio");
        System.out.println("=============================================");
        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();
        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaTrapezio(baseMaior, baseMenor, altura);
        return "A área do trapézio é: " + area;
    }

    private static String calcularAreaCircunferencia(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área da Circunferência");
        System.out.println("=============================================");
        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaCircunferencia(raio);
        return "A área da circunferência é: " + area;
    }

    private static String calcularAreaEVolumePrisma(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Prisma");
        System.out.println("=============================================");
        System.out.print("Digite o perímetro da base do prisma: ");
        double perimetroBase = scanner.nextDouble();
        System.out.print("Digite a área da base do prisma: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura do prisma: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPrisma(perimetroBase, areaBase, altura);
        double volume = GeometriaEspacial.calcularVolumePrisma(areaBase, altura);
        return "A área do prisma é: " + area + "\nO volume do prisma é: " + volume;
    }

    private static String calcularAreaEVolumeCilindro(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Cilindro");
        System.out.println("=============================================");
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCilindro(raio, altura);
        double volume = GeometriaEspacial.calcularVolumeCilindro(raio, altura);
        return "A área do cilindro é: " + area + "\nO volume do cilindro é: " + volume;
    }

    private static String calcularAreaEVolumePiramide(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume da Pirâmide");
        System.out.println("=============================================");
        System.out.print("Digite o perímetro da base da pirâmide: ");
        double perimetroBase = scanner.nextDouble();
        System.out.print("Digite a área da base da pirâmide: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura da pirâmide: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o apótema da pirâmide: ");
        double apotema = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPiramide(perimetroBase, areaBase, apotema);
        double volume = GeometriaEspacial.calcularVolumePiramide(areaBase, altura);
        return "A área da pirâmide é: " + area + "\nO volume da pirâmide é: " + volume;
    }

    private static String calcularAreaEVolumeCone(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Cone");
        System.out.println("=============================================");
        System.out.print("Digite o raio da base do cone: ");
        double raioBase = scanner.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCone(raioBase, altura);
        double volume = GeometriaEspacial.calcularVolumeCone(raioBase, altura);
        return "A área do cone é: " + area + "\nO volume do cone é: " + volume;
    }

    private static String calcularAreaEVolumeTroncoCone(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Tronco do Cone");
        System.out.println("=============================================");
        System.out.print("Digite o raio maior da base do tronco do cone: ");
        double raioMaior = scanner.nextDouble();
        System.out.print("Digite o raio menor da base do tronco do cone: ");
        double raioMenor = scanner.nextDouble();
        System.out.print("Digite a altura do tronco do cone: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaTroncoCone(raioMaior, raioMenor, altura);
        double volume = GeometriaEspacial.calcularVolumeTroncoCone(raioMaior, raioMenor, altura);
        return "A área do tronco do cone é: " + area + "\nO volume do tronco do cone é: " + volume;
    }

    private static String calcularAreaEVolumeTroncoPiramide(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Tronco da Pirâmide");
        System.out.println("=============================================");
        System.out.print("Digite a área da base maior do tronco da pirâmide: ");
        double areaBaseMaior = scanner.nextDouble();
        System.out.print("Digite a área da base menor do tronco da pirâmide: ");
        double areaBaseMenor = scanner.nextDouble();
        System.out.print("Digite a altura do tronco da pirâmide: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o apótema do tronco da pirâmide: ");
        double apotema = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaTroncoPiramide(areaBaseMaior, areaBaseMenor, altura, apotema);
        double volume = GeometriaEspacial.calcularVolumeTroncoPiramide(areaBaseMaior, areaBaseMenor, altura);
        return "A área do tronco da pirâmide é: " + area + "\nO volume do tronco da pirâmide é: " + volume;
    }

    private static String calcularAreaEVolumeEsfera(Scanner scanner) {
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume da Esfera");
        System.out.println("=============================================");
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaEsfera(raio);
        double volume = GeometriaEspacial.calcularVolumeEsfera(raio);
        return "A área da esfera é: " + area + "\nO volume da esfera é: " + volume;
    }
}
