public interface Comando {
    void executar();
}

public class ComandoPizzaQueijoDuplo implements Comando {
    @Override
    public void executar() {
        Pizza pizza = new QueijoDuplo(new PizzaBase());
        System.out.println(pizza.getDescricao() + " custa " + pizza.getPreco());
    }
}

public class ComandoPizzaPimentao implements Comando {
    @Override
    public void executar() {
        Pizza pizza = new Pimentao(new PizzaBase());
        System.out.println(pizza.getDescricao() + " custa " + pizza.getPreco());
    }
}

public class Menu {
    private Map<String, Comando> comandos = new HashMap<>();

    public void adicionarComando(String nome, Comando comando) {
        comandos.put(nome, comando);
    }

    public void executarComando(String nome) {
        if (comandos.containsKey(nome)) {
            comandos.get(nome).executar();
        }
    }
}
