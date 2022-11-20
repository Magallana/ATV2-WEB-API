package apiweb.APIwebatv2.api.controller;

import apiweb.APIwebatv2.api.model.ProdutoModel;
import apiweb.APIwebatv2.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping(path = "api/produto/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigoproduto) {
        return repository.findById(codigoproduto)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/produto/salvar")
    public ProdutoModel salvar(@RequestBody ProdutoModel nomeproduto) {
        return repository.save(nomeproduto);
    }

    @PutMapping (path = "/api/produto/editar/")
    public ProdutoModel editar(@RequestBody ProdutoModel nomeproduto){
        return repository.save(nomeproduto);
}
    @DeleteMapping (path = "/api/produto/deletar/{codigoProduto}")
    public void deletar(@PathVariable("codigoProduto") Integer codigoProduto){
        repository.deleteById(codigoProduto);
    }
}
