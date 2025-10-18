package io.irwansyahdev96.migration.v11.lambdaexp.dto;

import java.util.List;

public class ResponseListAPI {
    private List<?> data;
    private Long count;

    public ResponseListAPI(List<?> data, Long count) {
        this.data = data;
        this.count = count;
    }
    public List<?> getData() {
        return data;
    }
    public void setData(List<?> data) {
        this.data = data;
    }
    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }

    
}
