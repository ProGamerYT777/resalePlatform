package org.resalePlatform.service;

import org.resalePlatform.dto.CommentDto;
import org.resalePlatform.dto.Comments;

public interface CommentService {

    Comments getComments(Integer id);

    CommentDto addComment(Integer id, CommentDto commentDto);

    CommentDto deleteComment(Integer adId, Integer commentId);

    CommentDto updateComment(Integer adId, Integer commentId, CommentDto commentDto);

}
