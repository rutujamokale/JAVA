// package com.transflower.Repository;

// import java.io.InputStream;
// import java.security.PublicKey;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Properties;


// @Repository
// public class AssessmentIntelligenceRepoimpl implements AssessmentIntelligenceRepository {
 
//     private static Connection connection;

//     static{
//         try {
//             Properties props=new Properties();
//             try(InputStream input =AssessmentIntelligenceRepoimpl.class.getClassLoader().getResourceAsStream(name:"application.properties")){
//                 prop.load(input);
//             }
//             String url=props.getProperty("db.url");
//            String username=props.getProperty("db.username");
//            String encpass=props.getProperty("db.password");
//            AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
//             textEncryptor.setPassword("TransFlower"); 
//             String pass = textEncryptor.decrypt(encPass.replace("ENC(", "").replace(")", ""));

//             String driver = props.getProperty("db.driver");

//             Class.forName(driver);
//             connection = DriverManager.getConnection(url, username, pass);

//             System.out.println("Connection Established");



//         } catch (Exception e) {
//             System.out.println(e);
//             System.out.println(" error  is connecting to database");
//         }
//     }

//     @Override

//     Public List<AnnualCandidateResult> getCandidateResults(int candidateId,int year){


//         List<AnnualCandidateResult> results = new ArrayList<AnnualCandidateResult>();
//         try {
//             Statement statement = connection.createStatement();
//             String query = "SELECT candidatetestresults.score, subjects.title, tests.id " +
//                         "FROM candidatetestresults " +
//                         "JOIN tests ON (tests.id = candidatetestresults.testid) " +
//                         "JOIN subjects ON (subjects.id = tests.subjectid) " +
//                         "WHERE candidatetestresults.candidateid = " + candidateId + 
//                         " AND YEAR(teststarttime) = " + year;

//                         ResultSet result = statement.executeQuery(query);

//             while(result.next()){
                
//             }            
//         } catch (Exception e) {
//         }
//     }
    
// }
