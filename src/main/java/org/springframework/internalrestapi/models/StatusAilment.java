package org.springframework.internalrestapi.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "status_ailment")
@EntityListeners(AuditingEntityListener.class)
public class StatusAilment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private Long level;

    public StatusAilment() {}
}
