package luphuclap.demo.services;


import luphuclap.demo.entity.Book;
import luphuclap.demo.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private bookRepository bookRepository;
    public List<Book> getAllBooks(){
        return bookRepository.findAll();

    }

    public Book getBookById(Long id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }

    public void addBook(Book book)
    {
        bookRepository.save(book);
    }

    public void updateBook(Book book)
    {
        bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

}
