package com.messageproject.reporsitychain;

class RequiredFieldValidator implements MessageValidator {
    private MessageValidator nextValidator;
    
    @Override
    public void setNextValidator(MessageValidator nextValidator) {
        this.nextValidator = nextValidator;
    }
    
    @Override
    public boolean validate(MessageRequest request) {
        // 必填字段验证逻辑
        if(false) {
            return false;
        }
        
        // 验证通过，交给下一个验证器处理
        return nextValidator != null ? nextValidator.validate(request) : true;
    }
}