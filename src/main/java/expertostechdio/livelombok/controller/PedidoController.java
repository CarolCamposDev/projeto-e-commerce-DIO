package expertostechdio.livelombok.controller;

import expertostechdio.livelombok.model.PedidoModel;
import expertostechdio.livelombok.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pedido")
@AllArgsConstructor
public class PedidoController {

    private final PedidoRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<PedidoModel>> listarTodos() {

        return ResponseEntity.ok(repository.findAll());
    }
    @PostMapping("/salvar")
    public ResponseEntity<PedidoModel> salvar(@RequestBody PedidoModel pedido) {
        if (pedido.getId() == null || pedido.getId().isEmpty()) {
            pedido.setId(UUID.randomUUID().toString());
        }
        return ResponseEntity.ok(repository.save(pedido));
    }
}
