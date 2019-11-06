package org.springframework.internalrestapi.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "characteristics")
@EntityListeners(AuditingEntityListener.class)
public class Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    private Long characterid;

    @NotBlank
    private  String eye_color;

    @NotBlank
    private String hair_color;

    @NotBlank
    private String hair_length;

    @NotBlank
    private String skin_color;

    @NotBlank
    private String height;

    @NotBlank
    private String weight;

    @NotBlank
    private boolean gender;
}
