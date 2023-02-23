# Spring_Hibernate_Course

This repository serves as a sandbox where I learned the basics of **Spring** and **Hibernate** frameworks. It contains various examples and exercises that I used to familiarize myself with these technologies.

## Technologies Used

The main technologies used in this repository are:

- **Spring Framework**: a popular Java framework for building web applications.
- **Hibernate**: an object-relational mapping (ORM) library for Java.

## Contributions

As this repository serves as a personal sandbox, I am not currently accepting contributions. However, feel free to use the code in your own projects or as a reference for learning. If you find any issues or errors in the code, please feel free to create an issue and I will do my best to address it.

## Conclusion

I created this repository to learn the basics of Spring and Hibernate and to have a place to practice my skills. I hope that this repository can be helpful to others who are also learning these technologies.


# HIBERNATE
Hibernate to popularny framework ORM (Object-Relational Mapping), który ułatwia mapowanie obiektów Java na bazy danych relacyjne. W Hibernate występuje wiele adnotacji, które pozwalają na dostosowanie sposobu mapowania oraz ułatwiają pracę z frameworkiem. Poniżej przedstawione są najważniejsze z nich:

1. @Entity - adnotacja umieszczana przed nazwą klasy, która informuje Hibernate, że klasa ta reprezentuje tabelę w bazie danych.
2. @Table - adnotacja umieszczana przed nazwą klasy lub pola, która umożliwia określenie nazwy tabeli w bazie danych, do której mapowany jest obiekt.
3. @Id - adnotacja umieszczana przed polami, które reprezentują klucz główny tabeli w bazie danych.
4. @GeneratedValue - adnotacja umieszczana przed polem, które reprezentuje klucz główny tabeli i określa sposób generowania jego wartości.
5. @Column - adnotacja umieszczana przed polami, która umożliwia określenie nazwy kolumny w tabeli, do której mapowany jest obiekt oraz jej właściwości, takie jak długość, precyzja czy wartości domyślne.
6. @ManyToOne - adnotacja umieszczana przed polami, które reprezentują relację wiele do jednego pomiędzy dwoma tabelami w bazie danych.
7. @OneToOne - adnotacja umieszczana przed polami, które reprezentują relację jeden do jednego pomiędzy dwoma tabelami w bazie danych.
8. @OneToMany - adnotacja umieszczana przed polami, które reprezentują relację jeden do wielu pomiędzy dwoma tabelami w bazie danych.
9. @ManyToMany - adnotacja umieszczana przed polami, które reprezentują relację wiele do wielu pomiędzy dwoma tabelami w bazie danych.
10. @JoinTable - adnotacja umieszczana przed polami, które reprezentują relację wiele do wielu pomiędzy dwoma tabelami i umożliwia określenie tabeli pośredniczącej w tej relacji.
11. @JoinColumn - adnotacja umieszczana przed polami, które reprezentują klucz obcy tabeli w bazie danych i umożliwia określenie nazwy kolumny, która przechowuje klucz obcy.
12. @Embedded - adnotacja umieszczana przed polem, które reprezentuje złożony typ danych, który powinien być zapisany jako pojedyncza kolumna w tabeli, ale składa się z kilku pól.
13. @Transient - adnotacja umieszczana przed polem, które nie powinno być mapowane do kolumny w tabeli w bazie danych, ponieważ jest tymczasowe i nie ma wartości do trwałego przechowywania.
Te adnotacje są tylko częścią funkcjonalności, jaką oferuje Hibernate, ale stanowią kluczowe narzędzie do mapowania obiektów Java na bazy danych relacyjne.

## 1. @Entity

Adnotacja @Entity to jedna z podstawowych adnotacji w Hibernate, która informuje framework, że klasa Java reprezentuje encję (tabelę) w bazie danych. Encja to pojęcie związanego z ORM, które oznacza obiekt w aplikacji, który jest mapowany na odpowiadającą mu tabelę w bazie danych.
Aby oznaczyć klasę jako encję, wystarczy dodać adnotację @Entity nad deklaracją klasy, na przykład:

```
@Entity
public class User {
// pola klasy 
}
```

