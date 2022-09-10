import java.io.ObjectInputStream;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost", 8888);
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String menssagem_atual = (String) entrada.readObject();
			System.out.println("Menssagem recebida pelo servidor:" + menssagem_atual);
			entrada.close();
			System.out.println("Conexão encerrada");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}