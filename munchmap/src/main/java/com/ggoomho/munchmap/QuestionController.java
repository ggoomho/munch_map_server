package com.ggoomho.munchmap;

import com.ggoomho.munchmap.component.Questionnaire;
import com.ggoomho.munchmap.structure.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
@CrossOrigin(origins = "*")
public class QuestionController {

    private final Questionnaire questionnaire;

    @GetMapping("/{questionNumber}")
    public ResponseEntity<Question> getQuestion(@PathVariable("questionNumber") int questionNumber) {
        if(questionNumber > questionnaire.getQuestions().size()) {
            // throw
        }

        return ResponseEntity.status(HttpStatus.OK).body(questionnaire.getQuestions().get(questionNumber));
    }
}
