package com.boardapp.boardapi.board.repository;

import org.springframework.data.repository.Repository;
import com.boardapp.boardapi.board.entity.Board;
import java.util.List;

public interface BoardRepository extends Repository<Board, Long> {
    List<Board> findAllBoards();

    Board findByBoardId(Long boardId);

    void deleteByBoardId(Long boardId);
}
