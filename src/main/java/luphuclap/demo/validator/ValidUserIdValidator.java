package luphuclap.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import luphuclap.demo.validator.annotation.ValidUserId;
import luphuclap.demo.entity.User;
public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid(User user ,ConstraintValidatorContext context)
    {
        if(user == null)
            return true;
        return user.getId() != null ;
    }


}
