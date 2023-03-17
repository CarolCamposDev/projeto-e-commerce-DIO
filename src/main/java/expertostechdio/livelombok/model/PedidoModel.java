package expertostechdio.livelombok.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "pedido")
@Data
public class PedidoModel {
    @Id
    private String id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ClienteModel cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PedidoItemModel> itens;

}
