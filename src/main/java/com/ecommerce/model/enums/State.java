package com.ecommerce.model.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum State {
    IN_PROGRESS,
    UPDATED,
    SAVED,
    CLOSED

}
