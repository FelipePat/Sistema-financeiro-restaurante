public class ControleDeCaixa {

    // Calcula o preço de venda com base no custo e margem de lucro (%)
    public static double calcularPrecoVenda(double precoCusto, double margemLucro) {
        return precoCusto + (precoCusto * margemLucro / 100);
    }

    // Calcula o faturamento total
    public static double calcularFaturamento(double precoVenda, int quantidadeVendida) {
        return precoVenda * quantidadeVendida;
    }

    // Calcula o custo total
    public static double calcularCustoTotal(double precoCusto, int quantidadeVendida) {
        return precoCusto * quantidadeVendida;
    }

    // Calcula o lucro líquido
    public static double calcularLucroLiquido(double faturamento, double custoTotal) {
        return faturamento - custoTotal;
    }
}
