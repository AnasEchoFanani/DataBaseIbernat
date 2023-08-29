package p1;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Cate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomCat;

    public Cate() {
    }

    public Cate(String nomCat) {
        this.nomCat = nomCat;
    }

    public Cate(int id, String nomCat) {
        this.id = id;
        this.nomCat = nomCat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }
}
