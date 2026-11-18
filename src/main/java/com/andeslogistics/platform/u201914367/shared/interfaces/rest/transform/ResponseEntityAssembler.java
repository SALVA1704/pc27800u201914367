package com.andeslogistics.platform.u201914367.shared.interfaces.rest.transform;

import com.andeslogistics.platform.u201914367.shared.application.result.ApplicationError;
import com.andeslogistics.platform.u201914367.shared.application.result.Result;
import com.andeslogistics.platform.u201914367.shared.interfaces.rest.transform.ErrorResponseAssembler;
import org.jspecify.annotations.NullMarked;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.function.Function;

@NullMarked
public final class ResponseEntityAssembler {

    private ResponseEntityAssembler() {
    }


    public static <T, R> ResponseEntity<?> toResponseEntityFromResult(
            Result<T, ApplicationError> result,
            Function<T, R> successResourceAssembler,
            HttpStatusCode successStatus
    ) {
        return switch (result) {
            case Result.Success<T, ApplicationError> success ->
                    new ResponseEntity<>(successResourceAssembler.apply(success.value()), successStatus);
            case Result.Failure<T, ApplicationError> failure ->
                    ErrorResponseAssembler.toErrorResponseFromApplicationError(failure.error());
        };
    }
}
