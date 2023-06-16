import java.util.Scanner;
import java.util.Arrays;

public class MenuTopicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Tópicos:");
            System.out.println("1. História do Java");
            System.out.println("2. Como funciona o Java");
            System.out.println("3. Comandos de entrada e saída");
            System.out.println("4. Tipos primitivos e manipulação de dados");
            System.out.println("5. Operadores aritméticos e classe Math");
            System.out.println("6. Operadores lógicos");
            System.out.println("7. Operadores relacionais");
            System.out.println("8. Operadores condicionais");
            System.out.println("9. Estruturas de repetição");
            System.out.println("10. Vetores (Arrays)");
            System.out.println("11. Métodos (Funções)");
            System.out.println("0. Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    HistoriaJava.executar();
                    break;
                case 2:
                    ComoFuncionaJava.executar();
                    break;
                case 3:
                    ComandosEntradaSaida.executar();
                    break;
                case 4:
                    TiposPrimitivos.executar();
                    break;
                case 5:
                    OperadoresAritmeticos.executar();
                    break;
                case 6:
                    OperadoresLogicos.executar();
                    break;
                case 7:
                    OperadoresRelacionais.executar();
                    break;
                case 8:
                    OperadoresCondicionais.executar();
                    break;
                case 9:
                    EstruturasRepeticao.executar();
                    break;
                case 10:
                    Vetores.executar();
                    break;
                case 11:
                    Metodos.executar();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
class HistoriaJava {
    public static void executar() {
        System.out.println("\nApresentação sobre a história do Java...\n" +
                "01. Criação: O Java foi criado por James Gosling, Mike Sheridan e Patrick Naughton na década de 1990.\n" +
                "02. Objetivo: A equipe de desenvolvimento do Java buscava criar uma linguagem de programação que fosse portátil, robusta e segura.\n" +
                "03. Influências: O Java foi influenciado por outras linguagens de programação, como C++ e Smalltalk.\n" +
                "04. Primeira versão: A primeira versão do Java, chamada de JDK 1.0, foi lançada em 1996.\n" +
                "05. Portabilidade: Uma das características-chave do Java é sua portabilidade, o que significa que os programas \nJava podem ser executados em diferentes plataformas, como Windows, macOS e Linux.\n" +
                "06. Máquina Virtual Java (JVM): O Java introduziu a JVM, que permite a execução de programas Java independentemente do sistema operacional.\n" +
                "07. Orientação a objetos: O Java é uma linguagem de programação orientada a objetos, o que significa que os programas \nJava são organizados em classes e objetos.\n" +
                "08. Popularidade: O Java se tornou uma das linguagens de programação mais populares do mundo devido à sua ampla adoção na indústria.\n" +
                "09. Aplicações: O Java é usado para desenvolver uma ampla variedade de aplicativos, incluindo aplicativos de desktop, \naplicativos móveis, sistemas embarcados e aplicativos empresariais.\n" +
                "10. Applets: No passado, os applets Java eram populares para a criação de conteúdo interativo na web, mas sua popularidade diminuiu com o tempo.\n" +
                "11. Plataforma Java EE: O Java EE (Java Enterprise Edition) é um conjunto de especificações e APIs para o desenvolvimento \nde aplicativos corporativos.\n" +
                "12. Plataforma Java ME: O Java ME (Java Micro Edition) é uma versão do Java voltada para dispositivos com recursos \nlimitados, como celulares e dispositivos IoT.\n" +
                "13. Plataforma Java SE: O Java SE (Java Standard Edition) é a plataforma principal do Java, que fornece as bibliotecas e \nAPIs essenciais para o desenvolvimento de aplicativos Java.\n" +
                "14. Comunidade: O Java possui uma grande comunidade de desenvolvedores ativos que contribuem para aprimorar a linguagem e \ncriar bibliotecas de terceiros.\n" +
                "15. Suporte multiplataforma: O Java é usado em uma ampla variedade de plataformas, desde servidores corporativos até \ndispositivos móveis e sistemas embarcados.\n" +
                "16. Segurança: O Java possui recursos de segurança integrados, como a execução de código em um ambiente de sandbox e \nverificação automática de tipos.\n" +
                "17. Atualizações: A Oracle, empresa que adquiriu a Sun Microsystems (criadora do Java), continua a lançar atualizações \nregulares do Java para melhorar a segurança e adicionar novos recursos.\n" +
                "18. Performance: O desempenho do Java melhorou significativamente ao longo dos anos, com otimizações contínuas do compilador e da JVM.\n" +
                "19. Ferramentas de desenvolvimento: Existem várias ferramentas populares para o desenvolvimento de aplicativos Java, como o \nIntelliJ IDEA, Eclipse e NetBeans.\n" +
                "20. Integração com outras linguagens: O Java oferece suporte à integração com outras linguagens, como C++ e Python, por \nmeio do uso de JNI (Java Native Interface).\n" +
                "21. Suporte à concorrência: O Java possui recursos embutidos para lidar com programação concorrente e multithreading.\n" +
                "22. Frameworks populares: O Java possui uma ampla variedade de frameworks populares, como Spring, Hibernate e JavaFX, que \nfacilitam o desenvolvimento de aplicativos.\n" +
                "23. Big Data e Apache Hadoop: O Java é amplamente usado no processamento de big data e é a linguagem principal do framework Apache Hadoop.\n" +
                "24. Internet das Coisas (IoT): O Java é usado em dispositivos IoT devido à sua portabilidade e recursos de segurança.\n" +
                "25. Linguagem oficial do Android: O Android, o sistema operacional móvel mais popular, usa o Java como sua linguagem de programação oficial.\n" +
                "26. Versões recentes: O Java continuou a evoluir e receber atualizações significativas, com as versões mais recentes \nincluindo Java 8, Java 9, Java 10, Java 11, Java 12, Java 13, Java 14, Java 15, Java 16, Java 17.\n" +
                "27. Compatibilidade: Embora o Java tenha passado por mudanças e melhorias ao longo dos anos, ele manteve a compatibilidade \ncom versões anteriores, permitindo que aplicativos legados continuem funcionando sem problemas.\n" +
                "28. Contribuições para a comunidade de código aberto: A Oracle e a comunidade Java contribuem ativamente para projetos \nde código aberto, como o OpenJDK.\n" +
                "29. Certificação Java: A Oracle oferece programas de certificação Java para desenvolvedores que desejam comprovar suas habilidades na linguagem.\n" +
                "30. Futuro: O Java continua sendo uma linguagem de programação amplamente utilizada e continuará a desempenhar um papel \nimportante no desenvolvimento de aplicativos empresariais, sistemas distribuídos e tecnologias emergentes, \ncomo inteligência artificial e aprendizado de máquina.\n");
    }
}

// Classe para o tópico "Como funciona o Java"
class ComoFuncionaJava {
    public static void executar() {
        System.out.println("\nApresentação sobre como funciona o Java...");

        System.out.println("01. O Java é uma linguagem de programação de alto nível e orientada a objetos.");
        System.out.println("02. Ele segue o paradigma de 'write once, run anywhere' (escreva uma vez, execute em qualquer lugar), o \nque significa que um programa Java pode ser executado em diferentes plataformas sem a necessidade de recompilação.");
        System.out.println("03. Isso é possível devido ao uso da Máquina Virtual Java (JVM), que interpreta e executa o código Java nem um ambiente virtual.");
        System.out.println("04. A JVM é responsável por garantir a portabilidade do Java, permitindo que os programas sejam executados \nem diferentes sistemas operacionais, como Windows, macOS e Linux.");
        System.out.println("05. Para desenvolver aplicativos em Java, você pode usar um ambiente de desenvolvimento integrado (IDE), como \no Eclipse, IntelliJ IDEA ou NetBeans.");
        System.out.println("06. Essas IDEs fornecem ferramentas e recursos para facilitar o desenvolvimento, como edição de código, depuração, \ngerenciamento de dependências e criação de interfaces gráficas.");
        System.out.println("07. Ao escrever um programa Java, você deve definir uma ou mais classes que contêm métodos e variáveis.");
        System.out.println("08. As classes são as unidades básicas de organização no Java e seguem o conceito de orientação a objetos.");
        System.out.println("09. Você pode criar objetos a partir das classes e interagir com eles por meio de métodos e variáveis.");
        System.out.println("10. O Java possui uma vasta biblioteca padrão (Java Standard Library) que fornece uma ampla gama de funcionalidades prontas para uso.");
        System.out.println("11. Essa biblioteca inclui pacotes e classes para lidar com entrada e saída, manipulação de arquivos, processamento \nde strings, networking, entre outros recursos.");
        System.out.println("12. Além da biblioteca padrão, o Java também suporta o uso de bibliotecas de terceiros e frameworks.");
        System.out.println("13. Essas bibliotecas podem ser adicionadas ao seu projeto para estender suas funcionalidades e facilitar tarefas \nespecíficas, como acesso a banco de dados, desenvolvimento web, interface gráfica, entre outros.");
        System.out.println("14. Para executar um programa Java, você precisa compilar o código-fonte (.java) em bytecode Java (.class) usando o compilador javac.");
        System.out.println("15. Em seguida, você pode executar o programa chamando a classe principal (que contém o método main) usando o comando java.");
        System.out.println("16. Essas são apenas algumas informações básicas sobre como o Java funciona e como você pode usá-lo.");
        System.out.println("17. À medida que você aprofunda seus estudos e prática em Java, você descobrirá mais recursos avançados e técnicas de programação.\n");
    }
}


// Classe para o tópico "Comandos de entrada e saída"
class ComandosEntradaSaida {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exemploSaida();
                    break;
                case 2:
                    exemploSaidaFormatada();
                    break;
                case 3:
                    exemploEntrada();
                    break;
                case 4:
                    exemploEntradaNumerica();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("MENU");
        System.out.println("1. Exemplo de comando de saída");
        System.out.println("2. Exemplo de comando de saída com formatação");
        System.out.println("3. Exemplo de comando de entrada");
        System.out.println("4. Exemplo de comando de entrada numérica");
        System.out.println("0. Sair");
    }

    private static void exemploSaida() {
        System.out.println("Exemplo de comando de saída:");
        System.out.println("Olá, mundo!");
        System.out.println("Como fazer: System.out.println(\"Olá, mundo!\");");
    }

    private static void exemploSaidaFormatada() {
        System.out.println("Exemplo de comando de saída com formatação:");
        String nome = "João";
        int idade = 25;
        System.out.printf("Nome: %s, Idade: %d%n", nome, idade);
        System.out.println("Como fazer:");
        System.out.println("String nome = \"João\";");
        System.out.println("int idade = 25;");
        System.out.println("System.out.printf(\"Nome: %s, Idade: %d%n\", nome, idade);");
    }

    private static void exemploEntrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exemplo de comando de entrada:");
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Olá, " + nomeUsuario + "!");
        System.out.println("Como fazer:");
        System.out.println("Scanner scanner = new Scanner(System.in);");
        System.out.println("System.out.print(\"Digite seu nome: \");");
        System.out.println("String nomeUsuario = scanner.nextLine();");
        System.out.println("System.out.println(\"Olá, \" + nomeUsuario + \"!\");");
    }

    private static void exemploEntradaNumerica() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exemplo de comando de entrada numérica:");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("O número digitado foi: " + numero);
        System.out.println("Como fazer:");
        System.out.println("Scanner scanner = new Scanner(System.in);");
        System.out.println("System.out.print(\"Digite um número inteiro: \");");
        System.out.println("int numero = scanner.nextInt();");
        System.out.println("System.out.println(\"O número digitado foi: \" + numero);");
    }
}


