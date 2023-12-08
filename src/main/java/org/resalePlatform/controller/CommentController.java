package org.resalePlatform.controller;

import com.foreach.openapi.model.Comment;
import com.foreach.openapi.model.Comments;
import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/ads/{id}/comments")
    public ResponseEntity<Comments> getComments(@PathVariable("id") Integer id) {
        return null;
    }

    @PostMapping("/ads/{id}/comments")
    public ResponseEntity<Comments> addComment(@PathVariable("id") Integer id, @RequestBody Comments comment) {
        return null;
    }

    @DeleteMapping("/ads/{adId}/comments/{commentId}")
    public ResponseEntity<Comments> deleteComment(@PathVariable("adId") Integer adId, @PathVariable("commentId") Integer commentId) {
        return null;
    }

    @PatchMapping("/ads/{adId}/comments/{commentId}")
    public ResponseEntity<Comments> updateComment(@PathVariable("adId") Integer adId, @PathVariable("commentId") Integer commentId, @RequestBody Comments comment) {
        return null;
    }
}
