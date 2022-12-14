package helio.action.http.exceptions;

import helio.blueprints.exceptions.ActionException;

public class HttpRequestPerformException extends ActionException {

    private static final long serialVersionUID = 5111442L;

    public HttpRequestPerformException(String msg) {
        super(HttpRequestPerformException.class.getCanonicalName() + ": " + msg);
    }

}
