package com.tringuyen.fooddelivery.controller;

import com.tringuyen.fooddelivery.payload.request.SignInRequest;
import com.tringuyen.fooddelivery.payload.response.DataResponse;
import com.tringuyen.fooddelivery.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("")
public class LoginController {

    @Autowired
    LoginService loginService;
    @Autowired
    AuthenticationManager authenticationManager;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SignInRequest signInRequest){
        UsernamePasswordAuthenticationToken authReq
                = new UsernamePasswordAuthenticationToken(signInRequest.getEmail(), signInRequest.getPassword());
        Authentication auth = authenticationManager.authenticate(authReq);
        SecurityContext sc = SecurityContextHolder.getContext();
        sc.setAuthentication(auth);
        DataResponse dataResponse = new DataResponse();


        if(loginService.checkLogin(signInRequest.getEmail(),signInRequest.getPassword())){
            dataResponse.setStatus(HttpStatus.OK.value());
            dataResponse.setSuccess(true);
            dataResponse.setData("");
            dataResponse.setDesc("Login Success");
        }else {
            dataResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
            dataResponse.setSuccess(false);
            dataResponse.setData("");
            dataResponse.setDesc("Login Fail");
        }

        return new ResponseEntity<>(dataResponse, HttpStatus.OK);
    }
}
