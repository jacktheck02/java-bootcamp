package com.northstar.crm.exception;

import java.time.LocalDateTime;
import java.util.Map;

public class ErrorResponse {
    private int statusHint;
    private String code;
    private String message;
    private String correlationId;
    private Map<String, String> errorMap;

    public ErrorResponse(
            int statusHint,
            String code,
            String message,
            String correlationId,
            Map<String, String> errorMap) {
        this.statusHint = statusHint;
        this.code = code;
        this.message = message;
        this.correlationId = correlationId;
        this.errorMap = errorMap;
    }

    private String errorMapToJSON(Map<String, String> errorMap) {
        StringBuilder mapJsonStringBuilder = new StringBuilder("{");
        for (var pair : errorMap.entrySet()) {
            mapJsonStringBuilder.append("\"" + pair.getKey() + "\":\"" + pair.getValue() + "\",");
        }
        mapJsonStringBuilder.append("}");
        return mapJsonStringBuilder.toString();
    }

    public String toJson() {
        return "{\"timestamp\":\""
                + LocalDateTime.now()
                + "\",\"status\":\""
                + this.statusHint
                + "\",\"error\":\""
                + this.code
                + "\",\"message\":\""
                + this.message
                + "\",\"correlationId\":\""
                + this.correlationId
                + "\",\"errors\":"
                + errorMapToJSON(this.errorMap)
                + "}";
    }

    public int getStatusHint() {
        return statusHint;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public Map<String, String> getErrorMap() {
        return errorMap;
    }
}