// Classe para o tópico Tipos primitivos e manipulação de dados"
class TiposPrimitivos {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exemploManipulacaoDados();
                    break;
                case 2:
                    exemploOperacoesValores();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\nMenu Tipos primitivos");
        System.out.println("1. Exemplo de manipulação de dados com tipos primitivos");
        System.out.println("2. Realizando operações com os valores");
        System.out.println("0. Sair");
    }

    public static void exemploManipulacaoDados() {
        System.out.println("\n1. Exemplo de manipulação de dados com tipos primitivos\n");

        // Exemplo de manipulação de dados com tipos primitivos
        int idade = 25;
        double altura = 1.75;
        char sexo = 'M';
        boolean estudante = true;

        // Exibindo os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estudante: " + estudante);
        System.out.println("\nComo fazer...");
        System.out.println("int idade = 25;");
        System.out.println("double altura = 1.75;");
        System.out.println("char sexo = 'M';");
        System.out.println("boolean estudante = true;");
        System.out.println("System.out.println(\"Idade: \" + idade);");
        System.out.println("System.out.println(\"Altura: \" + altura);");
        System.out.println("System.out.println(\"Sexo: \" + sexo);");
        System.out.println("System.out.println(\"Estudante: \" + estudante);\n");
    }

    public static void exemploOperacoesValores() {
        System.out.println("\n2. Realizando operações com os valores\n");

        // Exemplo de operações com os valores
        int idade = 25;
        double altura = 1.75;
        char sexo = 'M';
        boolean estudante = true;

        // Realizando operações com os valores
        int novaIdade = idade + 5;
        double novaAltura = altura - 0.1;
        char novoSexo = 'F';
        boolean novoEstudante = !estudante;

        // Exibindo os novos valores
        System.out.println("Nova idade: " + novaIdade);
        System.out.println("Nova altura: " + novaAltura);
        System.out.println("Novo sexo: " + novoSexo);
        System.out.println("Novo estudante: " + novoEstudante);
        System.out.println("int idade = 25;");
        System.out.println("double altura = 1.75;");
        System.out.println("char sexo = 'M';");
        System.out.println("boolean estudante = true;");

        System.out.println("Como fazer...");
        System.out.println("int novaIdade = idade + 5;");
        System.out.println("double novaAltura = altura - 0.1;");
        System.out.println("char novoSexo = 'F';");
        System.out.println("boolean novoEstudante = !estudante;");
        System.out.println("System.out.println(\"Nova idade: \" + novaIdade);");
        System.out.println("System.out.println(\"Nova altura: \" + novaAltura);");
        System.out.println("System.out.println(\"Novo sexo: \" + novoSexo);");
        System.out.println("System.out.println(\"Novo estudante: \" + novoEstudante);\n");

    }
}
// Executando a classe TiposPrimitivos

