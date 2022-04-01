package co.com.juanmaya.sofka.frameworkreto.helpers;


import java.nio.file.Path;
import java.nio.file.Paths;

public class Dictionary {
    public static final String STATE_BY_DEFAULT_FLORIDA = "Florida";

    public static final String EMPTY_STRING = "";
    public static final String SPACE_STRING= " ";
    public static final String SPANISH_CODE_LANGUAGE = "es";
    public static final String ENGLISH_CODE_LANGUAGE = "es";
    public static final String COL_COUNTRY_CODE = "CO";
    public static final String US_COUNTRY_CODE = "US";
    public static final String EMAIL_DOMAIN = "@sofmail.com";
    public static final String FILE_EVIDENCE_PROPERTY = "files.evidence";
    public static final String APP_URL_PROPERTY = "app.url";
    public static final String USER_DIRECTORY = System.getProperty("user.dir");
    public static final String PROPERTIES_FILE_BASE_PATH = "src/main/resources/properties/";
    public static final String CONFIGURATION_PROPERTIES_FILE = USER_DIRECTORY + "/" +PROPERTIES_FILE_BASE_PATH + "configuration.properties";
    public static final String MAIL_PROPERTIES_FILE = USER_DIRECTORY + PROPERTIES_FILE_BASE_PATH + "mail.properties";
    public static final String UPLOAD_FILE_BASE_PATH = USER_DIRECTORY + "/"+"Reference.txt";
    public static final int STANDARD_TIMEOUT_TWO= 2;
    public static final int STANDARD_TIMEOUT_FIVE= 5;
    public static final int STANDARD_TIMEOUT_TEN= 10;
    public static final Boolean STANDARD_EVIDENCE_SCREENSHOT = true;
    public static final String CONTACT_SUCCESSFULL_MESSAGE = "Your message has been successfully sent to our team.";
    public static final Path STANDARD_UPLOAD_FILE_LOCATION = Paths.get(UPLOAD_FILE_BASE_PATH);

}
