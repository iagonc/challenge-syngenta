package SecretMessage;

import java.io.IOException;

public interface Strategy {
    String doOperation(String fileName) throws IOException;
}