class Main {
    public static void main(String[] args) {
        TiposPrimitivos.executar();
    }
}

// Classe para o tópico Operadores aritméticos e classe Math
class OperadoresAritmeticos {
    public static void executar() {
        System.out.println("Apresentação sobre Operadores aritméticos e classe Math em Java...\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.println("\nValores digitados: a = " + a + ", b = " + b + "\n");

        boolean executarMenu = true;

        while (executarMenu) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarSoma(a, b);
                    break;
                case 2:
                    realizarSubtracao(a, b);
                    break;
                case 3:
                    realizarMultiplicacao(a, b);
                    break;
                case 4:
                    realizarDivisao(a, b);
                    break;
                case 5:
                    realizarRestoDivisao(a, b);
                    break;
                case 6:
                    realizarOperacoesMath(a, b);
                    break;
                case 7:
                    System.out.println("\nValores digitados: a = " + a + ", b = " + b + "\n");
                    break;
                case 8:
                    executarMenu = false;
                    break;
                    default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        System.out.println("Programa encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Somar a + b");
        System.out.println("2. Subtrair b - a");
        System.out.println("3. Multiplicar a * b");
        System.out.println("4. Dividir a / b");
        System.out.println("5. Calcular o resto da divisão de a / b");
        System.out.println("6. Realizar operações da classe Math");
        System.out.println("7. Mostrar os valores a e b");
        System.out.println("8. Sair...\n");
        System.out.print("Opção: ");
    }

    private static void realizarSoma(int a, int b) {
        int soma = a + b;
        System.out.println("Resultado da soma: " + soma + "\n");
    }

    private static void realizarSubtracao(int a, int b) {
        int subtracao = a - b;
        System.out.println("Resultado da subtração: " + subtracao + "\n");
    }

    private static void realizarMultiplicacao(int a, int b) {
        int multiplicacao = a * b;
        System.out.println("Resultado da multiplicação: " + multiplicacao + "\n");
    }

    private static void realizarDivisao(int a, int b) {
        if (b != 0) {
            double divisao = (double) a / b;
            System.out.println("Resultado da divisão: " + divisao + "\n");
        } else {
            System.out.println("Erro: divisão por zero!\n");
        }
    }

    private static void realizarRestoDivisao(int a, int b) {
        int resto = a % b;
        System.out.println("Resto da divisão: " + resto + "\n");
    }

    private static void realizarOperacoesMath(int a, int b) {
        double valorAbsolutoA = Math.abs(a);
        double valorAbsolutoB = Math.abs(b);
        double potenciaA = Math.pow(a, b);
        double raizQuadradaA = Math.sqrt(a);
        double raizQuadradaB = Math.sqrt(b);
        double valorMaximo = Math.max(a, b);
        double valorMinimo = Math.min(a, b);

        System.out.println("Resultado das operações da classe Math:");
        System.out.println("Valor absoluto de a: " + valorAbsolutoA);
        System.out.println("Valor absoluto de b: " + valorAbsolutoB);
        System.out.println("a elevado a b = (a)^b: " + potenciaA);
        System.out.println("Raiz quadrada de a: " + raizQuadradaA);
        System.out.println("Raiz quadrada de b: " + raizQuadradaB);
        System.out.println("Maior valor entre a e b: " + valorMaximo);
        System.out.println("Menor valor entre a e b: " + valorMinimo + "\n");
    }
}


// Classe para o tópico Operadores Logicos"
class OperadoresLogicos {
    public static void executar() {
        System.out.println("Apresentação sobre Operadores lógicos em Java...");
    }
}


// Classe para o tópico Operadores Relacionais
class OperadoresRelacionais {
    public static void executar() {
        System.out.println("Apresentação sobre Operadores Relacionais em Java...\n");
        System.out.println("Nessa classe, há a demonstração dos operadores relacionais em Java. Os operadores relacionais são \nutilizados para comparar valores e expressões e retornam um resultado booleano (verdadeiro ou falso) com base na comparação.\n");
        System.out.println("Os operadores relacionais incluídos nesta classe são:\n");
        System.out.println("Operador de igualdade (==): verifica se dois valores são iguais.");
        System.out.println("Operador de desigualdade (!=): verifica se dois valores são diferentes.");
        System.out.println("Operador maior que (>): verifica se o valor à esquerda é maior do que o valor à direita.");
        System.out.println("Operador menor que (<): verifica se o valor à esquerda é menor do que o valor à direita.");
        System.out.println("Operador maior ou igual que (>=): verifica se o valor à esquerda é maior ou igual ao valor à direita.");
        System.out.println("Operador menor ou igual que (<=): verifica se o valor à esquerda é menor ou igual ao valor à direita.");
        System.out.println("Cada operador é utilizado em uma expressão e retorna um valor booleano correspondente ao resultado da comparação. \nOs exemplos fornecidos na classe demonstram o uso desses operadores e mostram os resultados obtidos ao \ncomparar os valores atribuídos às variáveis a e b.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.println("\nValores digitados: a = " + a + ", b = " + b + "\n");

        boolean executarMenu = true;

        while (executarMenu) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    operadorIgualdade(a, b);
                    break;
                case 2:
                    operadorDesigualdade(a, b);
                    break;
                case 3:
                    operadorMaiorQue(a, b);
                    break;
                case 4:
                    operadorMenorQue(a, b);
                    break;
                case 5:
                    operadorMaiorOuIgualQue(a, b);
                    break;
                case 6:
                    operadorMenorOuIgualQue(a, b);
                    break;
                case 7:
                    executarMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.\n");
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("Menu Operadores Relacionais");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Operador de igualdade (==)");
        System.out.println("2. Operador de desigualdade (!=)");
        System.out.println("3. Operador maior que (>)");
        System.out.println("4. Operador menor que (<)");
        System.out.println("5. Operador maior ou igual que (>=)");
        System.out.println("6. Operador menor ou igual que (<=)");
        System.out.println("7. Sair");
        System.out.print("Opção: ");
    }

    public static void operadorIgualdade(int a, int b) {
        System.out.println("Operador de igualdade (==):");
        System.out.println("a == b: " + (a == b));
        System.out.println("a == 5: " + (a == 5));
        System.out.println();
    }

    public static void operadorDesigualdade(int a, int b) {
        System.out.println("Operador de desigualdade (!=):");
        System.out.println("a != b: " + (a != b));
        System.out.println("a != 5: " + (a != 5));
        System.out.println();
    }

    public static void operadorMaiorQue(int a, int b) {
        System.out.println("Operador maior que (>):");
        System.out.println("a > b: " + (a > b));
        System.out.println("b > a: " + (b > a));
        System.out.println();
    }

    public static void operadorMenorQue(int a, int b) {
        System.out.println("Operador menor que (<):");
        System.out.println("a < b: " + (a < b));
        System.out.println("b < a: " + (b < a));
        System.out.println();
    }

    public static void operadorMaiorOuIgualQue(int a, int b) {
        System.out.println("Operador maior ou igual que (>=):");
        System.out.println("a >= b: " + (a >= b));
        System.out.println("b >= a: " + (b >= a));
        System.out.println();
    }

    public static void operadorMenorOuIgualQue(int a, int b) {
        System.out.println("Operador menor ou igual que (<=):");
        System.out.println("a <= b: " + (a <= b));
        System.out.println("b <= a: " + (b <= a));
        System.out.println();
    }
}


// Classe para o tópico Operadores Condicionais
class OperadoresCondicionais {
    public static void executar() {
        System.out.println("Apresentação sobre Operadores Condicionais em Java...\n");

        Scanner scanner = new Scanner(System.in);

        boolean executarMenu = true;

        while (executarMenu) {
            exibirMenu();

            int opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    exemploOperadorIf();
                    break;
                case 2:
                    exemploOperadorIfElse();
                    break;
                case 3:
                    exemploOperadorIfElseIf();
                    break;
                case 4:
                    exemploOperadorSwitch();
                    break;
                case 0:
                    executarMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Exemplo de uso do operador if");
        System.out.println("2. Exemplo de uso do operador if-else");
        System.out.println("3. Exemplo de uso do operador if-else if-else");
        System.out.println("4. Exemplo de uso do operador switch");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    private static void exemploOperadorIf() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.\n");
        } else {
            System.out.println("Você é menor de idade.\n");
        }
        System.out.println("System.out.print(\"Digite a sua idade: \");\n" +
                "int idade = scanner.nextInt();\n" +
                "\n" +
                "if (idade >= 18) {\n" +
                "    System.out.println(\"Você é maior de idade.\\n\");\n" +
                "} else {\n" +
                "    System.out.println(\"Você é menor de idade.\\n\");\n" +
                "}");

    }

