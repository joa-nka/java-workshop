package com.example.javaworkshop.model;

public class Investigation {

    private Long id;
    private Long transactionId;
    private String reason;
    private String status;

    public Investigation(Long id, Long transactionId, String reason, String status) {
        this.id = id;
        this.transactionId = transactionId;
        this.reason = reason;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}