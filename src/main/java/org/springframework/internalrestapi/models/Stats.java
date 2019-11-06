package org.springframework.internalrestapi.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "stats")
@EntityListeners(AuditingEntityListener.class)
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @NotBlank
    private Long characterid;

    @NotBlank
    private Long str_val;

    @NotBlank
    private Long dex_val;

    @NotBlank
    private Long cons_val;

    @NotBlank
    private Long int_val;

    @NotBlank
    private Long wis_var;

    @NotBlank Long cha_var;

    public Stats() {}

    public Long getId() {
        return id;
    }

    public Long getCharacterid() {
        return characterid;
    }

    public void setCharacterid(Long characterid) {
        this.characterid = characterid;
    }

    public Long getStr_val() {
        return str_val;
    }

    public void setStr_val(Long str_val) {
        this.str_val = str_val;
    }

    public Long getDex_val() {
        return dex_val;
    }

    public void setDex_val(Long dex_val) {
        this.dex_val = dex_val;
    }

    public Long getCons_val() {
        return cons_val;
    }

    public void setCons_val(Long cons_val) {
        this.cons_val = cons_val;
    }

    public Long getInt_val() {
        return int_val;
    }

    public void setInt_val(Long int_val) {
        this.int_val = int_val;
    }

    public Long getWis_var() {
        return wis_var;
    }

    public void setWis_var(Long wis_var) {
        this.wis_var = wis_var;
    }

    public Long getCha_var() {
        return cha_var;
    }

    public void setCha_var(Long cha_var) {
        this.cha_var = cha_var;
    }
}