    private static void exemploOperadorIfElse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.\n");
        } else {
            System.out.println("O número é ímpar.\n");
        }
    }

    private static void exemploOperadorIfElseIf() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        int nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("Conceito A\n");
        } else if (nota >= 80) {
            System.out.println("Conceito B\n");
        } else if (nota >= 70) {
            System.out.println("Conceito C\n");
        } else {
            System.out.println("Conceito D\n");
        }
        System.out.println("if (nota >= 90) {\n" +
                "    System.out.println(\"Conceito A\\n\");\n" +
                "} else if (nota >= 80) {\n" +
                "    System.out.println(\"Conceito B\\n\");\n" +
                "} else if (nota >= 70) {\n" +
                "    System.out.println(\"Conceito C\\n\");\n" +
                "} else {\n" +
                "    System.out.println(\"Conceito D\\n\");\n" +
                "}");

    }

    private static void exemploOperadorSwitch() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        int num1 = 10;
        int num2 = 5;
        int resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("A soma é: " + resultado + "\n");
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("A subtração é: " + resultado + "\n");
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("A multiplicação é: " + resultado + "\n");
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("A divisão é: " + resultado + "\n");
                break;
            default:
                System.out.println("Operação inválida.\n");
                break;
        }
        System.out.println("char operacao = scanner.next().charAt(0);\n" +
                "int num1 = 10;\n" +
                "int num2 = 5;\n" +
                "int resultado;\n" +
                "\n" +
                "switch (operacao) {\n" +
                "    case '+':\n" +
                "        resultado = num1 + num2;\n" +
                "        System.out.println(\"A soma é: \" + resultado + \"\\n\");\n" +
                "        break;\n" +
                "    case '-':\n" +
                "        resultado = num1 - num2;\n" +
                "        System.out.println(\"A subtração é: \" + resultado + \"\\n\");\n" +
                "        break;\n" +
                "    case '*':\n" +
                "        resultado = num1 * num2;\n" +
                "        System.out.println(\"A multiplicação é: \" + resultado + \"\\n\");\n" +
                "        break;\n" +
                "    case '/':\n" +
                "        resultado = num1 / num2;\n" +
                "        System.out.println(\"A divisão é: \" + resultado + \"\\n\");\n" +
                "        break;\n" +
                "    default:\n" +
                "        System.out.println(\"Operação inválida.\\n\");\n" +
                "        break;\n" +
                "}");

    }
}

