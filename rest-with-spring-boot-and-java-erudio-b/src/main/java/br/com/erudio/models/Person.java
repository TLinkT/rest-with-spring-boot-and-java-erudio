package br.com.erudio.models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Data
@AllArgsConstructor
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
}
