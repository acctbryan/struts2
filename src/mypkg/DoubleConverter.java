package mypkg;

import java.text.DecimalFormat;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import ognl.DefaultTypeConverter;

public class DoubleConverter extends DefaultTypeConverter {

	private static Log log = LogFactory.getLog(DoubleConverter.class);

	private DecimalFormat df = new DecimalFormat("0.##########");
	
	
	public Object convertValue(Map context, Object value, Class toType) {
		try {
			if (toType == Double.class) {
				String val = ((String[]) value)[0];
				if (val==null || val.length()==0) {
					return new Double(0);
				}
				return df.parse(val).doubleValue();
			} else if (toType == String.class) {
				Double val = (Double) value;
				if (val == null) {
					val = new Double(0);
				}
				return df.format(val);
			}
		} catch (Exception e) {
			log.error(e, e);
			throw new RuntimeException(e);
		}
		return null;
	}

}
