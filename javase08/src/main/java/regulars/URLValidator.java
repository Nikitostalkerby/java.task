package regulars;

import impl.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 23.11.2015.
 */
public class URLValidator implements Validate {
    private Pattern pattern;

    private static final String ABC_PATTERN = "^(https?://)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([/\\w \\.-]*)*/?$";

    public URLValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}