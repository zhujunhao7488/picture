package jiaocheng;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapDemo {
    public static void main(String[] args) {
    	String line = "<img src=\"attachement/jpg/site3/20190102/309c236f8da41d971d132f.jpg\" border=\"0\" width=\"210\" height=\"170\">";

    	Pattern pattern = Pattern.compile("(i?)<img(.*?)(src|align)=\"?(.*?\\.jpg)\"(.*?)>");

    	Matcher matcher = pattern.matcher(line);

    	while (matcher.find()) {

    	System.out.println(matcher.group(0));

    	System.out.println();

    	}
    }
}
