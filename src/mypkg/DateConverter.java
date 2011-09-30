package mypkg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import ognl.DefaultTypeConverter;

public class DateConverter extends DefaultTypeConverter {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	
	
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		try {
			if (toType == Date.class) {
				String date = ((String[]) value)[0];
				return sdf.parse(date);
			} else if (toType == String.class) {
				Date date = (Date) value;
				return sdf.format(date);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

}
