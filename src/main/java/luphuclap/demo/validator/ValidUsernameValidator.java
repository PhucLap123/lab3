package luphuclap.demo.validator;


import jakarta.validation.ConstraintValidatorContext;
import luphuclap.demo.repository.IUserRepository;
import jakarta.validation.ConstraintValidator;
import luphuclap.demo.validator.annotation.ValidUsername;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername,String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String name , ConstraintValidatorContext context)
    {
        if(userRepository == null)
        {
            return true;
        }
        return userRepository.findByUsername(name)==null;
    }

}