W powyższym przykładzie klasa User została oznaczona jako encja, co oznacza, że framework Hibernate będzie ją mapował na tabelę w bazie danych o tej samej nazwie. Jeśli nazwa tabeli ma być inna niż nazwa klasy, można użyć adnotacji @Table w celu określenia właściwej nazwy tabeli.
Ważną cechą adnotacji @Entity jest to, że wymaga ona, aby klasa miała co najmniej jedno pole oznaczone adnotacją @Id, które będzie służyło jako klucz główny (primary key) encji. Klucz główny to unikalny identyfikator rekordu w tabeli, który pozwala na jego jednoznaczną identyfikację i odwołanie się do niego.

```
@Entity
public class User {
  @Id
  private Long id;
  private String firstName;

   private String lastName; private String email;
  // pozostałe pola klasy
}
```

W powyższym przykładzie pole "id" zostało oznaczone adnotacją @Id i będzie służyło jako klucz główny dla encji User. Framework Hibernate automatycznie będzie generował wartości dla tego pola podczas zapisywania nowych rekordów do bazy danych, w zależności od zastosowanej strategii generowania klucza głównego (np. AUTO, IDENTITY, SEQUENCE itp.).

Podsumowując, adnotacja @Entity jest niezbędna do oznaczenia klas Java, które mają być mapowane na encje w bazie danych. Dodatkowo wymusza ona deklarację przynajmniej jednego pola jako klucza głównego dla encji.

Adnotacja @Column może przyjmować wiele parametrów, które umożliwiają dokładne określenie właściwości kolumny w tabeli bazy danych, do której jest mapowany obiekt. Oto kilka przykładów parametrów, jakie można przekazać do adnotacji @Column:
Oczywiście, oto lista popularnych atrybutów adnotacji @Column i ich krótkie przykłady:

1. name - określa nazwę kolumny w tabeli Przykład: @Column(name = "last_name")
2. nullable - określa, czy wartość kolumny może być pusta (true) lub nie (false)
Przykład: @Column(nullable = false)
3. unique - określa, czy wartości w kolumnie muszą być unikalne (true) czy nie (false)
Przykład: @Column(unique = true)
4. length - określa maksymalną długość kolumny
Przykład: @Column(length = 50)
5. precision - określa dokładność (liczbę cyfr) dla wartości numerycznych
Przykład: @Column(precision = 10)
6. scale - określa ilość cyfr po przecinku dla wartości numerycznych
Przykład: @Column(scale = 2)
7. insertable - określa, czy wartość kolumny może być ustawiona podczas wstawiania rekordu (true) czy nie (false)
Przykład: @Column(insertable = false)
8. updatable - określa, czy wartość kolumny może być aktualizowana (true) czy nie (false)
Przykład: @Column(updatable = false)
9. columnDefinition - określa wyrażenie SQL, które definiuje typ danych i właściwości kolumny
Przykład: @Column(columnDefinition = "VARCHAR(255) DEFAULT 'N/ A'")
10. table - określa nazwę tabeli, do której należy kolumna (gdy jest ona zdefiniowana na poziomie klasy)
Przykład: @Column(table = "employees")

Te parametry umożliwiają dokładne dostosowanie mapowania obiektów do kolumn w tabelach bazy danych, co pozwala na lepszą kontrolę nad danymi zapisywanymi i odczytywanymi z bazy danych.

## 2. @Table

Adnotacja @Table jest używana w Hibernate do określenia nazwy tabeli, do której ma zostać zmapowana dana encja. Można jej użyć, aby nadpisać domyślną nazwę tabeli, która jest generowana na podstawie nazwy klasy.

```
@Entity
@Table(name = "my_table") public class User {
  // pola klasy 
}
```

W powyższym przykładzie klasa User została oznaczona adnotacją @Entity, ale dodatkowo użyto adnotacji @Table, aby określić, że encja ma być mapowana do tabeli o nazwie "my_table". Adnotacja @Table umożliwia również określenie innych opcji, takich jak nazwa schematu (dla baz danych, które obsługują wiele schematów), nazwy kolumn i innych atrybutów.

