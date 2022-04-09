package barsystem2.barsystem2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="first_name",nullable = false)
    private String firstName;

    @NotNull
    @Column(name="last_name",nullable = false)
    private String lastName;

    @NotNull
    @Column(nullable=false,length=10)
    private String phone;

    @ManyToOne
    private EmployeeType type;
}
