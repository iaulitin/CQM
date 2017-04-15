package org.cqm.web.config.Validator;

import org.cqm.data.entity.Report;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ReportValidator implements Validator{

    @Override
    public boolean supports(Class aClass) {
        return Report.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Report report = (Report)target;

        if("NONE".equals(report.getLoad())){
            errors.rejectValue("load", "required.load", "Не выбрана загрузка");
        }
        if("NONE".equals(report.getCafeName())){
            errors.rejectValue("cafeName", "required.cafeName", "Не выбрана столовая");
        }
    }
}