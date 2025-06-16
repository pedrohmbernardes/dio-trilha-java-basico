import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        /*
         * To-Do
         * 
         * 1- conhecer e importar a classe Scanner
         * 2- exibir as mensagens para o nosso usuário
         * 3- obter pela Scanner os valores digitados no terminal
         * 4- exibir a mensagem da conta criada
         * 
         * Crie o projeto ContaBanco que receberá dados via terminal contendo as
         * características de conta em banco conforme atributos abaixo:
         * - Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a
         * codificação do nosso programa.
         * 
         * Permita que os dados sejam inseridos via terminal sendo que o usuário
         * receberá a mensagem de qual informação será solicitada, exemplo:
         * -Programa: "Por favor, digite o número da Agência !"
         * -Usuário: 1021 (depois ENTER para o próximo campo)
         * 
         * Revise sobre concatenação e classe String com método concat
         * Depois de todas as informações terem sido inseridas, o sistema deverá exibir
         * a seguinte mensagem:
         * 
         * -- mensagem de conta criada (exemplo): "Olá [Nome Cliente], obrigado por
         * criar uma conta em nosso banco, sua
         * agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível
         * para saque".
         * 
         */

        // Inicializando a classe scanner para receber as entradas do usuário.
        /*
         * nextLine(): Lê a linha inteira até o final, incluindo espaços, e retorna como
         * uma String.
         * nextInt(): Lê o próximo token de entrada como um int.
         * nextLong(): Lê o próximo token de entrada como um long.
         * nextDouble(): Lê o próximo token de entrada como um double.
         * nextBoolean(): Lê o próximo token de entrada como um boolean.
         * next(): Lê o próximo token (palavra) da entrada e retorna como uma String.
         * Ele para de ler no primeiro espaço em branco.
         * 
         * Ponto importante sobre nextLine() após nextInt() (ou nextDouble(), etc.):
         * 
         * Como mostrado no exemplo, se você usar nextInt() (ou nextDouble(),
         * nextBoolean(), etc.) e logo em seguida tentar usar nextLine(),
         * haverá um problema. Isso ocorre porque os métodos nextType() (exceto
         * nextLine()) apenas leem o valor que você digitou, mas deixam o caractere de
         * "nova linha" (o "Enter" que você pressiona) no buffer de entrada. Quando você
         * chama nextLine() em seguida, ele lê esse caractere de "nova linha" restante
         * e, consequentemente, pula a entrada real que você esperava.
         * 
         * A solução é chamar scanner.nextLine(); (sem atribuir a nenhuma variável)
         * imediatamente após qualquer método nextType() para "consumir" essa quebra de
         * linha pendente, antes de chamar outro nextLine() para a entrada desejada.
         */

        Scanner scanner = new Scanner(System.in);

        // Definicao das variaveis (mantive o saldo fixado, pois em nenhuma hipotese faz
        // sentido o usuario digitar seu proprio saldo.)
        int NUMERO;
        String AGENCIA, NOME_CLIENT;
        double DEPOSITO;
        double SALDO = 237.48f;

        System.out.println("Por favor, digite o número da Agência (ex: 1021):");
        NUMERO = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora, digite a sua Conta (ex: 067-8): ");
        AGENCIA = scanner.nextLine();
        System.out.println("Confirme qual é o seu nome (ex: Joao Silva): ");
        NOME_CLIENT = scanner.nextLine();

        System.out.println("Deseja depositar algum dinheiro? [1] - Sim | [2] - Não");

        if (scanner.nextInt() == 1) {
            System.out.println("Quanto desejar depositar (ex: 98,75)?");
            DEPOSITO = scanner.nextDouble();
            SALDO = SALDO + DEPOSITO;
            System.out.printf(
                    "Olá, %s, obrigado por manter sua conta ativa em nosso banco, sua agência é %d, sua conta é %s. Você depositou %.2f e seu saldo atual é de R$ %.2f já está disponível para saque.",
                    NOME_CLIENT, NUMERO, AGENCIA, DEPOSITO, SALDO);
        } else {
            System.out.println("Você escolheu não depositar nenhum dinheiro.");
            System.out.printf(
                    "Olá, %s, obrigado por manter sua conta ativa em nosso banco, sua agência é %d, sua conta é %s e seu saldo de R$ %.2f já está disponível para saque.",
                    NOME_CLIENT, NUMERO, AGENCIA, SALDO);
        }
        ;

        scanner.close();
    }
}
