package org.resalePlatform.service.impl;

import lombok.RequiredArgsConstructor;
import org.resalePlatform.dto.CommentDto;
import org.resalePlatform.dto.Comments;
import org.resalePlatform.repository.CommentRepository;
import org.resalePlatform.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comments getComments(Integer id) {
        return null;
    }

    @Override
    public CommentDto addComment(Integer id, CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto deleteComment(Integer adId, Integer commentId) {
        return null;
    }

    @Override
    public CommentDto updateComment(Integer adId, Integer commentId, CommentDto commentDto) {
        return null;
    }
}
