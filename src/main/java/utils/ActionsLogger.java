package utils;

import actions.*;

import java.util.logging.Logger;

public class ActionsLogger {
    public static Logger LOGGER;
    static {
        try {
            LOGGER = Logger.getLogger(AddProductToCartAction.class.getName());
            LOGGER = Logger.getLogger(ChooseAndBuyAction.class.getName());
            LOGGER = Logger.getLogger(CreateAccountAction.class.getName());
            LOGGER = Logger.getLogger(LoginAction.class.getName());
            LOGGER = Logger.getLogger(SearchForProductAction.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }
}
