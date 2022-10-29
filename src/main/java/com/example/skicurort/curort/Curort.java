package com.example.skicurort.curort;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "curort")
public class Curort {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Max(value = 100, message = "Name should not be greater than 100")
  @NotNull(message = "Name cannot be empty")
  @Column(name = "curort_name")
  private String curortName;

  @NotNull(message = "Address cannot be empty")
  @Column(name = "curort_address")
  private String curortAdress;

  @Column(name = "curort_email")
  @Email(message = "Email invalid")
  private String currortEmail;

  @NotNull(message = "Phone number cannot be empty")
  @Column(name = "curort_phone")
  private Long curortPhonenumber;

  // TODO adding relation to person
  // @OneToMany
  // private <List> Person;
  // TODO adding relation to person
  // @OneToMany
  // private <List> Shop;

}
