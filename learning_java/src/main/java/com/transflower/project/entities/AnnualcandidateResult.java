package com.transflower.project.entities;

import java.util.Objects;

public class AnnualcandidateResult {
    private int candidateId;
    private int score;
    private String subjectTitle;

    public AnnualcandidateResult(){
          this.candidateId=0;
          this.score=0;
          this.subjectTitle="";

    }

    public AnnualcandidateResult( int candidateId,int score,String subjectTitle){
        this.candidateId=candidateId;
        this.score=score;
        this.subjectTitle=subjectTitle;

    }

    public int getCandidateId(){
        return candidateId;

    }

    public int getScore(){
        return score;
    }

    public String getSubjectTitle(){
        return subjectTitle;
    }

    public void setCandidateId(int candidateId){
        this.candidateId=candidateId;
    }

    public void setScore(int score){
        this.score=score;
    
    }

    public void setSubjectTitle(String subjectTitle){
        this.subjectTitle=subjectTitle;
    }


    @Override

    public String toString(){
        return"AnnualcandidateResult={" +
             "candidateId = " +candidateId +
             ", score= " + score +
             ",subjectTitle " +subjectTitle + '\'' +

       '}' ;
    }

    @Override

    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass() !=obj.getClass())return false;
        AnnualcandidateResult other = (AnnualcandidateResult)obj;
        return candidateId == other.candidateId &&
            score == other.score &&
            Objects.equals(subjectTitle,other.subjectTitle);
    } 

     @Override   

     public int hashCode(){
        return Objects.hash(candidateId,score,subjectTitle);
     }
}
