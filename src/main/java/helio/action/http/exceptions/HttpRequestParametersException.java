package helio.action.http.exceptions;

import helio.blueprints.exceptions.ActionException;

public class HttpRequestParametersException extends ActionException {

    private static final long serialVersionUID = 5224442L;

    public HttpRequestParametersException(String msg) {
        super(HttpRequestParametersException.class.getCanonicalName() + ": " + msg);
    }

}
