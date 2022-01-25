package com.company.Annotation;

import lombok.*;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.xml.transform.Source;
import java.time.LocalDate;
import java.util.Optional;


//@Getter
//@Setter
//@ToString


@Data
@NoArgsConstructor

public class Employee implements Source {
    @NotBlank
    @Size(min = 3, max = 20)
    private String name;
    @Digits(integer = 0, fraction = 0)
    private String id;
    private LocalDate dateOfBirth;

    public Optional<@Past LocalDate> getDateOfBirth() {
        return Optional.of(dateOfBirth);
    }

    @Override
    public void setSystemId(String systemId) {

    }

    @Override
    public String getSystemId() {
        return null;
    }



/*
    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
*/

}
