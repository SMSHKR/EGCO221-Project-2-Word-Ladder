

import java.util.*;
import java.util.regex.Pattern;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.Socket;
// import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
public class kidscript {
}
 final class StdOut {

    // force Unicode UTF-8 encoding; otherwise it's system dependent
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with StdIn
    private static final Locale LOCALE = Locale.US;

    // send output here
    private static PrintWriter out;

    // this is called before invoking any methods
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        }
        catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }

    // don't instantiate
    private StdOut() { }

    /**
     * Closes standard output.
     * @deprecated Calling close() permanently disables standard output;
     *             subsequent calls to StdOut.println() or System.out.println()
     *             will no longer produce output on standard output.
     */
    @Deprecated
    public static void close() {
        out.close();
    }

    /**
     * Terminates the current line by printing the line-separator string.
     */
    public static void println() {
        out.println();
    }

    /**
     * Prints an object to this output stream and then terminates the line.
     *
     * @param x the object to print
     */
    public static void println(Object x) {
        out.println(x);
    }

    /**
     * Prints a boolean to standard output and then terminates the line.
     *
     * @param x the boolean to print
     */
    public static void println(boolean x) {
        out.println(x);
    }

    /**
     * Prints a character to standard output and then terminates the line.
     *
     * @param x the character to print
     */
    public static void println(char x) {
        out.println(x);
    }

    /**
     * Prints a double to standard output and then terminates the line.
     *
     * @param x the double to print
     */
    public static void println(double x) {
        out.println(x);
    }

    /**
     * Prints an integer to standard output and then terminates the line.
     *
     * @param x the integer to print
     */
    public static void println(float x) {
        out.println(x);
    }

    /**
     * Prints an integer to standard output and then terminates the line.
     *
     * @param x the integer to print
     */
    public static void println(int x) {
        out.println(x);
    }

    /**
     * Prints a long to standard output and then terminates the line.
     *
     * @param x the long to print
     */
    public static void println(long x) {
        out.println(x);
    }

    /**
     * Prints a short integer to standard output and then terminates the line.
     *
     * @param x the short to print
     */
    public static void println(short x) {
        out.println(x);
    }

    /**
     * Prints a byte to standard output and then terminates the line.
     * <p>
     * To write binary data, see .
     *
     * @param x the byte to print
     */
    public static void println(byte x) {
        out.println(x);
    }

    /**
     * Flushes standard output.
     */
    public static void print() {
        out.flush();
    }

    /**
     * Prints an object to standard output and flushes standard output.
     *
     * @param x the object to print
     */
    public static void print(Object x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a boolean to standard output and flushes standard output.
     *
     * @param x the boolean to print
     */
    public static void print(boolean x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a character to standard output and flushes standard output.
     *
     * @param x the character to print
     */
    public static void print(char x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a double to standard output and flushes standard output.
     *
     * @param x the double to print
     */
    public static void print(double x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a float to standard output and flushes standard output.
     *
     * @param x the float to print
     */
    public static void print(float x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints an integer to standard output and flushes standard output.
     *
     * @param x the integer to print
     */
    public static void print(int x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a long integer to standard output and flushes standard output.
     *
     * @param x the long integer to print
     */
    public static void print(long x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a short integer to standard output and flushes standard output.
     *
     * @param x the short integer to print
     */
    public static void print(short x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a byte to standard output and flushes standard output.
     *
     * @param x the byte to print
     */
    public static void print(byte x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints a formatted string to standard output, using the specified format
     * string and arguments, and then flushes standard output.
     *
     *
     * @param format the <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax">format string</a>
     * @param args   the arguments accompanying the format string
     */
    public static void printf(String format, Object... args) {
        out.printf(LOCALE, format, args);
        out.flush();
    }

    /**
     * Prints a formatted string to standard output, using the locale and
     * the specified format string and arguments; then flushes standard output.
     *
     * @param locale the locale
     * @param format the <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax">format string</a>
     * @param args   the arguments accompanying the format string
     */
    public static void printf(Locale locale, String format, Object... args) {
        out.printf(locale, format, args);
        out.flush();
    }

    /**
     * Unit tests some of the methods in {@code StdOut}.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // write to stdout
        StdOut.println("Test");
        StdOut.println(17);
        StdOut.println(true);
        StdOut.printf("%.6f\n", 1.0/7.0);
    }

}
 final class StdIn {

    /*** begin: section (1 of 2) of code duplicated from In to StdIn. */

    // assume Unicode UTF-8 encoding
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with System.out.
    private static final Locale LOCALE = Locale.US;

    // the default token separator; we maintain the invariant that this value
    // is held by the scanner's delimiter between calls
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

    // makes whitespace significant
    private static final Pattern EMPTY_PATTERN = Pattern.compile("");

    // used to read the entire input
    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

    /*** end: section (1 of 2) of code duplicated from In to StdIn. */

    private static Scanner scanner;

    // it doesn't make sense to instantiate this class
    private StdIn() { }

    //// begin: section (2 of 2) of code duplicated from In to StdIn,
    //// with all methods changed from "public" to "public static"

    /**
     * Returns true if standard input is empty (except possibly for whitespace).
     * Use this method to know whether the next call to {@link #readString()},
     * {@link #readDouble()}, etc will succeed.
     *
     * @return {@code true} if standard input is empty (except possibly
     *         for whitespace); {@code false} otherwise
     */
    public static boolean isEmpty() {
        return !scanner.hasNext();
    }

    /**
     * Returns true if standard input has a next line.
     * Use this method to know whether the
     * next call to {@link #readLine()} will succeed.
     * This method is functionally equivalent to {@link #hasNextChar()}.
     *
     * @return {@code true} if standard input has more input (including whitespace);
     *         {@code false} otherwise
     */
    public static boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    /**
     * Returns true if standard input has more input (including whitespace).
     * Use this method to know whether the next call to {@link #readChar()} will succeed.
     * This method is functionally equivalent to {@link #hasNextLine()}.
     *
     * @return {@code true} if standard input has more input (including whitespace);
     *         {@code false} otherwise
     */
    public static boolean hasNextChar() {
        scanner.useDelimiter(EMPTY_PATTERN);
        boolean result = scanner.hasNext();
        scanner.useDelimiter(WHITESPACE_PATTERN);
        return result;
    }


    /**
     * Reads and returns the next line, excluding the line separator if present.
     *
     * @return the next line, excluding the line separator if present;
     *         {@code null} if no such line
     */
    public static String readLine() {
        String line;
        try {
            line = scanner.nextLine();
        }
        catch (NoSuchElementException e) {
            line = null;
        }
        return line;
    }

    /**
     * Reads and returns the next character.
     *
     * @return the next {@code char}
     * @throws NoSuchElementException if standard input is empty
     */
    public static char readChar() {
        try {
            scanner.useDelimiter(EMPTY_PATTERN);
            String ch = scanner.next();
            assert ch.length() == 1 : "Internal (Std)In.readChar() error!"
                    + " Please contact the authors.";
            scanner.useDelimiter(WHITESPACE_PATTERN);
            return ch.charAt(0);
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'char' value from standard input, "
                    + "but no more tokens are available");
        }
    }


    /**
     * Reads and returns the remainder of the input, as a string.
     *
     * @return the remainder of the input, as a string
     * @throws NoSuchElementException if standard input is empty
     */
    public static String readAll() {
        if (!scanner.hasNextLine())
            return "";

        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
        // not that important to reset delimeter, since now scanner is empty
        scanner.useDelimiter(WHITESPACE_PATTERN); // but let's do it anyway
        return result;
    }


    /**
     * Reads the next token  and returns the {@code String}.
     *
     * @return the next {@code String}
     * @throws NoSuchElementException if standard input is empty
     */
    public static String readString() {
        try {
            return scanner.next();
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'String' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as an integer, and returns the integer.
     *
     * @return the next integer on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as an {@code int}
     */
    public static int readInt() {
        try {
            return scanner.nextInt();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read an 'int' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read an 'int' value from standard input, "
                    + "but no more tokens are available");
        }

    }

    /**
     * Reads the next token from standard input, parses it as a double, and returns the double.
     *
     * @return the next double on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code double}
     */
    public static double readDouble() {
        try {
            return scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'double' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'double' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a float, and returns the float.
     *
     * @return the next float on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code float}
     */
    public static float readFloat() {
        try {
            return scanner.nextFloat();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'float' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'float' value from standard input, "
                    + "but there no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a long integer, and returns the long integer.
     *
     * @return the next long integer on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code long}
     */
    public static long readLong() {
        try {
            return scanner.nextLong();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'long' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'long' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a short integer, and returns the short integer.
     *
     * @return the next short integer on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code short}
     */
    public static short readShort() {
        try {
            return scanner.nextShort();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'short' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'short' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a byte, and returns the byte.
     *
     * @return the next byte on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code byte}
     */
    public static byte readByte() {
        try {
            return scanner.nextByte();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'byte' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'byte' value from standard input, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from standard input, parses it as a boolean,
     * and returns the boolean.
     *
     * @return the next boolean on standard input
     * @throws NoSuchElementException if standard input is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code boolean}:
     *    {@code true} or {@code 1} for true, and {@code false} or {@code 0} for false,
     *    ignoring case
     */
    public static boolean readBoolean() {
        try {
            String token = readString();
            if ("true".equalsIgnoreCase(token))  return true;
            if ("false".equalsIgnoreCase(token)) return false;
            if ("1".equals(token))               return true;
            if ("0".equals(token))               return false;
            throw new InputMismatchException("attempts to read a 'boolean' value from standard input, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'boolean' value from standard input, "
                    + "but no more tokens are available");
        }

    }

    /**
     * Reads all remaining tokens from standard input and returns them as an array of strings.
     *
     * @return all remaining tokens on standard input, as an array of strings
     */
    public static String[] readAllStrings() {
        // we could use readAll.trim().split(), but that's not consistent
        // because trim() uses characters 0x00..0x20 as whitespace
        String[] tokens = WHITESPACE_PATTERN.split(readAll());
        if (tokens.length == 0 || tokens[0].length() > 0)
            return tokens;

        // don't include first token if it is leading whitespace
        String[] decapitokens = new String[tokens.length-1];
        for (int i = 0; i < tokens.length - 1; i++)
            decapitokens[i] = tokens[i+1];
        return decapitokens;
    }

    /**
     * Reads all remaining lines from standard input and returns them as an array of strings.
     * @return all remaining lines on standard input, as an array of strings
     */
    public static String[] readAllLines() {
        ArrayList<String> lines = new ArrayList<String>();
        while (hasNextLine()) {
            lines.add(readLine());
        }
        return lines.toArray(new String[lines.size()]);
    }

    /**
     * Reads all remaining tokens from standard input, parses them as integers, and returns
     * them as an array of integers.
     * @return all remaining integers on standard input, as an array
     * @throws InputMismatchException if any token cannot be parsed as an {@code int}
     */
    public static int[] readAllInts() {
        String[] fields = readAllStrings();
        int[] vals = new int[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Integer.parseInt(fields[i]);
        return vals;
    }

    /**
     * Reads all remaining tokens from standard input, parses them as longs, and returns
     * them as an array of longs.
     * @return all remaining longs on standard input, as an array
     * @throws InputMismatchException if any token cannot be parsed as a {@code long}
     */
    public static long[] readAllLongs() {
        String[] fields = readAllStrings();
        long[] vals = new long[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Long.parseLong(fields[i]);
        return vals;
    }

    /**
     * Reads all remaining tokens from standard input, parses them as doubles, and returns
     * them as an array of doubles.
     * @return all remaining doubles on standard input, as an array
     * @throws InputMismatchException if any token cannot be parsed as a {@code double}
     */
    public static double[] readAllDoubles() {
        String[] fields = readAllStrings();
        double[] vals = new double[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Double.parseDouble(fields[i]);
        return vals;
    }

    //// end: section (2 of 2) of code duplicated from In to StdIn


    // do this once when StdIn is initialized
    static {
        resync();
    }

    /**
     * If StdIn changes, use this to reinitialize the scanner.
     */
    private static void resync() {
        setScanner(new Scanner(new java.io.BufferedInputStream(System.in), CHARSET_NAME));
    }

    private static void setScanner(Scanner scanner) {
        StdIn.scanner = scanner;
        StdIn.scanner.useLocale(LOCALE);
    }

    /**
     * Reads all remaining tokens, parses them as integers, and returns
     * them as an array of integers.
     * @return all remaining integers, as an array
     * @throws InputMismatchException if any token cannot be parsed as an {@code int}
     * @deprecated Replaced by {@link #readAllInts()}.
     */
    @Deprecated
    public static int[] readInts() {
        return readAllInts();
    }

    /**
     * Reads all remaining tokens, parses them as doubles, and returns
     * them as an array of doubles.
     * @return all remaining doubles, as an array
     * @throws InputMismatchException if any token cannot be parsed as a {@code double}
     * @deprecated Replaced by {@link #readAllDoubles()}.
     */
    @Deprecated
    public static double[] readDoubles() {
        return readAllDoubles();
    }

    /**
     * Reads all remaining tokens and returns them as an array of strings.
     * @return all remaining tokens, as an array of strings
     * @deprecated Replaced by {@link #readAllStrings()}.
     */
    @Deprecated
    public static String[] readStrings() {
        return readAllStrings();
    }


    /**
     * Interactive test of basic functionality.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        StdOut.print("Type a string: ");
        String s = StdIn.readString();
        StdOut.println("Your string was: " + s);
        StdOut.println();

        StdOut.print("Type an int: ");
        int a = StdIn.readInt();
        StdOut.println("Your int was: " + a);
        StdOut.println();

        StdOut.print("Type a boolean: ");
        boolean b = StdIn.readBoolean();
        StdOut.println("Your boolean was: " + b);
        StdOut.println();

        StdOut.print("Type a double: ");
        double c = StdIn.readDouble();
        StdOut.println("Your double was: " + c);
        StdOut.println();
    }

}
 class ST<Key extends Comparable<Key>, Value> implements Iterable<Key> {

    private TreeMap<Key, Value> st;

    /**
     * Initializes an empty symbol table.
     */
    public ST() {
        st = new TreeMap<Key, Value>();
    }


    /**
     * Returns the value associated with the given key in this symbol table.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in this symbol table;
     *         {@code null} if the key is not in this symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("calls get() with null key");
        return st.get(key);
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("calls put() with null key");
        if (val == null) st.remove(key);
        else             st.put(key, val);
    }

    /**
     * Removes the specified key and its associated value from this symbol table
     * (if the key is in this symbol table).
     *
     * @param  key the key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("calls delete() with null key");
        st.remove(key);
    }

    /**
     * Returns true if this symbol table contain the given key.
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("calls contains() with null key");
        return st.containsKey(key);
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     *
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return st.size();
    }

    /**
     * Returns true if this symbol table is empty.
     *
     * @return {@code true} if this symbol table is empty and {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns all keys in this symbol table.
     * <p>
     * To iterate over all of the keys in the symbol table named {@code st},
     * use the foreach notation: {@code for (Key key : st.keys())}.
     *
     * @return all keys in this symbol table
     */
    public Iterable<Key> keys() {
        return st.keySet();
    }

    /**
     * Returns all of the keys in this symbol table.
     * To iterate over all of the keys in a symbol table named {@code st}, use the
     * foreach notation: {@code for (Key key : st)}.
     * <p>
     * This method is provided for backward compatibility with the version from
     * <em>Introduction to Programming in Java: An Interdisciplinary Approach.</em>
     *
     * @return     an iterator to all of the keys in this symbol table
     * @deprecated Replaced by {@link #keys()}.
     */
    @Deprecated
    public Iterator<Key> iterator() {
        return st.keySet().iterator();
    }

    /**
     * Returns the smallest key in this symbol table.
     *
     * @return the smallest key in this symbol table
     * @throws NoSuchElementException if this symbol table is empty
     */
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("calls min() with empty symbol table");
        return st.firstKey();
    }

    /**
     * Returns the largest key in this symbol table.
     *
     * @return the largest key in this symbol table
     * @throws NoSuchElementException if this symbol table is empty
     */
    public Key max() {
        if (isEmpty()) throw new NoSuchElementException("calls max() with empty symbol table");
        return st.lastKey();
    }

    /**
     * Returns the smallest key in this symbol table greater than or equal to {@code key}.
     *
     * @param  key the key
     * @return the smallest key in this symbol table greater than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key ceiling(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to ceiling() is null");
        Key k = st.ceilingKey(key);
        if (k == null) throw new NoSuchElementException("all keys are less than " + key);
        return k;
    }

    /**
     * Returns the largest key in this symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in this symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to floor() is null");
        Key k = st.floorKey(key);
        if (k == null) throw new NoSuchElementException("all keys are greater than " + key);
        return k;
    }

    /**
     * Unit tests the {@code ST} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        ST<String, Integer> st = new ST<String, Integer>();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            st.put(key, i);
        }
        for (String s : st.keys())
            StdOut.println(s + " " + st.get(s));
    }
}
 class IndexSET<Key extends Comparable<Key>> {
    private int n;
    private ST<Key, Integer> st = new ST<Key, Integer>();
    private ST<Integer, Key> ts = new ST<Integer, Key>();

    public void add(Key key) {
        if (!st.contains(key)) {
            st.put(key, n);
            ts.put(n, key);
            n++;
        }
    }

    public int indexOf(Key key) {
        return st.get(key);
    }

    public Key keyOf(int index) {
        return ts.get(index);
    }

    public boolean contains(Key key) { return st.contains(key);  }
    public int size()                { return st.size();         }
    public Iterable<Key> keys()      { return st.keys();         }}
 final class In {

    ///// begin: section (1 of 2) of code duplicated from In to StdIn.

    // assume Unicode UTF-8 encoding
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with System.out.
    private static final Locale LOCALE = Locale.US;

    // the default token separator; we maintain the invariant that this value
    // is held by the scanner's delimiter between calls
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

    // makes whitespace characters significant
    private static final Pattern EMPTY_PATTERN = Pattern.compile("");

    // used to read the entire input. source:
    // http://weblogs.java.net/blog/pat/archive/2004/10/stupid_scanner_1.html
    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

    //// end: section (1 of 2) of code duplicated from In to StdIn.

    private Scanner scanner;

    /**
     * Initializes an input stream from standard input.
     */
    public In() {
        scanner = new Scanner(new BufferedInputStream(System.in), CHARSET_NAME);
        scanner.useLocale(LOCALE);
    }

    /**
     * Initializes an input stream from a socket.
     *
     * @param  socket the socket
     * @throws IllegalArgumentException if cannot open {@code socket}
     * @throws IllegalArgumentException if {@code socket} is {@code null}
     */
    public In(Socket socket) {
        if (socket == null) throw new IllegalArgumentException("socket argument is null");
        try {
            InputStream is = socket.getInputStream();
            scanner = new Scanner(new BufferedInputStream(is), CHARSET_NAME);
            scanner.useLocale(LOCALE);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Could not open " + socket, ioe);
        }
    }

    /**
     * Initializes an input stream from a URL.
     *
     * @param  url the URL
     * @throws IllegalArgumentException if cannot open {@code url}
     * @throws IllegalArgumentException if {@code url} is {@code null}
     */
    public In(URL url) {
        if (url == null) throw new IllegalArgumentException("url argument is null");
        try {
            URLConnection site = url.openConnection();
            InputStream is     = site.getInputStream();
            scanner            = new Scanner(new BufferedInputStream(is), CHARSET_NAME);
            scanner.useLocale(LOCALE);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Could not open " + url, ioe);
        }
    }

    /**
     * Initializes an input stream from a file.
     *
     * @param  file the file
     * @throws IllegalArgumentException if cannot open {@code file}
     * @throws IllegalArgumentException if {@code file} is {@code null}
     */
    public In(File file) {
        if (file == null) throw new IllegalArgumentException("file argument is null");
        try {
            // for consistency with StdIn, wrap with BufferedInputStream instead of use
            // file as argument to Scanner
            FileInputStream fis = new FileInputStream(file);
            scanner = new Scanner(new BufferedInputStream(fis), CHARSET_NAME);
            scanner.useLocale(LOCALE);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Could not open " + file, ioe);
        }
    }


    /**
     * Initializes an input stream from a filename or web page name.
     *
     * @param  name the filename or web page name
     * @throws IllegalArgumentException if cannot open {@code name} as
     *         a file or URL
     * @throws IllegalArgumentException if {@code name} is {@code null}
     */
    public In(String name) {
        if (name == null) throw new IllegalArgumentException("argument is null");
        try {
            // first try to read file from local file system
            File file = new File(name);
            if (file.exists()) {
                // for consistency with StdIn, wrap with BufferedInputStream instead of use
                // file as argument to Scanner
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), CHARSET_NAME);
                scanner.useLocale(LOCALE);
                return;
            }

            // next try for files included in jar
            URL url = getClass().getResource(name);

            // try this as well
            if (url == null) {
                url = getClass().getClassLoader().getResource(name);
            }

            // or URL from web
            if (url == null) {
                url = new URL(name);
            }

            URLConnection site = url.openConnection();

            // in order to set User-Agent, replace above line with these two
            // HttpURLConnection site = (HttpURLConnection) url.openConnection();
            // site.addRequestProperty("User-Agent", "Mozilla/4.76");

            InputStream is     = site.getInputStream();
            scanner            = new Scanner(new BufferedInputStream(is), CHARSET_NAME);
            scanner.useLocale(LOCALE);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Could not open " + name, ioe);
        }
    }

    /**
     * Initializes an input stream from a given {@link Scanner} source; use with
     * {@code new Scanner(String)} to read from a string.
     * <p>
     * Note that this does not create a defensive copy, so the
     * scanner will be mutated as you read on.
     *
     * @param  scanner the scanner
     * @throws IllegalArgumentException if {@code scanner} is {@code null}
     */
    public In(Scanner scanner) {
        if (scanner == null) throw new IllegalArgumentException("scanner argument is null");
        this.scanner = scanner;
    }

    /**
     * Returns true if this input stream exists.
     *
     * @return {@code true} if this input stream exists; {@code false} otherwise
     */
    public boolean exists()  {
        return scanner != null;
    }

    ////  begin: section (2 of 2) of code duplicated from In to StdIn,
    ////  with all methods changed from "public" to "public static".

    /**
     * Returns true if input stream is empty (except possibly whitespace).
     * Use this to know whether the next call to {@link #readString()},
     * {@link #readDouble()}, etc will succeed.
     *
     * @return {@code true} if this input stream is empty (except possibly whitespace);
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return !scanner.hasNext();
    }

    /**
     * Returns true if this input stream has a next line.
     * Use this method to know whether the
     * next call to {@link #readLine()} will succeed.
     * This method is functionally equivalent to {@link #hasNextChar()}.
     *
     * @return {@code true} if this input stream has more input (including whitespace);
     *         {@code false} otherwise
     */
    public boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    /**
     * Returns true if this input stream has more input (including whitespace).
     * Use this method to know whether the next call to {@link #readChar()} will succeed.
     * This method is functionally equivalent to {@link #hasNextLine()}.
     *
     * @return {@code true} if this input stream has more input (including whitespace);
     *         {@code false} otherwise
     */
    public boolean hasNextChar() {
        scanner.useDelimiter(EMPTY_PATTERN);
        boolean result = scanner.hasNext();
        scanner.useDelimiter(WHITESPACE_PATTERN);
        return result;
    }


    /**
     * Reads and returns the next line in this input stream.
     *
     * @return the next line in this input stream; {@code null} if no such line
     */
    public String readLine() {
        String line;
        try {
            line = scanner.nextLine();
        }
        catch (NoSuchElementException e) {
            line = null;
        }
        return line;
    }

    /**
     * Reads and returns the next character in this input stream.
     *
     * @return the next {@code char} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     */
    public char readChar() {
        scanner.useDelimiter(EMPTY_PATTERN);
        try {
            String ch = scanner.next();
            assert ch.length() == 1 : "Internal (Std)In.readChar() error!"
                    + " Please contact the authors.";
            scanner.useDelimiter(WHITESPACE_PATTERN);
            return ch.charAt(0);
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'char' value from the input stream, "
                    + "but no more tokens are available");
        }
    }


    /**
     * Reads and returns the remainder of this input stream, as a string.
     *
     * @return the remainder of this input stream, as a string
     */
    public String readAll() {
        if (!scanner.hasNextLine())
            return "";

        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
        // not that important to reset delimeter, since now scanner is empty
        scanner.useDelimiter(WHITESPACE_PATTERN); // but let's do it anyway
        return result;
    }


    /**
     * Reads the next token from this input stream and returns it as a {@code String}.
     *
     * @return the next {@code String} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     */
    public String readString() {
        try {
            return scanner.next();
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'String' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from this input stream, parses it as a {@code int},
     * and returns the {@code int}.
     *
     * @return the next {@code int} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     * @throws InputMismatchException if the next token cannot be parsed as an {@code int}
     */
    public int readInt() {
        try {
            return scanner.nextInt();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read an 'int' value from the input stream, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read an 'int' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from this input stream, parses it as a {@code double},
     * and returns the {@code double}.
     *
     * @return the next {@code double} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code double}
     */
    public double readDouble() {
        try {
            return scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'double' value from the input stream, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read a 'double' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from this input stream, parses it as a {@code float},
     * and returns the {@code float}.
     *
     * @return the next {@code float} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code float}
     */
    public float readFloat() {
        try {
            return scanner.nextFloat();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'float' value from the input stream, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read a 'float' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from this input stream, parses it as a {@code long},
     * and returns the {@code long}.
     *
     * @return the next {@code long} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code long}
     */
    public long readLong() {
        try {
            return scanner.nextLong();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'long' value from the input stream, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read a 'long' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from this input stream, parses it as a {@code short},
     * and returns the {@code short}.
     *
     * @return the next {@code short} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code short}
     */
    public short readShort() {
        try {
            return scanner.nextShort();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'short' value from the input stream, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read a 'short' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from this input stream, parses it as a {@code byte},
     * and returns the {@code byte}.
     * <p>
     * To read binary data, use .
     *
     * @return the next {@code byte} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code byte}
     */
    public byte readByte() {
        try {
            return scanner.nextByte();
        }
        catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException("attempts to read a 'byte' value from the input stream, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attemps to read a 'byte' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads the next token from this input stream, parses it as a {@code boolean}
     * (interpreting either {@code "true"} or {@code "1"} as {@code true},
     * and either {@code "false"} or {@code "0"} as {@code false}).
     *
     * @return the next {@code boolean} in this input stream
     * @throws NoSuchElementException if the input stream is empty
     * @throws InputMismatchException if the next token cannot be parsed as a {@code boolean}
     */
    public boolean readBoolean() {
        try {
            String token = readString();
            if ("true".equalsIgnoreCase(token))  return true;
            if ("false".equalsIgnoreCase(token)) return false;
            if ("1".equals(token))               return true;
            if ("0".equals(token))               return false;
            throw new InputMismatchException("attempts to read a 'boolean' value from the input stream, "
                    + "but the next token is \"" + token + "\"");
        }
        catch (NoSuchElementException e) {
            throw new NoSuchElementException("attempts to read a 'boolean' value from the input stream, "
                    + "but no more tokens are available");
        }
    }

    /**
     * Reads all remaining tokens from this input stream and returns them as
     * an array of strings.
     *
     * @return all remaining tokens in this input stream, as an array of strings
     */
    public String[] readAllStrings() {
        // we could use readAll.trim().split(), but that's not consistent
        // since trim() uses characters 0x00..0x20 as whitespace
        String[] tokens = WHITESPACE_PATTERN.split(readAll());
        if (tokens.length == 0 || tokens[0].length() > 0)
            return tokens;
        String[] decapitokens = new String[tokens.length-1];
        for (int i = 0; i < tokens.length-1; i++)
            decapitokens[i] = tokens[i+1];
        return decapitokens;
    }

    /**
     * Reads all remaining lines from this input stream and returns them as
     * an array of strings.
     *
     * @return all remaining lines in this input stream, as an array of strings
     */
    public String[] readAllLines() {
        ArrayList<String> lines = new ArrayList<String>();
        while (hasNextLine()) {
            lines.add(readLine());
        }
        return lines.toArray(new String[lines.size()]);
    }


    /**
     * Reads all remaining tokens from this input stream, parses them as integers,
     * and returns them as an array of integers.
     *
     * @return all remaining lines in this input stream, as an array of integers
     */
    public int[] readAllInts() {
        String[] fields = readAllStrings();
        int[] vals = new int[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Integer.parseInt(fields[i]);
        return vals;
    }

    /**
     * Reads all remaining tokens from this input stream, parses them as longs,
     * and returns them as an array of longs.
     *
     * @return all remaining lines in this input stream, as an array of longs
     */
    public long[] readAllLongs() {
        String[] fields = readAllStrings();
        long[] vals = new long[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Long.parseLong(fields[i]);
        return vals;
    }

    /**
     * Reads all remaining tokens from this input stream, parses them as doubles,
     * and returns them as an array of doubles.
     *
     * @return all remaining lines in this input stream, as an array of doubles
     */
    public double[] readAllDoubles() {
        String[] fields = readAllStrings();
        double[] vals = new double[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Double.parseDouble(fields[i]);
        return vals;
    }

    ///// end: section (2 of 2) of code duplicated from In to StdIn */

    /**
     * Closes this input stream.
     */
    public void close() {
        scanner.close();
    }

    /**
     * Reads all integers from a file and returns them as
     * an array of integers.
     *
     * @param      filename the name of the file
     * @return     the integers in the file
     * @deprecated Replaced by {@code new In(filename)}.{@link #readAllInts()}.
     */
    @Deprecated
    public static int[] readInts(String filename) {
        return new In(filename).readAllInts();
    }

    /**
     * Reads all doubles from a file and returns them as
     * an array of doubles.
     *
     * @param      filename the name of the file
     * @return     the doubles in the file
     * @deprecated Replaced by {@code new In(filename)}.{@link #readAllDoubles()}.
     */
    @Deprecated
    public static double[] readDoubles(String filename) {
        return new In(filename).readAllDoubles();
    }

    /**
     * Reads all strings from a file and returns them as
     * an array of strings.
     *
     * @param      filename the name of the file
     * @return     the strings in the file
     * @deprecated Replaced by {@code new In(filename)}.{@link #readAllStrings()}.
     */
    @Deprecated
    public static String[] readStrings(String filename) {
        return new In(filename).readAllStrings();
    }

    /**
     * Reads all integers from standard input and returns them
     * an array of integers.
     *
     * @return     the integers on standard input
     * @deprecated Replaced by {@link StdIn#readAllInts()}.
     */
    @Deprecated
    public static int[] readInts() {
        return new In().readAllInts();
    }

    /**
     * Reads all doubles from standard input and returns them as
     * an array of doubles.
     *
     * @return     the doubles on standard input
     * @deprecated Replaced by {@link StdIn#readAllDoubles()}.
     */
    @Deprecated
    public static double[] readDoubles() {
        return new In().readAllDoubles();
    }

    /**
     * Reads all strings from standard input and returns them as
     *  an array of strings.
     *
     * @return     the strings on standard input
     * @deprecated Replaced by {@link StdIn#readAllStrings()}.
     */
    @Deprecated
    public static String[] readStrings() {
        return new In().readAllStrings();
    }

    /**
     * Unit tests the {@code In} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in;
        String urlName = "https://introcs.cs.princeton.edu/stdlib/InTest.txt";

        // read from a URL
        System.out.println("readAll() from URL " + urlName);
        System.out.println("---------------------------------------------------------------------------");
        try {
            in = new In(urlName);
            System.out.println(in.readAll());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();

        // read one line at a time from URL
        System.out.println("readLine() from URL " + urlName);
        System.out.println("---------------------------------------------------------------------------");
        try {
            in = new In(urlName);
            while (!in.isEmpty()) {
                String s = in.readLine();
                System.out.println(s);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();

        // read one string at a time from URL
        System.out.println("readString() from URL " + urlName);
        System.out.println("---------------------------------------------------------------------------");
        try {
            in = new In(urlName);
            while (!in.isEmpty()) {
                String s = in.readString();
                System.out.println(s);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();


        // read one line at a time from file in current directory
        System.out.println("readLine() from current directory");
        System.out.println("---------------------------------------------------------------------------");
        try {
            in = new In("./InTest.txt");
            while (!in.isEmpty()) {
                String s = in.readLine();
                System.out.println(s);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();


        // read one line at a time from file using relative path
        System.out.println("readLine() from relative path");
        System.out.println("---------------------------------------------------------------------------");
        try {
            in = new In("../stdlib/InTest.txt");
            while (!in.isEmpty()) {
                String s = in.readLine();
                System.out.println(s);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();

        // read one char at a time
        System.out.println("readChar() from file");
        System.out.println("---------------------------------------------------------------------------");
        try {
            in = new In("InTest.txt");
            while (!in.isEmpty()) {
                char c = in.readChar();
                System.out.print(c);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();

        // read one line at a time from absolute OS X / Linux path
        System.out.println("readLine() from absolute OS X / Linux path");
        System.out.println("---------------------------------------------------------------------------");
        in = new In("/n/fs/introcs/www/java/stdlib/InTest.txt");
        try {
            while (!in.isEmpty()) {
                String s = in.readLine();
                System.out.println(s);
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();


        // read one line at a time from absolute Windows path
        System.out.println("readLine() from absolute Windows path");
        System.out.println("---------------------------------------------------------------------------");
        try {
            in = new In("G:\\www\\introcs\\stdlib\\InTest.txt");
            while (!in.isEmpty()) {
                String s = in.readLine();
                System.out.println(s);
            }
            System.out.println();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println();

    }

}
 class BreadthFirstPaths {
    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean[] marked;  // marked[v] = is there an s-v path
    private int[] edgeTo;      // edgeTo[v] = previous edge on shortest s-v path
    private int[] distTo;      // distTo[v] = number of edges shortest s-v path

    /**
     * Computes the shortest path between the source vertex {@code s}
     * and every other vertex in the graph {@code G}.
     * @param G the graph
     * @param s the source vertex
     * @throws IllegalArgumentException unless {@code 0 <= s < V}
     */
    public BreadthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        distTo = new int[G.V()];
        edgeTo = new int[G.V()];
        validateVertex(s);
        bfs(G, s);

        assert check(G, s);
    }

    /**
     * Computes the shortest path between any one of the source vertices in {@code sources}
     * and every other vertex in graph {@code G}.
     * @param G the graph
     * @param sources the source vertices
     * @throws IllegalArgumentException unless {@code 0 <= s < V} for each vertex
     *         {@code s} in {@code sources}
     */
    public BreadthFirstPaths(Graph G, Iterable<Integer> sources) {
        marked = new boolean[G.V()];
        distTo = new int[G.V()];
        edgeTo = new int[G.V()];
        for (int v = 0; v < G.V(); v++)
            distTo[v] = INFINITY;
        validateVertices(sources);
        bfs(G, sources);
    }


    // breadth-first search from a single source
    private void bfs(Graph G, int s) {
        Queue<Integer> q = new Queue<Integer>();
        for (int v = 0; v < G.V(); v++)
            distTo[v] = INFINITY;
        distTo[s] = 0;
        marked[s] = true;
        q.enqueue(s);

        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                    marked[w] = true;
                    q.enqueue(w);
                }
            }
        }
    }

    // breadth-first search from multiple sources
    private void bfs(Graph G, Iterable<Integer> sources) {
        Queue<Integer> q = new Queue<Integer>();
        for (int s : sources) {
            marked[s] = true;
            distTo[s] = 0;
            q.enqueue(s);
        }
        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                    marked[w] = true;
                    q.enqueue(w);
                }
            }
        }
    }

    /**
     * Is there a path between the source vertex {@code s} (or sources) and vertex {@code v}?
     * @param v the vertex
     * @return {@code true} if there is a path, and {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public boolean hasPathTo(int v) {
        validateVertex(v);
        return marked[v];
    }

    /**
     * Returns the number of edges in a shortest path between the source vertex {@code s}
     * (or sources) and vertex {@code v}?
     * @param v the vertex
     * @return the number of edges in a shortest path
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int distTo(int v) {
        validateVertex(v);
        return distTo[v];
    }

    /**
     * Returns a shortest path between the source vertex {@code s} (or sources)
     * and {@code v}, or {@code null} if no such path.
     * @param  v the vertex
     * @return the sequence of vertices on a shortest path, as an Iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Integer> pathTo(int v) {
        validateVertex(v);
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        int x;
        for (x = v; distTo[x] != 0; x = edgeTo[x])
            path.push(x);
        path.push(x);
        return path;
    }


    // check optimality conditions for single source
    private boolean check(Graph G, int s) {

        // check that the distance of s = 0
        if (distTo[s] != 0) {
            StdOut.println("distance of source " + s + " to itself = " + distTo[s]);
            return false;
        }

        // check that for each edge v-w dist[w] <= dist[v] + 1
        // provided v is reachable from s
        for (int v = 0; v < G.V(); v++) {
            for (int w : G.adj(v)) {
                if (hasPathTo(v) != hasPathTo(w)) {
                    StdOut.println("edge " + v + "-" + w);
                    StdOut.println("hasPathTo(" + v + ") = " + hasPathTo(v));
                    StdOut.println("hasPathTo(" + w + ") = " + hasPathTo(w));
                    return false;
                }
                if (hasPathTo(v) && (distTo[w] > distTo[v] + 1)) {
                    StdOut.println("edge " + v + "-" + w);
                    StdOut.println("distTo[" + v + "] = " + distTo[v]);
                    StdOut.println("distTo[" + w + "] = " + distTo[w]);
                    return false;
                }
            }
        }

        // check that v = edgeTo[w] satisfies distTo[w] = distTo[v] + 1
        // provided v is reachable from s
        for (int w = 0; w < G.V(); w++) {
            if (!hasPathTo(w) || w == s) continue;
            int v = edgeTo[w];
            if (distTo[w] != distTo[v] + 1) {
                StdOut.println("shortest path edge " + v + "-" + w);
                StdOut.println("distTo[" + v + "] = " + distTo[v]);
                StdOut.println("distTo[" + w + "] = " + distTo[w]);
                return false;
            }
        }

        return true;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertices(Iterable<Integer> vertices) {
        if (vertices == null) {
            throw new IllegalArgumentException("argument is null");
        }
        int V = marked.length;
        for (int v : vertices) {
            if (v < 0 || v >= V) {
                throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
            }
        }
    }

    /**
     * Unit tests the {@code BreadthFirstPaths} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        Graph G = new Graph(in);
        // StdOut.println(G);

        int s = Integer.parseInt(args[1]);
        BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);

        for (int v = 0; v < G.V(); v++) {
            if (bfs.hasPathTo(v)) {
                StdOut.printf("%d to %d (%d):  ", s, v, bfs.distTo(v));
                for (int x : bfs.pathTo(v)) {
                    if (x == s) StdOut.print(x);
                    else        StdOut.print("-" + x);
                }
                StdOut.println();
            }

            else {
                StdOut.printf("%d to %d (-):  not connected\n", s, v);
            }

        }
    }


}
 class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    /**
     * Initializes an empty graph with {@code V} vertices and 0 edges.
     * param V the number of vertices
     *
     * @param  V number of vertices
     * @throws IllegalArgumentException if {@code V < 0}
     */
    public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    /**
     * Initializes a graph from the specified input stream.
     * The format is the number of vertices <em>V</em>,
     * followed by the number of edges <em>E</em>,
     * followed by <em>E</em> pairs of vertices, with each entry separated by whitespace.
     *
     * @param  in the input stream
     * @throws IllegalArgumentException if the endpoints of any edge are not in prescribed range
     * @throws IllegalArgumentException if the number of vertices or edges is negative
     * @throws IllegalArgumentException if the input stream is in the wrong format
     */
    public Graph(In in) {
        try {
            this.V = in.readInt();
            if (V < 0) throw new IllegalArgumentException("number of vertices in a Graph must be nonnegative");
            adj = (Bag<Integer>[]) new Bag[V];
            for (int v = 0; v < V; v++) {
                adj[v] = new Bag<Integer>();
            }
            int E = in.readInt();
            if (E < 0) throw new IllegalArgumentException("number of edges in a Graph must be nonnegative");
            for (int i = 0; i < E; i++) {
                int v = in.readInt();
                int w = in.readInt();
                validateVertex(v);
                validateVertex(w);
                addEdge(v, w);
            }
        }
        catch (NoSuchElementException e) {
            throw new IllegalArgumentException("invalid input format in Graph constructor", e);
        }
    }


    /**
     * Initializes a new graph that is a deep copy of {@code G}.
     *
     * @param  G the graph to copy
     */
    public Graph(Graph G) {
        this(G.V());
        this.E = G.E();
        for (int v = 0; v < G.V(); v++) {
            // reverse so that adjacency list is in same order as original
            Stack<Integer> reverse = new Stack<Integer>();
            for (int w : G.adj[v]) {
                reverse.push(w);
            }
            for (int w : reverse) {
                adj[v].add(w);
            }
        }
    }

    /**
     * Returns the number of vertices in this graph.
     *
     * @return the number of vertices in this graph
     */
    public int V() {
        return V;
    }

    /**
     * Returns the number of edges in this graph.
     *
     * @return the number of edges in this graph
     */
    public int E() {
        return E;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }

    /**
     * Adds the undirected edge v-w to this graph.
     *
     * @param  v one vertex in the edge
     * @param  w the other vertex in the edge
     * @throws IllegalArgumentException unless both {@code 0 <= v < V} and {@code 0 <= w < V}
     */
    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        E++;
        adj[v].add(w);
        adj[w].add(v);
    }


    /**
     * Returns the vertices adjacent to vertex {@code v}.
     *
     * @param  v the vertex
     * @return the vertices adjacent to vertex {@code v}, as an iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    /**
     * Returns the degree of vertex {@code v}.
     *
     * @param  v the vertex
     * @return the degree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }


    /**
     * Returns a string representation of this graph.
     *
     * @return the number of vertices <em>V</em>, followed by the number of edges <em>E</em>,
     *         followed by the <em>V</em> adjacency lists
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }


    /**
     * Unit tests the {@code Graph} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        Graph G = new Graph(in);
        StdOut.println(G);
    }

}
 class Queue<Item> implements Iterable<Item> {
    private Node<Item> first;    // beginning of queue
    private Node<Item> last;     // end of queue
    private int n;               // number of elements on queue

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty queue.
     */
    public Queue() {
        first = null;
        last  = null;
        n = 0;
    }

    /**
     * Returns true if this queue is empty.
     *
     * @return {@code true} if this queue is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue.
     *
     * @return the number of items in this queue
     */
    public int size() {
        return n;
    }

    /**
     * Returns the item least recently added to this queue.
     *
     * @return the item least recently added to this queue
     * @throws NoSuchElementException if this queue is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.item;
    }

    /**
     * Adds the item to this queue.
     *
     * @param  item the item to add
     */
    public void enqueue(Item item) {
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        n++;
    }

    /**
     * Removes and returns the item on this queue that was least recently added.
     *
     * @return the item on this queue that was least recently added
     * @throws NoSuchElementException if this queue is empty
     */
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;   // to avoid loitering
        return item;
    }

    /**
     * Returns a string representation of this queue.
     *
     * @return the sequence of items in FIFO order, separated by spaces
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }

    /**
     * Returns an iterator that iterates over the items in this queue in FIFO order.
     *
     * @return an iterator that iterates over the items in this queue in FIFO order
     */
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    /**
     * Unit tests the {@code Queue} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                queue.enqueue(item);
            else if (!queue.isEmpty())
                StdOut.print(queue.dequeue() + " ");
        }
        StdOut.println("(" + queue.size() + " left on queue)");
    }
}
 class Stack<Item> implements Iterable<Item> {
    private Node<Item> first;     // top of stack
    private int n;                // size of the stack

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty stack.
     */
    public Stack() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if this stack is empty.
     *
     * @return true if this stack is empty; false otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return the number of items in this stack
     */
    public int size() {
        return n;
    }

    /**
     * Adds the item to this stack.
     *
     * @param  item the item to add
     */
    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Removes and returns the item most recently added to this stack.
     *
     * @return the item most recently added
     * @throws NoSuchElementException if this stack is empty
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }


    /**
     * Returns (but does not remove) the item most recently added to this stack.
     *
     * @return the item most recently added to this stack
     * @throws NoSuchElementException if this stack is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return the sequence of items in this stack in LIFO order, separated by spaces
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }


    /**
     * Returns an iterator to this stack that iterates through the items in LIFO order.
     *
     * @return an iterator to this stack that iterates through the items in LIFO order
     */
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    /**
     * Unit tests the {@code Stack} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                stack.push(item);
            else if (!stack.isEmpty())
                StdOut.print(stack.pop() + " ");
        }
        StdOut.println("(" + stack.size() + " left on stack)");
    }
}
 class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;    // beginning of bag
    private int n;               // number of elements in bag

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty bag.
     */
    public Bag() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if this bag is empty.
     *
     * @return {@code true} if this bag is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this bag.
     *
     * @return the number of items in this bag
     */
    public int size() {
        return n;
    }

    /**
     * Adds the item to this bag.
     *
     * @param  item the item to add to this bag
     */
    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }


    /**
     * Returns an iterator that iterates over the items in this bag in arbitrary order.
     *
     * @return an iterator that iterates over the items in this bag in arbitrary order
     */
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
     * Unit tests the {@code Bag} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            bag.add(item);
        }

        StdOut.println("size of bag = " + bag.size());
        for (String s : bag) {
            StdOut.println(s);
        }
    }

}