package org.resalePlatform.controller;

import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.dto.CommentDto;
import org.resalePlatform.dto.Comments;
import org.resalePlatform.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/ads")
@RestController
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{id}/comments")
    public ResponseEntity<Comments> getComments(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(commentService.getComments(id));
    }

    @PostMapping("/{id}/comments")
    public ResponseEntity<CommentDto> addComment(@PathVariable("id") Integer id, @RequestBody CommentDto commentDto) {
        return ResponseEntity.ok(commentService.addComment(id, commentDto));
    }

    @DeleteMapping("/{adId}/comments/{commentId}")
    public ResponseEntity<CommentDto> deleteComment(@PathVariable("adId") Integer adId, @PathVariable("commentId") Integer commentId) {
        return ResponseEntity.ok(commentService.deleteComment(adId, commentId));
    }

    @PatchMapping("/{adId}/comments/{commentId}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable("adId") Integer adId, @PathVariable("commentId") Integer commentId, @RequestBody CommentDto commentDto) {
        return ResponseEntity.ok(commentService.updateComment(adId, commentId, commentDto));
    }
}
