package com.example.first.bean;

public class ITacApiReturn<T> {
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static <T> ITacApiReturn<T> getInstance(T data) {
        ITacApiReturn<T> apiReturn = new ITacApiReturn<>();
        apiReturn.setResult(data);
        return apiReturn;
    }
}