// Classe para o tópico Estruturas de Repetição"
class EstruturasRepeticao {
    public static void executar() {
        System.out.println("Apresentação sobre Estruturas de Repetição em Java...\n");

        Scanner scanner = new Scanner(System.in);
        boolean executarMenu = true;

        while (executarMenu) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exemploForLoop();
                    break;
                case 2:
                    exemploWhileLoop();
                    break;
                case 3:
                    exemploDoWhileLoop();
                    break;
                case 0:
                    executarMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.\n");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Exemplo de for loop");
        System.out.println("2. Exemplo de while loop");
        System.out.println("3. Exemplo de do-while loop");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    private static void exemploForLoop() {
        System.out.println("\nExemplo de for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }
        System.out.println();
        System.out.println("Exemplo de for loop:");
        System.out.println("for (int i = 1; i <= 5; i++) {");
        System.out.println("    System.out.println(\"Contagem: \" + i);");
        System.out.println("}\n");
    }

    private static void exemploWhileLoop() {
        System.out.println("\nExemplo de while loop:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }
        System.out.println();
        System.out.println("Exemplo de while loop:");
        System.out.println("int contador = 1;");
        System.out.println("while (contador <= 5) {");
        System.out.println("    System.out.println(\"Contagem: \" + contador);");
        System.out.println("    contador++;");
        System.out.println("}\n");

    }

    private static void exemploDoWhileLoop() {
        System.out.println("\nExemplo de do-while loop:");
        int numero = 1;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
        System.out.println();
        System.out.println("Exemplo de do-while loop:");
        System.out.println("int numero = 1;");
        System.out.println("do {");
        System.out.println("    System.out.println(\"Número: \" + numero);");
        System.out.println("    numero++;");
        System.out.println("} while (numero <= 5);");
        System.out.println();
    }
}

// Classe para o tópico Vetores"

class Vetores {
    public static void executar() {
        System.out.println("Apresentação sobre vetores em Java...\n");

        Scanner scanner = new Scanner(System.in);
        boolean executarMenu = true;

        while (executarMenu) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exemploVetorNumeros();
                    break;
                case 2:
                    exemploVetorNomes();
                    break;
                case 3:
                    exemploMatriz();
                    break;
                case 4:
                    executarMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Exemplo de vetor de números");
        System.out.println("2. Exemplo de vetor de nomes");
        System.out.println("3. Exemplo de matriz");
        System.out.println("4. Sair\n");
        System.out.print("Opção: ");
    }

    private static void exemploVetorNumeros() {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Vetor de números: " + Arrays.toString(numeros));
    }

    private static void exemploVetorNomes() {
        String[] nomes = {"Alice", "Bob", "Carlos"};
        System.out.println("Vetor de nomes: " + Arrays.toString(nomes));
    }

    private static void exemploMatriz() {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] nomes = {"Alice", "Bob", "Carlos"};

        String[][] matriz = {nomes, Arrays.toString(numeros).split(", ")};

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class Metodos {
    public static void executar() {
        System.out.println("Apresentação sobre Métodos em Java...\n");

        Scanner scanner = new Scanner(System.in);
        boolean executarMenu = true;

        while (executarMenu) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exemploMetodoVoid();
                    break;
                case 2:
                    exemploMetodoRetorno();
                    break;
                case 3:
                    exemploMetodoComParametro();
                    break;
                case 4:
                    exemploMetodoSobrecarga();
                    break;
                case 5:
                    executarMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Exemplo de método void");
        System.out.println("2. Exemplo de método com retorno");
        System.out.println("3. Exemplo de método com parâmetro");
        System.out.println("4. Exemplo de método com sobrecarga");
        System.out.println("5. Sair\n");
        System.out.print("Opção: ");
    }

    private static void exemploMetodoVoid() {
        System.out.println("Exemplo de método void");
        System.out.println("Esse método não retorna valor.");
        System.out.println("Apenas executa uma sequência de comandos.\n");
    }

    private static int exemploMetodoRetorno() {
        System.out.println("Exemplo de método com retorno");
        System.out.println("Esse método retorna um valor inteiro.");
        System.out.print("Digite um número: ");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int res = numero * 2;
        System.out.println("O retorno do método é: " + res);
        return res;

    }

    private static void exemploMetodoComParametro() {
        System.out.println("Exemplo de método com parâmetro");
        System.out.println("Esse método recebe um número inteiro como parâmetro e o exibe.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        exibirNumero(numero);
    }

    private static void exibirNumero(int numero) {
        System.out.println("O número digitado foi: " + numero + "\n");
    }

    private static void exemploMetodoSobrecarga() {
        System.out.println("Exemplo de método com sobrecarga");
        System.out.println("Esse método pode ser chamado com diferentes tipos e quantidades de parâmetros.\n");

        System.out.println("Chamada do método com um parâmetro:");
        exibirMensagem("Olá!");

        System.out.println("Chamada do método com dois parâmetros:");
        exibirMensagem("Olá", "Mundo!");

        System.out.println("Chamada do método sem parâmetros:");
        exibirMensagem();
    }

    private static void exibirMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

    private static void exibirMensagem(String mensagem1, String mensagem2) {
        System.out.println("Mensagem 1: " + mensagem1);
        System.out.println("Mensagem 2: " + mensagem2);
    }

    private static void exibirMensagem() {
        System.out.println("Nenhuma mensagem fornecida.");
    }
}

