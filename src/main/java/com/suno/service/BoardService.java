package com.suno.service;


import com.suno.domain.Board;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BoardService {
    // 글 등록
    void insertBoard(Board board);

    // 글 수정
    void updateBoard(Board board);

    // 글 삭제
    void deleteBoard(Board board);

    // 글 상세 조회
    void getBoard(Board board);

    // 글 리스트 조회
    List<Board> getBoardList(Board board);

}

