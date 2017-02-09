import java.util.SplittableRandom;

/**
 * Created by Wiets on 7/02/2017.
 */
public class CypherApp {
    private int offset;
    
    public CypherApp(int offset) {
        this.offset = offset;
    }

    public String encode(String s) {
        String output = "";

        if(s.equals("")){
            return "";
        }
        for (char c : s.toCharArray()) {
            output += encodeChar(c);
        }
        return output;
    }

    public String decode(String s) {
        String output = "";
        for (char c : s.toCharArray()){
            if (!isLetter(c)){
                output += c;
            }
            if(isUpperCase(c)){
                output += decodeUpper(c);
            }
            if(isLetter(c)){
                output += decodeLower(c);
            }
        }
    }

    private char decodeLower(char c) {
        if(c - offset < 'a') {
            return (char) (c - offset + ('z' - 'a' + 1));
        }
        return (char) (c + offset);
    }

    private char decodeUpper(char c) {
        if(c - offset < 'A') {
            return (char) (c - offset + ('Z' - 'A' + 1));
        }
        return (char) (c+offset);
    }

    private char encodeChar(char c) {
        if (!isLetter(c)) {
            return c;
        }
        if(isUpperCase(c)){
            return encodeUpperCase(c);
        }
        if(isLowerCase(c)){
            return encodeLowerCase(c);
        }
        else{
            return (char)(c + offset);
        }
    }

    private boolean isLowerCase(char c) {
        return (c >= 'a' && c <= 'z');
    }

    private char encodeLowerCase(char c) {
        if(c + offset > 'z') {
            return (char) (c + offset - ('z' - 'a' + 1));
        }
        return (char) (c + offset);
    }

    private char encodeUpperCase(char c) {
        if(c + offset > 'Z') {
            return (char) (c + offset - ('Z' - 'A' + 1));
        }
        return (char) (c+offset);
    }

    private boolean isUpperCase(char c) {
       return (c >= 'A' && c <= 'Z');
    }

    private boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
