package com.jjmr.keycloak.controller;

import com.jjmr.keycloak.util.JWTUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/token")
public class TokenController {
    @RequestMapping("/token")
    public String getToken() {
        return JWTUtil.getJWTToken();
    }
}
