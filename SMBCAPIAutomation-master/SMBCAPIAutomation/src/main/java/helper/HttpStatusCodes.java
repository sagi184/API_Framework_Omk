package helper;

import org.apache.http.HttpStatus;

public class HttpStatusCodes extends EmailReporting{
	
	
	public static final int OK = HttpStatus.SC_OK;
	public static final int CREATED = HttpStatus.SC_CREATED;
	public static final int UNAUTHORIZED = HttpStatus.SC_UNAUTHORIZED;
	public static final int INTERNAL_SERVER_ERROR = HttpStatus.SC_INTERNAL_SERVER_ERROR;
	public static final int BAD_REQUEST = HttpStatus.SC_BAD_REQUEST;

}
