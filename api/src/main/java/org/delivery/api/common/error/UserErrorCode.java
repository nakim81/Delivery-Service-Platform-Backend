package org.delivery.api.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/*
* 1~ Error Code for user side
*/
@AllArgsConstructor
@Getter
public enum UserErrorCode implements ErrorCodeIfs {

    USER_NOT_FOUND(400, 1404, "User Not Found"),
    ;

    private final Integer httpStatusCode;
    private final Integer errorCode;
    private final String description;
}
