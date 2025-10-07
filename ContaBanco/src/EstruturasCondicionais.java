public class EstruturasCondicionais {
    public static void main(String[] args) {
        // Este é um exemplo de estrutura condicional simples
        String decisao = "SIM"; // Simulação de entrada do usuário
        switch (decisao) {
            case "SIM" -> System.out.println("Você escolheu SIM. Vamos prosseguir com o processo.");
            case "NAO" -> System.out.println("Você escolheu NAO. Obrigado por acessar nosso sistema. Tenha um ótimo dia!");
            default -> System.out.println("Opção inválida. Por favor, escolha SIM ou NAO.");
        }
    }
}
