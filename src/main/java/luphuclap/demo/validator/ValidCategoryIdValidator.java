package luphuclap.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import luphuclap.demo.entity.Category;
import luphuclap.demo.validator.annotation.ValidCategoryId;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {

    @Override
    public boolean isValid(Category category, ConstraintValidatorContext constraintValidatorContext ) {
        return category !=null && category.getId() !=null;
    }
}
