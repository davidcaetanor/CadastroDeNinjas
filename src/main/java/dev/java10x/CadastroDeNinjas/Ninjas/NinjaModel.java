package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

// Entity Transforma uma classe em entidade do banco de dados
// JPA = JAVA PERSISTENCE API
@Entity
@Table(name = "tb_cadastro")

// Usando as Annotations do Lombok para criar os construtores
@Data // Puxa os getters e setters
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id // Se relaciona com o atributo abaixo mais proximo
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usado o @ID para gerar na estrategia identity
    @Column(name = "ID")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(unique = true, name = "email") // Garante endereço unico dentro dessa coluna
    private String email;

    //   @ManyToOne garante que um ninja poderá ter uma missão
    @ManyToOne()
    @JoinColumn(name = "missoes_id") //Nova coluna para a Foreign key
    private MissoesModel missoes;

}
