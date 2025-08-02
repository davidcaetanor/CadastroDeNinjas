package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String name;
    private String email;
    private MissoesModel missoes;
    private String rank;
    private Integer age;

}
