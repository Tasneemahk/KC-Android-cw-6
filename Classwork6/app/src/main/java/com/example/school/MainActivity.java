package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Student> students = new ArrayList<Student>();
    int c = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView studentIMG = findViewById(R.id.IMG);
        TextView name = findViewById(R.id.nameInput);
        TextView age = findViewById(R.id.ageInput);
        TextView grade = findViewById(R.id.gradeInput);
        Button next = findViewById(R.id.next);

        Student s1 = new Student("Aisha", 17,12,R.drawable.s1);
        Student s2 = new Student("Basma", 16,11,R.drawable.s2);
        Student s3 = new Student("Dalal", 17,12,R.drawable.s3);
        Student s4 = new Student("Fatma", 14,9,R.drawable.s4);
        Student s5 = new Student("Farah", 16,11,R.drawable.s5);
        Student s6 = new Student("Ghala", 17,12,R.drawable.s6);
        Student s7 = new Student("Hessa", 15,10,R.drawable.s7);
        Student s8 = new Student("Jawan", 17,12,R.drawable.s8);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        name.setText(students.get(c).getStudentName());
        age.setText(String.valueOf(students.get(c).getStudentAge()));
        grade.setText(String.valueOf(students.get(c).getStudentGrade()));
        studentIMG.setImageResource(students.get(c).getStudentIMG());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                if(c<8){
                name.setText(students.get(c).getStudentName());
                age.setText(String.valueOf(students.get(c).getStudentAge()));
                grade.setText(String.valueOf(students.get(c).getStudentGrade()));
                studentIMG.setImageResource(students.get(c).getStudentIMG());


            }
                else{
                    for(int c2 = 8; c2>0;c2--){
                        c--;
                    }

                    name.setText(students.get(c).getStudentName());
                    age.setText(String.valueOf(students.get(c).getStudentAge()));
                    grade.setText(String.valueOf(students.get(c).getStudentGrade()));
                    studentIMG.setImageResource(students.get(c).getStudentIMG());
                }

                }

        });

    }

}