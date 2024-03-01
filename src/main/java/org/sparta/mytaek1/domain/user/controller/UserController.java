package org.sparta.mytaek1.domain.user.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.sparta.mytaek1.domain.user.dto.UserRequestDto;
import org.sparta.mytaek1.domain.user.service.UserService;
import org.sparta.mytaek1.global.message.SuccessMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<String> createUser(@Valid @RequestBody UserRequestDto requestDto) {
        return handleRequest(() -> {
            userService.createUser(requestDto);
            return new ResponseEntity<>(SuccessMessage.JOIN_SUCCESS_MESSAGE.getSuccessMessage(), HttpStatus.CREATED);
        });
    }

    @GetMapping("/streamkeys/{streamKey}")
    public ResponseEntity<String> checkStreamKey(@PathVariable String streamKey){
        userService.checkStreamKey(streamKey);
        return ResponseEntity.ok("Stream key is valid");
    }

    private ResponseEntity<String> handleRequest(RequestHandler handler) {
        try {
            return handler.handle();
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @FunctionalInterface
    private interface RequestHandler {
        ResponseEntity<String> handle();
    }
}