public interface Pizza {
    public double getPreco();
    public String getDescricao();
}

public class PizzaBase implements Pizza {
    @Override
    public double getPreco() {
        return 10.0;
    }

    @Override
    public String getDescricao() {
        return "Pizza base";
    }
}

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaDecorada;

    public PizzaDecorator(Pizza pizza) {
        this.pizzaDecorada = pizza;
    }

    @Override
    public double getPreco() {
        return pizzaDecorada.getPreco();
    }

    @Override
    public String getDescricao() {
        return pizzaDecorada.getDescricao();
    }
}

public class QueijoDuplo extends PizzaDecorator {
    public QueijoDuplo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", queijo duplo";
    }
}

public class Pimentao extends PizzaDecorator {
    public Pimentao(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", pimentão";
    }
}
