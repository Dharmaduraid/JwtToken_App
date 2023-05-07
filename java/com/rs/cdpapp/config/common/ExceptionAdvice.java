/**
 * 
 */
package com.rs.cdpapp.config.common;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rs.cdpapp.config.dto.ApiResponseDto;

/**
 * @author FAsupport2
 *
 */
@RestControllerAdvice(basePackages = "com.rs.cdpapp")
public class ExceptionAdvice {

	/**
     * for {@code @RequestBody}
     */
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ApiResponseDto<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        StringBuilder sb = new StringBuilder("valid err:");
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            sb.append(fieldError.getField()).append("：").append(fieldError.getDefaultMessage()).append(", ");
        }
        String msg = sb.toString();
        if (StringUtils.hasText(msg)) {
            return ApiResponseDto.failed(-1, msg);
        }
        return ApiResponseDto.failed(-1, "MethodArgumentNotValid");
    }

    /**
     * for {@code @PathVariable} 和 {@code @RequestParam}
     */
    @ExceptionHandler({ConstraintViolationException.class})
    public ApiResponseDto<?> handleConstraintViolationException(ConstraintViolationException ex) {
        if (StringUtils.hasText(ex.getMessage())) {
            return ApiResponseDto.failed(-1, ex.getMessage());
        }
        return ApiResponseDto.failed(-1, "ConstraintViolation");
    }

    /**
     * Handle all Exception without being handled by internal
     */
    @ExceptionHandler({Exception.class})
    public ApiResponseDto<?> handle(Exception ex) {
        return ApiResponseDto.failed(500, "Internal Server Error");
    }
}