```
@Entity
@Table(name = "users", schema = "public") public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column(name = "user_id")
  private Long id;
  
  @Column(name = "first_name") 
  private String firstName;

  @Column(name = "last_name") 
  private String lastName;
  
  @Column(name = "email") 
  private String email;
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie dodatkowo użyto adnotacji @Column, aby określić nazwy kolumn w tabeli dla poszczególnych pól klasy User. Adnotacja @Column pozwala również na określenie innych opcji, takich jak typ kolumny, czy jej ograniczenia.
Podsumowując, adnotacja @Table umożliwia nadpisanie domyślnej nazwy tabeli i określenie innych atrybutów dla encji, takich jak nazwa schematu i nazwy kolumn.

## 3. @Id

Adnotacja @Id jest używana w Hibernate do oznaczania pola klasy, które ma służyć jako klucz główny (primary key) dla encji. Klucz główny to unikalny identyfikator rekordu w tabeli, który pozwala na jego jednoznaczną identyfikację i odwołanie się do niego.

```
@Entity
public class User {
  @Id
  private Long id;
  
  private String firstName;
  
  private String lastName; 
  
  private String email;
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie pole "id" zostało oznaczone adnotacją @Id i będzie służyło jako klucz główny dla encji User. Framework Hibernate automatycznie będzie generował wartości dla tego pola podczas zapisywania nowych rekordów do bazy danych, w zależności od zastosowanej strategii generowania klucza głównego (np. AUTO, IDENTITY, SEQUENCE itp.).Adnotacja @Id może być również użyta w połączeniu z adnotacją @GeneratedValue, aby określić sposób generowania wartości klucza głównego.

```
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  private String firstName; 
  
  private String lastName; 
  
  private String email;
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie dodano adnotację @GeneratedValue, aby określić, że wartość klucza głównego będzie generowana automatycznie przez bazę danych przy użyciu strategii IDENTITY.
Podsumowując, adnotacja @Id służy do oznaczania pola klasy, które będzie służyć jako klucz główny dla encji. Może być użyta z adnotacją @GeneratedValue, aby określić sposób generowania wartości klucza głównego.

## 4. @GeneratedValue
Adnotacja @GeneratedValue jest używana w Hibernate do określenia sposobu generowania wartości klucza głównego (primary key) dla encji. Jest często używana w połączeniu z adnotacją @Id, aby automatycznie generować wartości klucza głównego podczas zapisywania nowych rekordów do bazy danych.

```
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  private String firstName; 
  
  private String lastName; 
  
  private String email;
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie dodano adnotację @GeneratedValue i określono w niej strategię generowania klucza głównego jako IDENTITY. Oznacza to, że wartość klucza głównego będzie automatycznie generowana przez bazę danych podczas wstawiania nowych rekordów do tabeli.
W Hibernate dostępne są różne strategie generowania klucza głównego, takie jak:

- IDENTITY - wartość klucza głównego jest generowana przez bazę danych podczas wstawiania rekordu do tabeli, zwykle w oparciu o typ kolumny
- AUTO_INCREMENT lub SERIAL
- SEQUENCE - wartość klucza głównego jest generowana przez sekwencję w bazie danych
- TABLE - wartość klucza głównego jest pobierana z osobnej tabeli w bazie danych
- AUTO - Hibernate automatycznie wybiera strategię generowania klucza głównego w zależności od bazy danych i dostępnych strategii

```
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
  @SequenceGenerator(name = "product_seq", sequenceName = "product_sequence")
  private Long id;
  
  private String name; 
  
  private double price; 
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie użyto strategii generowania klucza głównego SEQUENCE, gdzie wartość klucza jest pobierana z sekwencji o nazwie "product_sequence". Dodatkowo użyto adnotacji @SequenceGenerator, aby określić, która sekwencja ma zostać użyta.
Podsumowując, adnotacja @GeneratedValue służy do określenia sposobu generowania wartości klucza głównego dla encji. Dostępne strategie generowania klucza głównego to m.in. IDENTITY, SEQUENCE, TABLE i AUTO.

## 5. @Column
Adnotacja @Column jest używana w Hibernate do mapowania pola encji na kolumnę w tabeli bazy danych. Adnotacja ta może być używana z różnymi parametrami, które pozwalają na dostosowanie sposobu mapowania kolumny. Przykładowo, możemy użyć adnotacji @Column bez parametrów, aby wskazać, że pole encji powinno być mapowane na kolumnę o tej samej nazwie w tabeli bazy danych:

```
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
  private String name;
  
