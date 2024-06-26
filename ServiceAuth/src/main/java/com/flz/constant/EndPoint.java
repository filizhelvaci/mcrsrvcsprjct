package com.flz.constant;

public class EndPoint {
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    public static final  String REGISTER = "/register";
    public static final  String LOGIN = "/login";
}
