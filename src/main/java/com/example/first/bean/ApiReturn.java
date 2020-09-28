package com.example.first.bean;

public class ApiReturn<T> {
    private GlobalResponse<T> result;

    public GlobalResponse<T> getResult() {
        return result;
    }

    public void setResult(GlobalResponse<T> result) {
        this.result = result;
    }

    public static <T> ApiReturn<T> success(T data) {
        ApiReturn<T> apiReturn = new ApiReturn<>();
        GlobalResponse<T> response = new GlobalResponse<>();
        response.setReturn_data(data);
        response.setReturn_value(0);
        apiReturn.setResult(response);
        return apiReturn;
    }

    public static <T> ApiReturn<T> fail(String message, int value) {
        ApiReturn<T> apiReturn = new ApiReturn<>();
        GlobalResponse<T> response = new GlobalResponse<>();
        response.setReturn_value(value);
        response.setReturn_message(message);
        apiReturn.setResult(response);
        return apiReturn;
    }
}
