package io.irwansyahdev96.migration.v17.record.dto;

public record ResponseAPI<T>(T data, Boolean isAvailable) {}
