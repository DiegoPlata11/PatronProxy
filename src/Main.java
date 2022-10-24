import Main.ProxyDescarga;
import Main.Usuario;

public class Main {
    public static void main(String[] args) {

            Usuario premium = new Usuario(45678, "Premium");
            Usuario free = new Usuario(12345, "Free");
            ProxyDescarga proxy = new ProxyDescarga();

            proxy.descargar(premium, "sweet child o mine");
            proxy.descargar(free, "stairway to heaven");
        }

    }