  @Column
  private String description;
  
  @Column
  private double price;
  
  // konstruktory, metody dostępowe, pozostałe pola klasy 
}
```

W powyższym przykładzie każde pole klasy Product zostało oznaczone adnotacją @Column, ale bez podawania dodatkowych parametrów. Oznacza to, że każde pole będzie mapowane na kolumnę o takiej samej nazwie w tabeli bazy danych.
Możemy również użyć różnych parametrów adnotacji @Column, aby dostosować sposób mapowania kolumny. Na przykład, możemy użyć parametru "name" aby wskazać inną nazwę dla kolumny w tabeli bazy danych:

```
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  @Column(name = "product_name") 
  private String name;
  
  @Column
  private String description;
  
  @Column
  private double price;
  
  // konstruktory, metody dostępowe, pozostałe pola klasy 
}
```

W powyższym przykładzie pole "name" zostało oznaczone adnotacją @Column z parametrem "name", który wskazuje, że to pole powinno być mapowane na kolumnę "product_name" w tabeli bazy danych.
Innymi przydatnymi parametrami adnotacji @Column są "nullable" i "length", które pozwalają na wskazanie, czy kolumna może przyjmować wartości null oraz maksymalnej długości danych, które mogą być przechowywane w kolumnie.

Podsumowując, adnotacja @Column jest używana w Hibernate do mapowania pola encji na kolumnę w tabeli bazy danych. Adnotacja ta może być używana z różnymi parametrami, które pozwalają na dostosowanie sposobu mapowania kolumny, takich jak nazwa, czy nullable.
 
## 6. @ManyToOne

Adnotacja @ManyToOne jest używana w Hibernate, aby określić relację wiele- do-jednego (many-to-one) między dwiema encjami. Relacja ta oznacza, że wiele obiektów jednej klasy jest powiązanych z jednym obiektem innej klasy. Przykładowo, załóżmy, że mamy dwie encje: Product i Category, gdzie wiele produktów może być przypisanych do jednej kategorii. W takim przypadku możemy użyć adnotacji @ManyToOne, aby powiązać encję Product z encją Category.

```
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
  private String name; private double price;
  
  @ManyToOne
  @JoinColumn(name = "category_id") private Category category;
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie dodano pole "category", które reprezentuje kategorię, do której przypisany jest dany produkt. Użyto adnotacji @ManyToOne, aby powiązać encję Product z encją Category. Dodatkowo, użyto adnotacji @JoinColumn, aby określić nazwę kolumny, która będzie przechowywać klucz obcy kategorii w tabeli produktów.

```
@Entity
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;

  private String name;

  @OneToMany(mappedBy = "category") 
  private List<Product> products;

  // pozostałe pola klasy
}
```

W encji Category dodano pole "products", które reprezentuje listę produktów przypisanych do danej kategorii. Użyto adnotacji @OneToMany, aby określić relację jeden-do-wielu między encjami Product i Category. Dodatkowo, użyto parametru "mappedBy", aby wskazać nazwę pola w encji Product, które odnosi się do kategorii.
Podsumowując, adnotacja @ManyToOne służy do określenia relacji wiele-do- jednego między dwiema encjami. Używana jest w przypadku, gdy wiele obiektów jednej klasy jest powiązanych z jednym obiektem innej klasy. Aby zdefiniować tę relację w Hibernate, można użyć adnotacji @ManyToOne i @OneToMany.

## 7. @OneToOne

