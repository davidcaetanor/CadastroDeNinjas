package dev.java10x.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dificult")
    private String dificult;

    //   Garante que uma missao poderá ter varios ninja
    @OneToMany(mappedBy = "missoes") // pegando a anotaçao do missoes no cadastro de ninjas
    // FAZ O arquivo ignorar essa parte quando tratar o json
    @JsonIgnore
    private List<NinjaModel> ninjas;

}
