package regulars;

import impl.Validable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 23.11.2015.
 */
public class ColorValidator implements Validable {
    private Pattern pattern;
    private Matcher matcher;

    private static final String ABC_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

    public ColorValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
