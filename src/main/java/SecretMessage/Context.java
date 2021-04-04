package SecretMessage;

import java.io.IOException;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String fileName) throws IOException {
        return strategy.doOperation(fileName);
    }
}
