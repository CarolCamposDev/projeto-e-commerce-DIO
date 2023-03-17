package expertostechdio.livelombok.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "pedidoItem")
@Data
public class PedidoItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    private  ProdutoModel produto;
    private BigDecimal valor;
}
