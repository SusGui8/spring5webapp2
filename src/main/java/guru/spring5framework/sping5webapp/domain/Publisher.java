package guru.spring5framework.sping5webapp.domain;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String namePublisher;
    private String addressLine;
    private String city;
    private String state;
    private String zip;

    @OneToMany
    @JoinColumn(name="publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher(String namePublisher, String addressLine, String city, String state, String zip) {
        this.namePublisher = namePublisher;
        this.id = id;
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Publisher() {

    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(id, publisher.id) && Objects.equals(namePublisher, publisher.namePublisher) && Objects.equals(addressLine, publisher.addressLine) && Objects.equals(city, publisher.city) && Objects.equals(state, publisher.state) && Objects.equals(zip, publisher.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namePublisher, addressLine, city, state, zip);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", namePublisher='" + namePublisher + '\'' +
                ", addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
