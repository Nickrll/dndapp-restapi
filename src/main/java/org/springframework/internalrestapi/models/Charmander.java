package org.springframework.internalrestapi.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "player_character")
@EntityListeners(AuditingEntityListener.class)
public class Charmander {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String architype;

    @NotBlank
    private String race;

    @NotBlank
    private Long current_hp;

    @NotBlank
    private Long max_hp;

    @NotBlank
    private String background;

    @NotBlank
    private String alignment;

    @NotBlank
    private String religion;

    @NotBlank
    private Long xp;

    @NotBlank
    private String subArchitype;

    @NotBlank
    private Long death_Succes;

    @NotBlank
    private Long death_failure;

    @OneToOne
    @JoinColumn(name = "inventoryid")
    private Inventory inventory;

    public Charmander() {}


}
