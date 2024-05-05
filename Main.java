public class Main {
    private static final List<Runnable> OPCOES = new ArrayList<>();

    static {
        OPCOES.add(Main::calcularAreaQuadrado);
        OPCOES.add(Main::calcularAreaRetangulo);
        OPCOES.add(Main::calcularAreaTriangulo);
        OPCOES.add(Main::calcularAreaParalelogramo);
        OPCOES.add(Main::calcularAreaLosango);
        OPCOES.add(Main::calcularAreaTrapezio);
        OPCOES.add(Main::calcularAreaCircunferencia);
        OPCOES.add(Main::calcularAreaEVolumePrisma);
        OPCOES.add(Main::calcularAreaEVolumeCilindro);
        OPCOES.add(Main::calcularAreaEVolumePiramide);
        OPCOES.add(Main::calcularAreaEVolumeCone);
        OPCOES.add(Main::calcularVolumeEsfera);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            mostrarMenu();
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= OPCOES.size()) {
                OPCOES.get(escolha - 1).run();
            } else if (escolha != OPCOES.size() + 1) {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (escolha != OPCOES.size() + 1);

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
        System.out.println("7.  Área da Circunferência (Círculo)");
        System.out.println("8.  Área e Volume do Prisma");
        System.out.println("9.  Área e Volume do Cilindro");
        System.out.println("10. Área e Volume da Pirâmide");
        System.out.println("11. Área e Volume do Cone");
        System.out.println("12. Volume da Esfera");
        System.out.println("13. Sair");
        System.out.println("=============================================");
        System.out.print("Escolha uma opção: ");
    }

    private static void calcularAreaQuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área do Quadrado");
        System.out.println("=============================================");
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaQuadrado(lado);
        System.out.println("A área do quadrado é: " + area);
    }

    private static void calcularAreaRetangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área do Retângulo");
        System.out.println("=============================================");
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaRetangulo(base, altura);
        System.out.println("A área do retângulo é: " + area);
    }

    private static void calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área do Triângulo");
        System.out.println("=============================================");
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaTriangulo(base, altura);
        System.out.println("A área do triângulo é: " + area);
    }

    private static void calcularAreaParalelogramo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área do Paralelogramo");
        System.out.println("=============================================");
        System.out.print("Digite a base do paralelogramo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do paralelogramo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaParalelogramo(base, altura);
        System.out.println("A área do paralelogramo é: " + area);
    }

    private static void calcularAreaLosango() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área do Losango");
        System.out.println("=============================================");
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaLosango(diagonalMaior, diagonalMenor);
        System.out.println("A área do losango é: " + area);
    }

    private static void calcularAreaTrapezio() {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("A área do trapézio é: " + area);
    }

    private static void calcularAreaCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área da Circunferência (Círculo)");
        System.out.println("=============================================");
        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaCircunferencia(raio);
        System.out.println("A área da circunferência é: " + area);
    }

    private static void calcularAreaEVolumePrisma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Prisma");
        System.out.println("=============================================");
        System.out.print("Digite a área da base do prisma: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura do prisma: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPrisma(areaBase, altura);
        double volume = GeometriaEspacial.calcularVolumePrisma(areaBase, altura);
        System.out.println("A área do prisma é: " + area);
        System.out.println("O volume do prisma é: " + volume);
    }

    private static void calcularAreaEVolumeCilindro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Cilindro");
        System.out.println("=============================================");
        System.out.print("Digite o raio da base do cilindro: ");
        double raioBase = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCilindro(raioBase, altura);
        double volume = GeometriaEspacial.calcularVolumeCilindro(raioBase, altura);
        System.out.println("A área do cilindro é: " + area);
        System.out.println("O volume do cilindro é: " + volume);
    }

    private static void calcularAreaEVolumePiramide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume da Pirâmide");
        System.out.println("=============================================");
        System.out.print("Digite a área da base da pirâmide: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura da pirâmide: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPiramide(areaBase, altura);
        double volume = GeometriaEspacial.calcularVolumePiramide(areaBase, altura);
        System.out.println("A área da pirâmide é: " + area);
        System.out.println("O volume da pirâmide é: " + volume);
    }

    private static void calcularAreaEVolumeCone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Área e Volume do Cone");
        System.out.println("=============================================");
        System.out.print("Digite o raio da base do cone: ");
        double raioBase = scanner.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCone(raioBase, altura);
        double volume = GeometriaEspacial.calcularVolumeCone(raioBase, altura);
        System.out.println("A área do cone é: " + area);
        System.out.println("O volume do cone é: " + volume);
    }

    private static void calcularVolumeEsfera() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("              Volume da Esfera");
        System.out.println("=============================================");
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        double volume = GeometriaEspacial.calcularVolumeEsfera(raio);
        System.out.println("O volume da esfera é: " + volume);
    }
}