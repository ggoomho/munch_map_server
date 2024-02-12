package com.ggoomho.munchmap.component;

import com.ggoomho.munchmap.structure.Question;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@Component
@Getter
public class Questionnaire {

    private List<Question> questions;

    public Questionnaire() {
        Gson gson = new Gson();

        ClassPathResource resource = new ClassPathResource("questionnaire.json");
        try(FileReader reader = new FileReader(resource.getFile())) {
            Question[] question = gson.fromJson(reader, Question[].class);
            this.questions = Arrays.asList(question);
            // List<Member> list2 = gson.fromJson(jsonString, new TypeToken<List<Member>>(){}.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }
