package com.messageproject.reporsitychain;

interface MessageValidator {
    void setNextValidator(MessageValidator nextValidator);
    boolean validate(MessageRequest request);
}