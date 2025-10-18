package io.irwansyahdev96.migration.v11.lambdaexp.dto;

public class ResponseAPI<T> {
    
    private T data;
    private Boolean isAvailable;

    public ResponseAPI(T data, Boolean isAvailable) {
        this.data = data;
        this.isAvailable = isAvailable;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    

}
