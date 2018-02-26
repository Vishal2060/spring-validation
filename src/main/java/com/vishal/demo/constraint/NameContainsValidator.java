package com.vishal.demo.constraint;

import com.vishal.demo.model.Book;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class NameContainsValidator implements ConstraintValidator<NameContains, Book> {

    String substring;

    @Override
    public void initialize(NameContains constraintAnnotation) {
        this.substring = constraintAnnotation.substring();
    }

    @Override
    public boolean isValid(Book value, ConstraintValidatorContext context) {
        System.out.println("in validator : "+value.getName().contains(substring));
        return value.getName().contains(substring);
    }
}
