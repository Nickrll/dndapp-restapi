package org.springframework.internalrestapi.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "inventory")
@EntityListeners(AuditingEntityListener.class)
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

/*    @NotBlank
    private Long characterid;*/

    @NotBlank
    private Long copper_amount;

    @NotBlank
    private Long silver_amount;

    @NotBlank
    private Long gold_amount;

    @NotBlank
    private Long platinum_amount;

    @OneToOne
    @JoinColumn(name = "characterid")
    private Charmander character;

    public Inventory() {}

}
