package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    final int code;
    final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        for (HttpStatus value : values()) {
            if (value.getCode() == httpCodeInput) {
                return value;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
