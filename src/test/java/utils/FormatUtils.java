package test.java.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatUtils {
	
	public static String CurrentDateTimeStringShort() {
		String format = "yyyyMMdd HHmmss";
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
	}

}