Adnotacja @OneToOne jest używana w Hibernate, aby określić relację jeden- do-jednego (one-to-one) między dwiema encjami. Relacja ta oznacza, że jeden obiekt jednej klasy jest powiązany z jednym obiektem innej klasy.
Przykładowo, załóżmy, że mamy dwie encje: User i Address, gdzie jeden użytkownik może mieć tylko jeden adres. W takim przypadku możemy użyć adnotacji @OneToOne, aby powiązać encję User z encją Address.

```
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
  private String name;
  
  @OneToOne
  @JoinColumn(name = "address_id") 
  private Address address;
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie dodano pole "address", które reprezentuje adres użytkownika, do encji User. Użyto adnotacji @OneToOne, aby powiązać encję User z encją Address. Dodatkowo, użyto adnotacji @JoinColumn, aby określić nazwę kolumny, która będzie przechowywać klucz obcy adresu w tabeli użytkowników.

```
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;

  private String street; 
  
  private String city; 
  
  private String zipCode;
  
  @OneToOne(mappedBy = "address")
  private User user;
  
  // pozostałe pola klasy
}
```

W encji Address dodano pole "user", które reprezentuje użytkownika przypisanego do danego adresu. Użyto adnotacji @OneToOne, aby określić relację jeden-do-jednego między encjami User i Address. Dodatkowo, użyto parametru "mappedBy", aby wskazać nazwę pola w encji User, które odnosi się do adresu.
Podsumowując, adnotacja @OneToOne służy do określenia relacji jeden-do- jednego między dwiema encjami. Używana jest w przypadku, gdy jeden obiekt jednej klasy jest powiązany z jednym obiektem innej klasy. Aby zdefiniować tę relację w Hibernate, można użyć adnotacji @OneToOne.

## 8. @OneToMany

Adnotacja @OneToMany jest używana w Hibernate, aby określić relację jeden- do-wielu (one-to-many) między dwiema encjami. Relacja ta oznacza, że jeden obiekt jednej klasy jest powiązany z wieloma obiektami innej klasy. Przykładowo, załóżmy, że mamy dwie encje: Author i Book, gdzie jeden autor może napisać wiele książek. W takim przypadku możemy użyć adnotacji @OneToMany, aby powiązać encję Author z encją Book.

```
@Entity
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  private String name;
  
  @OneToMany(mappedBy = "author")
  private Set<Book> books = new HashSet<>(); 
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie dodano pole "books", które reprezentuje książki napisane przez autora, do encji Author. Użyto adnotacji @OneToMany, aby powiązać encję Author z encją Book. Dodatkowo, użyto parametru "mappedBy", aby wskazać nazwę pola w encji Book, które odnosi się do autora.

```
@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;

  private String title;

  @ManyToOne
  @JoinColumn(name = "author_id") 
  private Author author;

  // pozostałe pola klasy
}
```

W encji Book dodano pole "author", które reprezentuje autora danej książki. Użyto adnotacji @ManyToOne, aby określić relację wiele-do-jednego między encjami Book i Author. Dodatkowo, użyto adnotacji @JoinColumn, aby określić nazwę kolumny, która będzie przechowywać klucz obcy autora w tabeli książek. Podsumowując, adnotacja @OneToMany służy do określenia relacji jeden-do- wielu między dwiema encjami. Używana jest w przypadku, gdy jeden obiekt jednej klasy jest powiązany z wieloma obiektami innej klasy. Aby zdefiniować tę relację w Hibernate, można użyć adnotacji @OneToMany.

## 9. @ManyToMany
Adnotacja @ManyToMany jest używana w Hibernate, aby określić relację wiele- do-wielu (many-to-many) między dwiema encjami. Relacja ta oznacza, że wiele obiektów jednej klasy jest powiązanych z wieloma obiektami innej klasy. Przykładowo, załóżmy, że mamy dwie encje: Student i Course, gdzie jeden student może być zapisany na wiele kursów, a jeden kurs może mieć wielu studentów. W takim przypadku możemy użyć adnotacji @ManyToMany, aby powiązać encję Student z encją Course.

```
@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "students")
  private Set<Course> courses = new HashSet<>(); 

  // pozostałe pola klasy
}
```

