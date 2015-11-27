package regulars;

import impl.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 23.11.2015.
 */
public class DateValidator implements Validate {
    private Pattern pattern;

    private static final String ABC_PATTERN = "(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d";
    //^([012][1-9]|10|20|30|31)/(01|03|05|07|08|10|12)/((1[6-9]|[2-9][0-9])[0-9]{2})|([012][1-9]|10|20|30)/(04|06|09|11)/((1[6-9]|[2-9][0-9])[0-9]{2})|29/02/((1[6-9]|[2-9][0-9])(04|08|[13579][26]|[2468][480])|(16|[2468][048]|[3579][26])00)|(0[1-9]|1[0-9]|2[0-8])/02/((1[6-9]|[2-9][0-9])[0-9]{2})$

    public DateValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}