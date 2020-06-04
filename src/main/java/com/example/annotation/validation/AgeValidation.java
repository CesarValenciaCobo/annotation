package com.example.annotation.validation;

import com.example.annotation.model.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class AgeValidation implements ConstraintValidator<Age, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        if(user.getBirthday() == null || user.getAge() == null) return false;
        Period p = Period.between(convertToLocalDateViaInstant(user.getBirthday()), LocalDate.now());
        return p.getYears() == user.getAge();
    }

    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }


    @Override
    public void initialize(Age constraintAnnotation) {

    }
}