package com.example.gamestack;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TrialEntity{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id", nullable = false )
    private Long id;

    private String username;
    private String password;

}