W powyższym przykładzie dodano pole "courses", które reprezentuje kursy, na które zapisany jest student, do encji Student. Użyto adnotacji @ManyToMany, aby powiązać encję Student z encją Course. Dodatkowo, użyto parametru "mappedBy", aby wskazać nazwę pola w encji Course, które odnosi się do studentów.

```
@Entity
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  private String name;
  
  @ManyToMany @JoinTable(name = "course_student",joinColumns = @JoinColumn(name = "course_id"), 
  inverseJoinColumns = @JoinColumn(name = "student_id"))
  private Set<Student> students = new HashSet<>();
  
  // pozostałe pola klasy 
}
```

W encji Course dodano pole "students", które reprezentuje studentów zapisanych na dany kurs. Użyto adnotacji @ManyToMany, aby określić relację wiele-do-wielu między encjami Course i Student. Dodatkowo, użyto adnotacji @JoinTable, aby określić nazwę tabeli łączącej, która przechowuje klucze obce kursów i studentów.
Podsumowując, adnotacja @ManyToMany służy do określenia relacji wiele-do- wielu między dwiema encjami. Używana jest w przypadku, gdy wiele obiektów jednej klasy jest powiązanych z wieloma obiektami innej klasy. Aby zdefiniować tę relację w Hibernate, można użyć adnotacji @ManyToMany.

## 10. @JoinTable

Adnotacja @JoinTable jest używana w Hibernate do mapowania relacji wiele- do-wielu (Many-to-Many) pomiędzy encjami. Relacja wiele-do-wielu wymaga dodatkowej tabeli łączącej, która zawiera klucze obu encji. Adnotacja @JoinTable pozwala na zdefiniowanie nazwy tej tabeli oraz nazw kolumn kluczy obu encji.
Przykładowo, załóżmy, że mamy dwie encje: User oraz Role, i chcemy zdefiniować relację wiele-do-wielu pomiędzy nimi. W tym celu należy dodać pole typu Set<Role> do encji User, oraz pole typu Set<User> do encji Role. Następnie, można użyć adnotacji @ManyToMany do oznaczenia tych pól jako elementy relacji. Adnotacja @JoinTable jest wykorzystywana do zdefiniowania tabeli łączącej:

```
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  @ManyToMany 
  @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  // pozostałe pola klasy
}
```

W powyższym przykładzie, pole "roles" klasy User jest oznaczone adnotacją @ManyToMany, która wskazuje na relację wiele-do-wielu z encją Role. Adnotacja @JoinTable jest użyta do zdefiniowania tabeli łączącej, której nazwa to "user_role". Parametry "joinColumns" i "inverseJoinColumns" wskazują nazwy kolumn kluczy obu encji w tabeli łączącej.
Analogicznie, można zdefiniować relację wiele-do-wielu z encją User w encji Role:

```
@Entity
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;

  @ManyToMany 
  @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
  private Set<User> users = new HashSet<>();

  // pozostałe pola klasy
}
```

W powyższym przykładzie, pole "users" klasy Role jest oznaczone adnotacją @ManyToMany, która wskazuje na relację wiele-do-wielu z encją User. Adnotacja @JoinTable jest użyta do zdefiniowania tabeli łączącej o nazwie "user_role", a parametry "joinColumns" i "inverseJoinColumns" wskazują nazwy kolumn kluczy obu encji w tej tabeli.

## 11. @JoinColumn
Adnotacja @JoinColumn jest używana w Hibernate do mapowania kluczy obcych w relacjach pomiędzy encjami. W przypadku relacji wiele-do-jeden (Many-to-One), adnotacja @JoinColumn jest często używana do zdefiniowania kolumny w tabeli encji źródłowej, która będzie zawierać klucz obcy do encji docelowej.
Przykładowo, załóżmy, że mamy dwie encje: Order oraz Customer, i chcemy zdefiniować relację wiele-do-jeden pomiędzy nimi. Encja Order będzie zawierać klucz obcy do encji Customer, który będzie określał klienta składającego zamówienie. Aby zdefiniować to w Hibernate, można użyć adnotacji @ManyToOne w klasie Order, która wskazuje na encję Customer, oraz adnotacji @JoinColumn, która definiuje nazwę kolumny w tabeli Order, która będzie zawierała klucz obcy do encji Customer:

