import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("============================================");
        System.out.println("  Bem-vindo ao Chatbot da Lanchonete TopBurg!");
        System.out.println("============================================");

        do {
            System.out.println("\nComo posso te ajudar?");
            System.out.println("1 - Ver cardápio");
            System.out.println("2 - Fazer pedido");
            System.out.println("3 - Acompanhar pedido");
            System.out.println("4 - Falar com atendente");
            System.out.println("0 - Encerrar atendimento");
            System.out.print("\nDigite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n============================================");
                    System.out.println("            CARDÁPIO TOPBURG");
                    System.out.println("============================================");
                    System.out.println("  LANCHES");
                    System.out.println("  1. X-Burguer        R$ 18,00");
                    System.out.println("  2. X-Bacon          R$ 22,00");
                    System.out.println("  3. X-Frango         R$ 20,00");
                    System.out.println("\n  BEBIDAS");
                    System.out.println("  4. Refrigerante     R$ 8,00");
                    System.out.println("  5. Suco Natural     R$ 10,00");
                    System.out.println("  6. Água             R$ 4,00");
                    System.out.println("\n  COMBOS");
                    System.out.println("  7. Combo 1 (X-Burguer + Refri + Batata)   R$ 32,00");
                    System.out.println("  8. Combo 2 (X-Bacon + Refri + Batata)     R$ 36,00");
                    System.out.println("============================================");
                    break;

                case 2:
                    System.out.println("\nO que você deseja pedir?");
                    System.out.println("1 - Lanche");
                    System.out.println("2 - Bebida");
                    System.out.println("3 - Combo");
                    System.out.println("0 - Voltar");
                    System.out.print("\nDigite uma opção: ");
                    int categoriaPedido = scanner.nextInt();

                    switch (categoriaPedido) {
                        case 1:
                            System.out.println("\nEscolha seu lanche:");
                            System.out.println("1 - X-Burguer    R$ 18,00");
                            System.out.println("2 - X-Bacon      R$ 22,00");
                            System.out.println("3 - X-Frango     R$ 20,00");
                            System.out.print("\nDigite uma opção: ");
                            int lanche = scanner.nextInt();
                            if (lanche == 1) {
                                System.out.println("\n✔ X-Burguer adicionado ao pedido!");
                            } else if (lanche == 2) {
                                System.out.println("\n✔ X-Bacon adicionado ao pedido!");
                            } else if (lanche == 3) {
                                System.out.println("\n✔ X-Frango adicionado ao pedido!");
                            } else {
                                System.out.println("\nOpção inválida.");
                            }
                            break;
                        case 2:
                            System.out.println("\nEscolha sua bebida:");
                            System.out.println("1 - Refrigerante   R$ 8,00");
                            System.out.println("2 - Suco Natural   R$ 10,00");
                            System.out.println("3 - Água           R$ 4,00");
                            System.out.print("\nDigite uma opção: ");
                            int bebida = scanner.nextInt();
                            if (bebida == 1) {
                                System.out.println("\n✔ Refrigerante adicionado ao pedido!");
                            } else if (bebida == 2) {
                                System.out.println("\n✔ Suco Natural adicionado ao pedido!");
                            } else if (bebida == 3) {
                                System.out.println("\n✔ Água adicionada ao pedido!");
                            } else {
                                System.out.println("\nOpção inválida.");
                            }
                            break;
                        case 3:
                            System.out.println("\nEscolha seu combo:");
                            System.out.println("1 - Combo 1 (X-Burguer + Refri + Batata)   R$ 32,00");
                            System.out.println("2 - Combo 2 (X-Bacon + Refri + Batata)     R$ 36,00");
                            System.out.print("\nDigite uma opção: ");
                            int combo = scanner.nextInt();
                            if (combo == 1) {
                                System.out.println("\n✔ Combo 1 adicionado ao pedido!");
                            } else if (combo == 2) {
                                System.out.println("\n✔ Combo 2 adicionado ao pedido!");
                            } else {
                                System.out.println("\nOpção inválida.");
                            }
                            break;
                        case 0:
                            System.out.println("\nVoltando ao menu principal...");
                            break;
                        default:
                            System.out.println("\nOpção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("\nQual o status que deseja verificar?");
                    System.out.println("1 - Tempo estimado de espera");
                    System.out.println("2 - Situação do pedido");
                    System.out.println("0 - Voltar");
                    System.out.print("\nDigite uma opção: ");
                    int statusOpcao = scanner.nextInt();

                    if (statusOpcao == 1) {
                        System.out.println("\n⏱ Tempo estimado: 15 a 20 minutos.");
                    } else if (statusOpcao == 2) {
                        System.out.println("\n🍳 Seu pedido está sendo preparado na cozinha!");
                    } else if (statusOpcao == 0) {
                        System.out.println("\nVoltando ao menu principal...");
                    } else {
                        System.out.println("\nOpção inválida.");
                    }
                    break;

                case 4:
                    System.out.println("\nPor qual motivo deseja falar com um atendente?");
                    System.out.println("1 - Reclamação");
                    System.out.println("2 - Elogio");
                    System.out.println("3 - Dúvida geral");
                    System.out.println("0 - Voltar");
                    System.out.print("\nDigite uma opção: ");
                    int motivoAtendente = scanner.nextInt();

                    if (motivoAtendente == 1) {
                        System.out.println("\nLamentamos o ocorrido. Um atendente entrará em contato em breve.");
                    } else if (motivoAtendente == 2) {
                        System.out.println("\nQue ótimo! Ficamos felizes em saber. Obrigado pelo feedback! 😊");
                    } else if (motivoAtendente == 3) {
                        System.out.println("\nUm atendente está sendo chamado para te ajudar. Aguarde!");
                    } else if (motivoAtendente == 0) {
                        System.out.println("\nVoltando ao menu principal...");
                    } else {
                        System.out.println("\nOpção inválida.");
                    }
                    break;

                case 0:
                    System.out.println("\nObrigado pela visita! Até logo. 👋");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}