package task03;

/**
 * Created by Union.one on 06.11.2015.
 */
public enum Zodiac {
    Aries, Leo, Sagittarius, Taurus, Virgo, Capricorn, Gemini, Libra, Aquarius, Cancer, Scorpio, Pisces;

    public static Zodiac findZodiac(String str) {
        for (Zodiac zodiac : Zodiac.values()) {
            if (str.equals(zodiac.name())) {
                return zodiac;
            }
        }
        return null;
    }
}
