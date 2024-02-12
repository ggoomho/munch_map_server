package com.ggoomho.munchmap.structure;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {
    private Long number;
    private String question;
    private List<String> answer;
}
