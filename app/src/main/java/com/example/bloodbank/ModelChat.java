package com.example.bloodbank;

import java.util.Date;

public class ModelChat {
    private String messagetext;
    private String messageuser;



    public ModelChat(String messagetext,String messageuser) {
        this.messagetext = messagetext;
        this.messageuser=messageuser;

    }

    public ModelChat() {
    }

    public String getMessagetext() {
        return messagetext;
    }

    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }

    public String getMessageuser() {
        return messageuser;
    }

    public void setMessageuser(String messageuser) {
        this.messageuser = messageuser;
    }


}

