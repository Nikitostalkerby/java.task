package regulars;

import impl.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 27.11.2015.
 */
public class PassValidator implements Validate {
    private Pattern pattern;

    private static final String ABC_PATTERN = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";

    public PassValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}