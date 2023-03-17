package expertostechdio.livelombok.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "cliente")
@Data
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String nome;
    private String endereco;
    @ManyToOne(cascade = CascadeType.ALL)
    private PedidoModel pedido;

}
