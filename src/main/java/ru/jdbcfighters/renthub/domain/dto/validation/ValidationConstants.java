package ru.jdbcfighters.renthub.domain.dto.validation;

public class ValidationConstants {

    private ValidationConstants() {
    }

    public static final String LOGIN_PATTERN = "[a-zA-Z]*";

    public static final String EMAIL_PATTERN = "^(?=.{6,}$)[\\s]*[a-zA-Z0-9]+([!\"#$%&'()*+,\\-.\\/:;<=>?\\[\\]" +
            "\\^_{}][a-zA-z0-9]+)*@([\\w]+(-[\\w]+)?)(\\.[\\w]+[-][\\w]+)*" +
            "(\\.[a-z]{2,})+[\\s]*$";

    public static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";

    public static final String FIRST_NAME_PATTERN = "^(?=.{1,}$)[a-zA-Z]+(?:[-' ][a-zA-Z]+)*$";

    public static final String LAST_NAME_PATTERN = "^(?=.{1,}$)[a-zA-Z]+(?:[-' ][a-zA-Z]+)*$";

    public static final String PHONE_PATTERN = "^(?=.{0,}$)[0-9]*$";

}
