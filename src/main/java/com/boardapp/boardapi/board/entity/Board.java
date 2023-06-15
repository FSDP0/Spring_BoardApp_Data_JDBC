package com.boardapp.boardapi.board.entity;

import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Board {
    @Id
    @Column()
    private Long boardId;

    @Column
    private String boardTitle;

    @Column
    private String boardAuthor;

    @Column
    private String boardContents;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date modifiedDate;

    @Builder
    public Board(final Long id, final String title, final String writer, final String contents,
            final Date createdDate, final Date modifiedDate) {
        this.boardId = id;
        this.boardTitle = title;
        this.boardAuthor = writer;
        this.boardContents = contents;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
