package dev.java10x.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;

import java.util.List;

// Entity Transforma uma classe em entidade do banco de dados
// JPA = JAVA PERSISTENCE API
@Entity
@Table(name = "tb_cadastro")

public class NinjaModel {

    @Id // Se relaciona com o atributo abaixo mais proximo
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usado juntamente com o @ID para gerar na estrategia identity
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private List<MissoesModel> missoes;

    public NinjaModel() {
    }

    public NinjaModel(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