```
@Entity
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  // pozostałe pola klasy
}
```

W powyższym przykładzie, pole "customer" klasy Order jest oznaczone adnotacją @ManyToOne, która wskazuje na encję Customer. Adnotacja @JoinColumn jest użyta do zdefiniowania nazwy kolumny w tabeli Order, która będzie zawierała klucz obcy do encji Customer. W tym przypadku, kolumna ta będzie nazywała się "customer_id".
Jeśli nazwa kolumny w tabeli encji źródłowej ma być taka sama jak nazwa klucza głównego encji docelowej, można pominąć atrybut "name" adnotacji @JoinColumn:

```
@Entity
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  @ManyToOne
  @JoinColumn
  private Customer customer;

   // pozostałe pola klasy
}
```

W powyższym przykładzie, adnotacja @JoinColumn nie ma atrybutu "name", ponieważ nazwa kolumny w tabeli Order ma być taka sama jak nazwa klucza głównego encji Customer.
Podsumowując, adnotacja @JoinColumn jest używana w Hibernate do zdefiniowania kolumny w tabeli encji źródłowej, która zawiera klucz obcy do encji docelowej w relacjach wiele-do-jeden (Many-to-One).

## 12. @Embedded

Adnotacja @Embedded jest używana w Hibernate do osadzania (embedding) jednej encji w drugiej. Oznacza to, że pola jednej encji są reprezentowane przez inne obiekty encji.
Przykładowo, załóżmy, że mamy encję Address, która składa się z kilku pól, takich jak ulica, kod pocztowy i miasto. Możemy osadzić tę encję w encji Person, która reprezentuje osobę.

```
@Embeddable
public class Address {
  private String street; 

  private String postalCode; 

  private String city;

  // pozostałe pola klasy
}

@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  private String firstName; 
  
  private String lastName;
  
  @Embedded
  private Address address; 
  
  // pozostałe pola klasy
}
```

W powyższym przykładzie dodano pole "address", które reprezentuje adres osoby, do encji Person. Użyto adnotacji @Embedded, aby osadzić encję Address w encji Person.
Dzięki temu, że pola Address są reprezentowane przez obiekt Address, możemy wykonywać zapytania dotyczące adresu osoby w prosty sposób.

Podsumowując, adnotacja @Embedded jest używana w Hibernate do osadzania jednej encji w drugiej. Pozwala to na reprezentowanie pól jednej encji za pomocą innych obiektów encji. Aby osadzić jedną encję w drugiej, można użyć adnotacji @Embedded.

## 13. @Transient
Adnotacja @Transient jest używana w Hibernate do oznaczania pól encji, które nie powinny być traktowane jako kolumny w tabeli bazy danych.
Czasami zdarza się, że chcemy dodać pole do encji, ale nie chcemy, aby było ono zapisywane do bazy danych. Na przykład, może to być pole tymczasowe, które jest wykorzystywane tylko w celu obliczeń lub przetwarzania danych, ale nie jest potrzebne w trwałym przechowywaniu danych.

```
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  private String name; 
  
  private String description; 
  
  private double price;
  
  @Transient
  private double discount;
  
  // konstruktory
}
```

W powyższym przykładzie dodano pole "discount" do encji Product i oznaczono je adnotacją @Transient. Oznacza to, że to pole nie będzie traktowane jako kolumna w tabeli bazy danych i nie będzie zapisywane w trwałym przechowywaniu danych.
Dzięki adnotacji @Transient możemy dodawać pola do encji, które są wykorzystywane tylko w czasie działania aplikacji, ale nie są potrzebne do trwałego przechowywania danych. Pozwala to na większą elastyczność w projektowaniu encji i aplikacji.

Podsumowując, adnotacja @Transient jest używana w Hibernate do oznaczania pól encji, które nie powinny być traktowane jako kolumny w tabeli bazy danych. Pozwala to na dodawanie pól tymczasowych lub pomocniczych do encji, które są wykorzystywane tylko w czasie działania aplikacji, ale nie są potrzebne do trwałego przechowywania danych.

