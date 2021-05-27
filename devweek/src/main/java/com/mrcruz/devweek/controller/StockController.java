package com.mrcruz.devweek.controller;

import com.mrcruz.devweek.model.dto.StockDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Tag(name = "Stocks")
@RestController
@RequestMapping("/stocks")
public class StockController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll(){
        return ResponseEntity.ok(Arrays.asList(new StockDTO()));
    }

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(){
        return ResponseEntity.ok(new StockDTO());
    }
}
