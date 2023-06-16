package com.boardapp.boardapi.board.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boardapp.boardapi.board.model.BoardDto;

@RestController
@RequestMapping("board")
public class BoardController {
    @GetMapping
    private void findAll() {

    }

    @GetMapping("/:{id}")
    private void findById(@PathVariable Long id) {

    }

    @PostMapping
    private void create(@RequestBody BoardDto dto) {

    }

    @PutMapping("/:{id}")
    private void edit(@PathVariable Long id, @RequestBody BoardDto dto) {

    }

    @DeleteMapping("/:{id}")
    private void delete(@PathVariable Long id) {

    }
}
