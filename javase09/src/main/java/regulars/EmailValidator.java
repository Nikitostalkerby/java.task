package regulars;

import impl.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 27.11.2015.
 */
public class EmailValidator implements Validate {
    private Pattern pattern;

    private static final String ABC_PATTERN = "^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$";
    //^[-\w.]+@([A-z0-9][-A-z0-9]+\.)+[A-z]{2,4}$

    public EmailValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}