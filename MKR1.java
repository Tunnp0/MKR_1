import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public enum AgeGroup {
    CHILD, TEEN, ADULT, OTHER;

}

public enum Language {
    ENGLISH, GERMAN, FRENCH, SPANISH, JAPANESE, UKRAINIAN, OTHER;

}

class User {
    protected long id;
    protected String email;
    protected String password;
    protected String name;


    public User() {}


    public User(long id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id &&
               Objects.equals(email, user.email) &&
               Objects.equals(password, user.password) &&
               Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, name);
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", email='" + email + '\'' +
               ", password='" + password + '\'' +
               ", name='" + name + '\'' +
               '}';
    }
}


class Employee extends User {
    private String phone;
    private LocalDate birthDate;


    public Employee() {
        super();
    }


    public Employee(long id, String email, String password, String name, String phone, LocalDate birthDate) {
        super(id, email, password, name);
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(phone, employee.phone) &&
               Objects.equals(birthDate, employee.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phone, birthDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
               "phone='" + phone + '\'' +
               ", birthDate=" + birthDate +
               "} " + super.toString();
    }
}

class Client extends User {
    private BigDecimal balance;

    public Client() {
        super();
    }

    public Client(long id, String email, String password, String name, BigDecimal balance) {
        super(id, email, password, name);
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(balance, client.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), balance);
    }

    @Override
    public String toString() {
        return "Client{" +
               "balance=" + balance +
               "} " + super.toString();
    }
}
class Order {
    private long id;
    private long clientId;
    private long employeeId;
    private long bookId;
    private int numberOfBooks;
    private LocalDateTime orderDate;
    private BigDecimal price;

    public Order() {}

    public Order(long id, long clientId, long employeeId, long bookId, int numberOfBooks,
                 LocalDateTime orderDate, BigDecimal price) {
        this.id = id;
        this.clientId = clientId;
        this.employeeId = employeeId;
        this.bookId = bookId;
        this.numberOfBooks = numberOfBooks;
        this.orderDate = orderDate;
        this.price = price;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public long getClientId() { return clientId; }
    public void setClientId(long clientId) { this.clientId = clientId; }

    public long getEmployeeId() { return employeeId; }
    public void setEmployeeId(long employeeId) { this.employeeId = employeeId; }

    public long getBookId() { return bookId; }
    public void setBookId(long bookId) { this.bookId = bookId; }

    public int getNumberOfBooks() { return numberOfBooks; }
    public void setNumberOfBooks(int numberOfBooks) { this.numberOfBooks = numberOfBooks; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id &&
               clientId == order.clientId &&
               employeeId == order.employeeId &&
               bookId == order.bookId &&
               numberOfBooks == order.numberOfBooks &&
               Objects.equals(orderDate, order.orderDate) &&
               Objects.equals(price, order.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, employeeId, bookId, numberOfBooks, orderDate, price);
    }


    @Override
    public String toString() {
        return "Order{" +
               "id=" + id +
               ", clientId=" + clientId +
               ", employeeId=" + employeeId +
               ", bookId=" + bookId +
               ", numberOfBooks=" + numberOfBooks +
               ", orderDate=" + orderDate +
               ", price=" + price +
               '}';
    }
}

class Book {
    private long id;
    private String name;
    private String genre;
    private AgeGroup ageGroup;
    private BigDecimal price;
    private LocalDate publicationYear;
    private String author;
    private int numberOfPages;
    private String characteristics;
    private String description;
    private Language language;


    public Book() {}


    public Book(long id, String name, String genre, AgeGroup ageGroup, BigDecimal price,
                LocalDate publicationYear, String author, int numberOfPages,
                String characteristics, String description, Language language) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.ageGroup = ageGroup;
        this.price = price;
        this.publicationYear = publicationYear;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.characteristics = characteristics;
        this.description = description;
        this.language = language;
    }


    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public AgeGroup getAgeGroup() { return ageGroup; }
    public void setAgeGroup(AgeGroup ageGroup) { this.ageGroup = ageGroup; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public LocalDate getPublicationYear() { return publicationYear; }
    public void setPublicationYear(LocalDate publicationYear) { this.publicationYear = publicationYear; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getNumberOfPages() { return numberOfPages; }
    public void setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }

    public String getCharacteristics() { return characteristics; }
    public void setCharacteristics(String characteristics) { this.characteristics = characteristics; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Language getLanguage() { return language; }
    public void setLanguage(Language language) { this.language = language; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id &&
               numberOfPages == book.numberOfPages &&
               Objects.equals(name, book.name) &&
               Objects.equals(genre, book.genre) &&
               ageGroup == book.ageGroup &&
               Objects.equals(price, book.price) &&
               Objects.equals(publicationYear, book.publicationYear) &&
               Objects.equals(author, book.author) &&
               Objects.equals(characteristics, book.characteristics) &&
               Objects.equals(description, book.description) &&
               language == book.language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, ageGroup, price, publicationYear, author, numberOfPages, characteristics, description, language);
    }

    @Override
    public String toString() {
        return "Book{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", genre='" + genre + '\'' +
               ", ageGroup=" + ageGroup +
               ", price=" + price +
               ", publicationYear=" + publicationYear +
               ", author='" + author + '\'' +
               ", numberOfPages=" + numberOfPages +
               ", characteristics='" + characteristics + '\'' +
               ", description='" + description + '\'' +
               ", language=" + language +
               '}';
    }
}


