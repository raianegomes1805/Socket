import java.io.Serializable;
import javax.swing.text.Position;
import java.util.Random;

public class Menssagem implements Serializable {
	private static final long serialVersionUID = 1L;
    Random randon_number = new Random();

	public String getMenssagem() {
		String menssagem[]={"********SEJA BEM VINDO*******","**********Vai com Deus**************","****************Fica em paz*******************"};
        int index = (int) (Math.random() * menssagem.length);
       	return menssagem[index];
	}
}