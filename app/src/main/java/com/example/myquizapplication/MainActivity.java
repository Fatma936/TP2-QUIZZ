package com.example.myquizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalquestionTextView;
    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button submitBtn;

    int score=0;
    int totalquestion = QuestionAnswer.questions.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalquestionTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalquestionTextView.setText("Total de questions:"+totalquestion);

        loadNewQuestion();


    }

    @Override
    public void onClick(View view) {
        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button ClickedButten = (Button) view;
        if(ClickedButten.getId()==R.id.submit_btn){
            if(selectedAnswer.equals((QuestionAnswer.correctAnswers[currentQuestionIndex]))){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();
        }else {
            selectedAnswer  = ClickedButten.getText().toString();
            ClickedButten.setBackgroundColor(Color.MAGENTA);
        }
    }

    void loadNewQuestion(){
        if(currentQuestionIndex == totalquestion ){
            finishQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswer.questions[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer.choices[currentQuestionIndex][3]);
    }

    void finishQuiz(){

        String passStatus = "";
        if(score>totalquestion*0.60){
            passStatus ="Bravooo \uD83D\uDCAA \uD83D\uDD25 !";
        }else{
            passStatus="Vous avez échoué \uD83D\uDE41 \uD83D\uDE2D!";

        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Votre score= "+score)
                .setPositiveButton("Réessayer",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();

    }
    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }
}