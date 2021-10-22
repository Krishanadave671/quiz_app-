package com.krishana.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
 private Button option1,option2,option3,option4;
 private TextView questiontv, questionnotv,Incorrect, correct;
 private ArrayList<Quizmodel> quizArraylist;
 Random random;
 int currentscore = 0, questionAttempted = 1,currentPos;
 int incorrect = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        questiontv = findViewById(R.id.question);
        questionnotv = findViewById(R.id.questionno);
        option1 = findViewById(R.id.option_A);
        option2 = findViewById(R.id.option_B);
        option3 = findViewById(R.id.option_C);
        option4 = findViewById(R.id.option_D);
        Incorrect = findViewById(R.id.Incorrecttextview);
        correct = findViewById(R.id.correcttextview);
        random = new Random();
        quizArraylist = new ArrayList<>();
        getquizquestion(quizArraylist);
        currentPos = random.nextInt(quizArraylist.size());
        setDataToViews(currentPos);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArraylist.get(currentPos).getAnswer().trim().toLowerCase().equals(option1.getText().toString().trim().toLowerCase())){
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    currentscore++;

                }
                else{
                    Toast.makeText(MainActivity.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                    incorrect++;
                }

                questionAttempted++;
                currentPos = random.nextInt(quizArraylist.size());
                setDataToViews(currentPos);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArraylist.get(currentPos).getAnswer().trim().toLowerCase().equals(option2.getText().toString().trim().toLowerCase())){
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    currentscore++;

                }
                else{
                    Toast.makeText(MainActivity.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                    incorrect++;
                }

                questionAttempted++;
                currentPos = random.nextInt(quizArraylist.size());
                setDataToViews(currentPos);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArraylist.get(currentPos).getAnswer().trim().toLowerCase().equals(option3.getText().toString().trim().toLowerCase())){
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    currentscore++;

                }
                else{
                    Toast.makeText(MainActivity.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                    incorrect++;
                }

                questionAttempted++;
                currentPos = random.nextInt(quizArraylist.size());
                setDataToViews(currentPos);
            }
        });
            option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizArraylist.get(currentPos).getAnswer().trim().toLowerCase().equals(option4.getText().toString().trim().toLowerCase())){
                    Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                    currentscore++;

                }
                else{
                    Toast.makeText(MainActivity.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
                    incorrect++;
                }

                questionAttempted++;
                currentPos = random.nextInt(quizArraylist.size());
                setDataToViews(currentPos);

            }
        });







    }

    private void setDataToViews(int currentPos) {
           questionnotv.setText(questionAttempted + " ");
           Incorrect.setText("Incorrect : " + incorrect);
           correct.setText("Correct : " + currentscore);
           if(questionAttempted == 5){

           }

          else {
                questiontv.setText(quizArraylist.get(currentPos).getQuestions());
                option1.setText(quizArraylist.get(currentPos).getOptions1());
                option2.setText(quizArraylist.get(currentPos).getOptions2());
                option3.setText(quizArraylist.get(currentPos).getOptions3());
                option4.setText(quizArraylist.get(currentPos).getOptions4());

            }

    }
//   public void quizcheckalgorithm(Button button,ArrayList<Quizmodel> quizArraylist){
//        if(quizArraylist.get(currentPos).getAnswer().trim().toLowerCase().equals(button.getText().toString().trim().toLowerCase())){
//            Toast.makeText(MainActivity.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
//            currentscore++;
//        }
//        else{
//            Toast.makeText(MainActivity.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
//        }
//        questionAttempted++;
//        currentPos = random.nextInt(quizArraylist.size());
//        setDataToViews(currentPos);
//    }

    private void getquizquestion(ArrayList<Quizmodel> quizArraylist) {
        quizArraylist.add(new Quizmodel("Which of the following property specifies the distance between a marker and the text in the list?", "marker-offset", "list-style-position", "list-style-image", "list-style", "list-style-image"));
        quizArraylist.add(new Quizmodel("Which of the following property changes the width of left border?", "marker-offset", "list-style-position", "list-style-image", "list-style","list-style-image"));
        quizArraylist.add(new Quizmodel(" How to you modify a border image using CSS3?", "marker-offset", "list-style-position", "list-style-image", "list-style","list-style-image"));
        quizArraylist.add(new Quizmodel("Which of the following property is used to create a small-caps effect?", "marker-offset", "list-style-position", "list-style-image", "list-style","list-style-image"));
        quizArraylist.add(new Quizmodel("Which of the following property specifies the distance between a marker and the text in the list?", "marker-offset", "list-style-position", "list-style-image", "list-style","list-style-image"));
    }
}