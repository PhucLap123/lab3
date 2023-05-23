package luphuclap.demo.repository;

import luphuclap.demo.entity.Book;
import luphuclap.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepository extends JpaRepository<Category,Long> {
}