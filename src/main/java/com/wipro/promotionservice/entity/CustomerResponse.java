package com.wipro.promotionservice.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

public class CustomerResponse {

    Integer customerId;

    String promotionCode;

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


}
