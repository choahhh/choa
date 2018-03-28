import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Main {
    private Logger logger;
Main(){
      logger = Logger.getLogger(getClass());

    // Use the default configuration.
    BasicConfigurator.configure();

}
public static void main(String[] args) throws IOException {
    Main main = new Main();
    main.logger.info("多喝水");
    }

}
