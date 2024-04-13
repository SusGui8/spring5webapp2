package guru.spring5framework.sping5webapp.bootstrap;

import guru.spring5framework.sping5webapp.domain.Author;
import guru.spring5framework.sping5webapp.domain.Book;
import guru.spring5framework.sping5webapp.domain.Publisher;
import guru.spring5framework.sping5webapp.repositories.AuthorRepository;
import guru.spring5framework.sping5webapp.repositories.BookRepository;
import guru.spring5framework.sping5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in BootStrap");

        Publisher publisher = new Publisher("Mike","address Line 1", "Milano","Italy","zip");

        publisherRepository.save(publisher);
        System.out.println("Started in BootStrap");
        System.out.println("Publisher " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domani Driver Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEjbs = new Book("J2EE Development without EJB", "393393939");
        rod.getBooks().add(noEjbs);
        noEjbs.getAuthors().add(rod);

        noEjbs.setPublisher(publisher);
        publisher.getBooks().add(noEjbs);

        authorRepository.save(rod);
        bookRepository.save(noEjbs);
        publisherRepository.save(publisher);


        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher number of Books: " + publisher.getBooks().size());

    }

}
