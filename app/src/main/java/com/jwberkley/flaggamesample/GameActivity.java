package com.jwberkley.flaggamesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    ImageView flagImage;
    Button a1, a2, a3, a4;
    ArrayList<FlagQuestion> questionsList = new ArrayList<>();
    FlagQuestion currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        flagImage = (ImageView) findViewById(R.id.flagImage);
        a1 = (Button) findViewById(R.id.answer1);
        a2 = (Button) findViewById(R.id.answer2);
        a3 = (Button) findViewById(R.id.answer3);
        a4 = (Button) findViewById(R.id.answer4);

        questionsList.add(new FlagQuestion(R.drawable.usa, "England", "Dubai", "USA", "France", 3));
        questionsList.add(new FlagQuestion(R.drawable.costarica, "Italy", "Costa Rica", "Australia", "Puerto Rico", 2));
        questionsList.add(new FlagQuestion(R.drawable.australia, "Australia", "Lybia", "Spain", "China", 1));
        Collections.shuffle(questionsList);
        currentQuestion = questionsList.remove(0);
        flagImage.setImageResource(currentQuestion.getImageReference());
        a1.setText(currentQuestion.getAnswer1());
        a2.setText(currentQuestion.getAnswer2());
        a3.setText(currentQuestion.getAnswer3());
        a4.setText(currentQuestion.getAnswer4());

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentQuestion.getCorrectAnswer() == 1) {
                    Toast.makeText(GameActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Wrong!", Toast.LENGTH_LONG).show();
                }

                currentQuestion = questionsList.remove(0);
                flagImage.setImageResource(currentQuestion.getImageReference());
                a1.setText(currentQuestion.getAnswer1());
                a2.setText(currentQuestion.getAnswer2());
                a3.setText(currentQuestion.getAnswer3());
                a4.setText(currentQuestion.getAnswer4());
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentQuestion.getCorrectAnswer() == 2) {
                    Toast.makeText(GameActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Wrong!", Toast.LENGTH_LONG).show();
                }

                currentQuestion = questionsList.remove(0);
                flagImage.setImageResource(currentQuestion.getImageReference());
                a1.setText(currentQuestion.getAnswer1());
                a2.setText(currentQuestion.getAnswer2());
                a3.setText(currentQuestion.getAnswer3());
                a4.setText(currentQuestion.getAnswer4());
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentQuestion.getCorrectAnswer() == 3) {
                    Toast.makeText(GameActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Wrong!", Toast.LENGTH_LONG).show();
                }

                currentQuestion = questionsList.remove(0);
                flagImage.setImageResource(currentQuestion.getImageReference());
                a1.setText(currentQuestion.getAnswer1());
                a2.setText(currentQuestion.getAnswer2());
                a3.setText(currentQuestion.getAnswer3());
                a4.setText(currentQuestion.getAnswer4());
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentQuestion.getCorrectAnswer() == 4) {
                    Toast.makeText(GameActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Wrong!", Toast.LENGTH_LONG).show();
                }

                currentQuestion = questionsList.remove(0);
                flagImage.setImageResource(currentQuestion.getImageReference());
                a1.setText(currentQuestion.getAnswer1());
                a2.setText(currentQuestion.getAnswer2());
                a3.setText(currentQuestion.getAnswer3());
                a4.setText(currentQuestion.getAnswer4());
            }
        });
    }
}
