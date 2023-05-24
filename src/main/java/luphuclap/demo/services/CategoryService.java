package luphuclap.demo.services;


import luphuclap.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import luphuclap.demo.repository.categoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private categoryRepository categoryRepository;


    public List<Category> getAllCategories(){ return  categoryRepository.findAll();}
    public Category getCategoryById(Long id)
    {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        }else{
            throw new RuntimeException("Category not found");
        }
    }

    public Category saveCategory(Category category){ return categoryRepository.save(category);}
    public Category createCategory(Category category){ return categoryRepository.save(category);}
    public  void  updateCategory(Category category) { categoryRepository.save(category);}
    public void deleteCategory(Long id) { categoryRepository.deleteById(id);}

}
