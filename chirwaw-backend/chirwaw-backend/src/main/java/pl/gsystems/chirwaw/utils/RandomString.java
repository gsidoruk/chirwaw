package pl.gsystems.chirwaw.utils;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomString {

    /**
     * Generate a random string.
     */
    public String nextString() {
        for (int idx = 0; idx < buf.length; ++idx)
            buf[idx] = symbols[random.nextInt(symbols.length)];
        return new String(buf);
    }

    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String lower = upper.toLowerCase(Locale.ROOT);

    public static final String digits = "0123456789";

    public final String alphanum = upper + lower + digits;

    private final Random random;

    private char[] symbols;

    private final char[] buf;

    private boolean onlyDigits;

    public RandomString(int length, Random random, boolean onlyDigits) {
        if(onlyDigits) {
            symbols = digits.toCharArray();
        } else {
            symbols = (upper + lower + digits).toCharArray();
        }

        if (length < 1) throw new IllegalArgumentException();
        this.random = Objects.requireNonNull(random);
        this.buf = new char[length];
    }

    /**
     * Create an alphanumeric string generator.
     */
    public RandomString(int length, Random random) {
        this(length, random, false);
    }


    /**
     * Create an alphanumeric strings from a secure generator.
     */
    public RandomString(int length) {
        this(length, new SecureRandom());
    }

    public RandomString(int length, boolean onlyDigits) {
        this(length, new SecureRandom(), onlyDigits);
    }

    /**
     * Create session identifiers.
     */
    public RandomString() {
        this(21);
    }

}