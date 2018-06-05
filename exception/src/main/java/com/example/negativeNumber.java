package com.example;

/**
 * Created by asabagh on 6/5/18.
 */

public class negativeNumber extends Exception {
    public String getMsg(String msg){
        if(msg.length() == 0)
            return "please enter negative number";
        else
            return msg;
    }
}
