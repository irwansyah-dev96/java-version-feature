package io.irwansyahdev96.migration.v17.record.dto;

import java.util.Map;

public record ResponseChangeAPI(String id, String message, Map<String, String> errors) {
    
}
