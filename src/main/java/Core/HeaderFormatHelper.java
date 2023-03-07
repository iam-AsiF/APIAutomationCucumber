package Core;

import java.util.HashMap;

public class HeaderFormatHelper {
    // Header Keys
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String AUTHORIZATION_HEADER_KEY = "Authorization";


    private static final String CONTENT_TYPE_VALUE_APPLICATION_JSON =
            "application/json;charset=UTF-8";
    // private static final String AUTHORIZATION_VALUE = "xnd_public_development_G60DEcjMjYtUBy6VEmFkBc9O3U20L360G26MJkhCV3OvV0xinAkb7ctQut9oH1";


    //Common Header(which would be used for all)
    public static HashMap<String, Object> commonHeaders() {
        HashMap<String, Object> headers = new HashMap<>();
        headers.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE_VALUE_APPLICATION_JSON);
//        headers.put(AUTHORIZATION_HEADER_KEY,AUTHORIZATION_VALUE);
        return headers;
    }
    public static HashMap<String, Object> commonHeadersForNewAgent(String AUTHORIZATION_VALUE ) {
        HashMap<String, Object> headers = new HashMap<>();
        headers.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE_VALUE_APPLICATION_JSON);
        headers.put(AUTHORIZATION_HEADER_KEY,"Bearer "+AUTHORIZATION_VALUE);
        return headers;
    }

}