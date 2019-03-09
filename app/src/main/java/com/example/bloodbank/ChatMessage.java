package com.example.bloodbank;

import java.util.Date;

public class ChatMessage {
    private String messageuser;
    private String message;
    private long messagetime;

    public ChatMessage(String messageuser,String message) {
        this.messageuser = messageuser;
        this.message=message;
        messagetime=new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageuser() {
        return messageuser;
    }

    public void setMessageuser(String messageuser) {
        this.messageuser = messageuser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(long messagetime) {
        this.messagetime = messagetime;
    }
}
