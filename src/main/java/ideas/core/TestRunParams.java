package ideas.core;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.apache.log4j.Logger;

public class TestRunParams {

    private static final Logger log = Logger.getLogger("");

    private final static String runParametersTag = Constants.RUN_PARAMETERS_FILE_MAIN_TAG;
    private final static String dbConfigTag = Constants.DB_CONFIG_FILE_MAIN_TAG;

    private static Config runParameters = null;
    private static Config dbConfig = null;

    private static final String fixedTimeStamp = Utils.getCurrentDate("MM-dd-HH-mm-ss");

    private static String getFixedTimeStamp() {
        return fixedTimeStamp;
    }

    public static void uploadDefaultRunParameters() {
        log.info("uploading of default run parameters");
        String configFileName = "default_run_parameters";
        runParameters = ConfigFactory.load(configFileName);
    }

    public static void uploadDbConfigValues() {
        log.info("uploading db configs");
        String configFileName = "db_config";
    }
}
