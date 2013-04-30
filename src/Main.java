import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	private final static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String a[]) throws SecurityException, IOException {
		Handler handler = new FileHandler("logger.log");
		handler.setFormatter(new MyFormatter());
		logger.addHandler(handler);
		logger.setLevel(Level.INFO);

		logger.info("This message should be logged in file");

	}

}
