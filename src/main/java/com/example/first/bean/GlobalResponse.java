package com.example.first.bean;

public class GlobalResponse<T> {
    private int return_value;
    private String return_message;
    private T return_data;

    public static <T> GlobalResponse<T> success(T data) {
        GlobalResponse<T> response = new GlobalResponse<>();
        response.setReturn_data(data);
        response.setReturn_value(0);
        return response;
    }

    public static <T> GlobalResponse<T> fail(String message, int value) {
        GlobalResponse<T> response = new GlobalResponse<>();
        response.setReturn_value(value);
        response.setReturn_message(message);
        return response;
    }

    public int getReturn_value() {
        return return_value;
    }

    public void setReturn_value(int return_value) {
        this.return_value = return_value;
    }

    public String getReturn_message() {
        return return_message;
    }

    public void setReturn_message(String return_message) {
        this.return_message = return_message;
    }

    public T getReturn_data() {
        return return_data;
    }

    public void setReturn_data(T return_data) {
        this.return_data = return_data;
    }
}
