package regulars;

import impl.Validable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 23.11.2015.
 */
public class MACValidator implements Validable {
    private Pattern pattern;
    private Matcher matcher;

    private static final String ABC_PATTERN = "([0-9a-fA-F]{2}([:-]|$)){6}$|([0-9a-fA-F]{4}([.]|$)){3}";

    public MACValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
