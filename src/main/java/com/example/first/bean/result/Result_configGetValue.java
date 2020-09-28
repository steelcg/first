package com.example.first.bean.result;

public class Result_configGetValue {
    private int return_value;
    private String[] results;

    public int getReturn_value() {
        return return_value;
    }

    public void setReturn_value(int return_value) {
        this.return_value = return_value;
    }

    public String[] getResults() {
        return results;
    }

    public void setResults(String[] results) {
        this.results = results;
    }

    public Result_configGetValue(){}

    public Result_configGetValue(int return_value, String[] results) {
        this.results = results;
        this.return_value = return_value;
    }
    public static Result_configGetValue getInstance() {
        return new Result_configGetValue(0, new String[]{"a", "b"});
    }
}
