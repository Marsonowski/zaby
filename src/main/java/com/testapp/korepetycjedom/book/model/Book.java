package com.testapp.korepetycjedom.book.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
}

//public class User {
//    private String password;
//}

// BookEntity - on zapisywany do bazy danych
// BookResponseDTO - on bedzie zwracany z controllera
// BookDataDTO - bedzie wysylany do kontrolera
