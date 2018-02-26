package com.vishal.demo.model;

import com.vishal.demo.constraint.NameContains;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "book")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Builder

@NameContains(substring = "Hitler")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Integer id;

    @Column(name = "book_name")
    @NotNull(message = "Book Name cannot be empty")
    private String name;

    @Column(name = "description")
    @NotNull(message = "Book Description cannot be empty")
    @Min(value = 2,message = "Too Minimum")
    private String description;

    @Column(name = "author")
    @NotNull(message = "Book Author cannot be empty")
    @Pattern(regexp = "[a-zA-Z ]+", message = "Invalid author name")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Book Price cannot be empty")
    @DecimalMin(value = "50.00" , message="Lower Than Minimun Price")
    private Double price;

    @Column(name = "page_count")
    @NotNull(message = "Book Page Count cannot be empty")
    private Integer pages;
}
