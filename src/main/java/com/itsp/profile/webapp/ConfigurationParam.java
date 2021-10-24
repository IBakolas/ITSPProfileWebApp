package com.itsp.profile.webapp;

public class ConfigurationParam {

    enum ParamViewType {
        INPUT_TEXT,
        DROPDOWN,
        FLAG
    }

    private ParamViewType viewType;
    private String paramName;
    private String paramId;
    private String paramTypeId;
    private String defaultValue;


    public ConfigurationParam() {

    }

    public ConfigurationParam(ParamViewType viewType, String paramName, String paramId, String paramTypeId, String defaultValue) {
        this.viewType = viewType;
        this.paramName = paramName;
        this.paramId = paramId;
        this.paramTypeId = paramTypeId;
        this.defaultValue = defaultValue;
    }

    public ParamViewType getViewType() {
        return viewType;
    }

    public void setViewType(ParamViewType viewType) {
        this.viewType = viewType;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getParamTypeId() {
        return paramTypeId;
    }

    public void setParamTypeId(String paramTypeId) {
        this.paramTypeId = paramTypeId;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void parseFromString(String param)
    {
        System.out.println("Parsing string: " + param);
        String[] values = param.split("\\|");

        this.paramName = values[0];
        this.paramId = values[1];
        this.paramTypeId = values[2];
        this.defaultValue = values[3];
    }

    public String toPersistancyString(){
        String str = "";

        str += this.paramName;
        for(int i = 0; i < 30 - this.paramName.length(); ++i)
        {
            str += " ";
        }

        str += "|" + this.paramId + "|";
        str += this.paramTypeId + "|";
        str += this.defaultValue + "|";
        str += this.defaultValue;


        return str;
    }

    @Override
    public String toString() {
        return "ConfigurationParam{" +
                "viewType=" + viewType +
                ", paramName='" + paramName + '\'' +
                ", paramId='" + paramId + '\'' +
                ", paramTypeId='" + paramTypeId + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                '}';
    }
}
