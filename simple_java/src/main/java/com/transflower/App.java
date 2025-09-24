package com.transflower;

import java.util.ArrayList;
import java.util.List;

import com.transflower.Entity.Question;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FileIoManager  manager = new FileIoManager();

        List<Question> questions=new ArrayList<>();
        questions.add(new Question(
    "What is Java?",
    "A programming language",  // optionA
    "", "", "",                // optionB, optionC, optionD
    'A',                      // correctAnswer
    0,                        // evaluationCriteria
    1,                        // id
    101                       // subjectId
));


        manager.SaveToFile(questions);

        List<Question>loaded=manager.loadFromFile();
        System.out.println("loaded:" +loaded);














        // Circle c=new Circle();
        // Rectangle r=new Rectangle();

        // c.draw();
        // c.show();

        // r.draw();
        // r.show();

        // Student s1=new Student();
      
        //    //setter
           
        //    s1.setName("rutuja");
        //    s1.setRoll_no(28);
        //    s1.setmarks(90);

        //    System.out.println("name:"+ s1.getName());
        //    System.out.println("roll_no:" +s1.getRoll_no());
        //    System.out.println("marks:" + s1.getMarks());


        // Student s1=new Student("nikita",29,90.5f);
        
        // System.out.println(s1);

        

    }
}
