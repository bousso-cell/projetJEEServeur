package com.example.projetjee.Busso;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeMouvement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codeTypeMvt;
    private String libelleTypeMvt;
    private long prixTypeMvt;

    public TypeMouvement(String libelleTypeMvt, long prixTypeMvt) {
        this.libelleTypeMvt = libelleTypeMvt;
        this.prixTypeMvt = prixTypeMvt;
    }

    public TypeMouvement() {

    }

    @Override
    public String toString() {
        return "TypeMouvement{" +
                "codeTypeMvt='" + codeTypeMvt + '\'' +
                ", libelleTypeMvt='" + libelleTypeMvt + '\'' +
                ", prixTypeMvt=" + prixTypeMvt +
                '}';
    }

    public String getLibelleTypeMvt() {
        return libelleTypeMvt;
    }

    public void setLibelleTypeMvt(String libelleTypeMvt) {
        this.libelleTypeMvt = libelleTypeMvt;
    }

    public long getPrixTypeMvt() {
        return prixTypeMvt;
    }

    public void setPrixTypeMvt(long prixTypeMvt) {
        this.prixTypeMvt = prixTypeMvt;
    }

    public void setCodeTypeMvt(long codeTypeMvt) {
        this.codeTypeMvt = codeTypeMvt;
    }

    public long getCodeTypeMvt() {
        return codeTypeMvt;
    }
}
