package edu.brynmawr.cmsc353.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class QuizActivity extends AppCompatActivity {
    int correctcounter = 0;
    int incorrectcounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View v){
        TextView firstValue = findViewById(R.id.valueOne);
        TextView secondValue = findViewById(R.id.valueTwo);
        TextView answerView = findViewById(R.id.answerField);
        String tvFirstNum;
        tvFirstNum = firstValue.getText().toString();
        tvFirstNum = tvFirstNum.replaceAll("[^0-9]+","");
        int firstNum = Integer.parseInt(tvFirstNum);
        String tvSecondNum;
        tvSecondNum = secondValue.getText().toString();
        tvSecondNum = tvSecondNum.replaceAll("[^0-9]+","");
        int secondNum = Integer.parseInt(tvSecondNum);
        int correctAnswer = firstNum + secondNum;
        String tvUsrAnswer;
        tvUsrAnswer = answerView.getText().toString();
        tvUsrAnswer = tvUsrAnswer.replaceAll("[^0-9]+","");
        int userAnswer = -1; //in situation where answer is still "?" will solve to be false
        if(tvUsrAnswer.equals("") != true){
            userAnswer = Integer.parseInt(tvUsrAnswer);
        }
        if(userAnswer == correctAnswer){
            correctcounter++;
            incorrectcounter = 0;
            if(correctcounter < 2){
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            }
            else{
                String correctMessage = "Correct! " + correctcounter + " in a row!";
                Toast.makeText(this, correctMessage, Toast.LENGTH_SHORT).show();
            }
            new AsyncTask<String, String, String>() {

                protected String doInBackground(String... inputs) {
                    try { Thread.sleep(3000); }
                    catch (Exception e) { }
                    return null;
                }

                protected void onPostExecute(String input) {
                    int randomOne = new Random().nextInt(90) + 10;
                    int randomTwo = new Random().nextInt(90) + 10;
                    firstValue.setText("   " + randomOne);
                    secondValue.setText("+  " + randomTwo);
                    answerView.setText("    ?");
                }
            }.execute();
        }
        else{
            if(incorrectcounter != 2){
                Toast.makeText(this, "Incorrect! Try Again!", Toast.LENGTH_SHORT).show();
                new AsyncTask<String, String, String>() {

                    protected String doInBackground(String... inputs) {
                        try { Thread.sleep(3000); }
                        catch (Exception e) { }
                        return null;
                    }

                    protected void onPostExecute(String input) {
                        answerView.setText("    ?");
                    }
                }.execute();
                incorrectcounter++;
            }
            else{
                String threeWrong = "Incorrect! The correct answer is " + correctAnswer;
                Toast.makeText(this, threeWrong, Toast.LENGTH_SHORT).show();
                answerView.setText(String.valueOf(correctAnswer));
                answerView.setTextColor(Color.RED);
                correctcounter = 0;
                new AsyncTask<String, String, String>() {

                    protected String doInBackground(String... inputs) {
                        try { Thread.sleep(3000); }
                        catch (Exception e) { }
                        return null;
                    }

                    protected void onPostExecute(String input) {
                        int randomOne = new Random().nextInt(90) + 10;
                        int randomTwo = new Random().nextInt(90) + 10;
                        firstValue.setText("   " + randomOne);
                        secondValue.setText("+  " + randomTwo);
                        answerView.setText("    ?");
                        answerView.setTextColor(Color.BLUE);
                    }
                }.execute();
                incorrectcounter = 0;
            }
        }
    }

    public void clearAnswer(View v){
        TextView answerView = findViewById(R.id.answerField);
        answerView.setText("    ?");
    }

    public void clickOne (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = answerView.getText().toString();
        if(currentVal.equals("    ?")){
            answerView.setText("1");
        }
        else if(answerView.length() < 3){
            answerView.setText("1" + answerView.getText());
        }
    }

    public void clickTwo (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("2");
        }
        else if(answerView.length() < 3){
            answerView.setText("2" + answerView.getText());
        }
    }

    public void clickThree (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("3");
        }
        else if(answerView.length() < 3){
            answerView.setText("3" + answerView.getText());
        }
    }

    public void clickFour (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("4");
        }
        else if(answerView.length() < 3){
            answerView.setText("4" + answerView.getText());
        }
    }

    public void clickFive (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("5");
        }
        else if(answerView.length() < 3){
            answerView.setText("5" + answerView.getText());
        }
    }

    public void clickSix (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("6");
        }
        else if(answerView.length() < 3){
            answerView.setText("6" + answerView.getText());
        }
    }

    public void clickSeven (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("7");
        }
        else if(answerView.length() < 3){
            answerView.setText("7" + answerView.getText());
        }
    }

    public void clickEight (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("8");
        }
        else if(answerView.length() < 3){
            answerView.setText("8" + answerView.getText());
        }
    }

    public void clickNine (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("9");
        }
        else if(answerView.length() < 3){
            answerView.setText("9" + answerView.getText());
        }
    }

    public void clickZero (View v){
        TextView answerView = findViewById(R.id.answerField);
        String currentVal = (String) answerView.getText();
        if(currentVal.equals("    ?")){
            answerView.setText("0");
        }
        else if(answerView.length() < 3){
            answerView.setText("0" + answerView.getText());
        }
    }


}
