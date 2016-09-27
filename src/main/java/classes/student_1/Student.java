/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.student_1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;
/** *
 * @author Мария
 */
public class Student {
    private int id;
    private String name;
    private String surName;
    private String patr;
    private Date birthDate;
     private String address;
     private String telNumb;
     private String faculty;
     private String course;
     private String group;
 public  static Student [] student_group;
     
   static public class GroupCreator{
       
       public GroupCreator(){};
       
    static final String [] names={
        "Ann",
        "Mary",
        "Jane",
        "Charlie",
        "Mike",
        "Tyler"
   
    };
   static final String [] surNames={
        "Black",
        "Piens",
        "Sheen",
        "Campbell",
        "Collins",
        "Edwards"
    
    };
    
    
      final String [] patronymics={
        "Alexandrovich",
        "Alexeevich",
        "Dmitrievich",
        "Vladidmirovich",
        "Mikhailovich",
        "Sergeevich"
    
    };
    
    
    static final String [] dates={
        "11-09-1998",
        "14-02-1997",
        "08-01-1997",
        "16-03-1996",
        "27-09-1996",
        "30-05-1997"
    
    };
    static  final String [] addreses={
        "dormitory 1",
        "dormitory 3",
        "dormitory 1",
        "dormitory 2",
        "dormitory 2",
        "dormitory 2",

    };
    
    static  final String [] telNumbers={
        "095-34-34-556",
        "098-23-45-678",
        "093-09-23-445",
        "095-87-98-234",
        "098-54-34-567",
        "067-33-12-222",

    };  
     final String [] faculties={
        "Computer Science",
        "Radio Technology",
        "Economics",
        "Finance"
   
    };  
    
    static   final String [] courses={
        "1",
        "2",
        "3",
        "4",
        "5"
     };
    static   final String [] groupes={
        "1",
        "2",
        "3",
        "4",
        "5"
    };
    
     public  void print(String []mass){
     for (int i=0; i<mass.length;i++){
         System.out.println(mass[i]);
    }
     };
    
       public void parseDate(Student s){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
         Random r = new Random();
        
          try{
              Date DATA = sdf.parse(dates[r.nextInt(dates.length)]);
             
              s.setBirthDate(DATA);
          }catch (ParseException ex){
              System.out.println("kjfekjd");
          }
            
       }
       
       
    public void create(){
    Random r = new Random();
    student_group = new Student[12];
    for(int i=0; i<student_group.length;i++){
        Student s = new Student();
        s.setId(r.nextInt());
        s.setAddress(addreses[r.nextInt(5+1)]);
        s.setName(names[r.nextInt(5+1)]);
        s.setSurName(surNames[r.nextInt(5+1)]);
        s.setPatr(patronymics[r.nextInt(5+1)]);
        s.setTelNumb(telNumbers[r.nextInt(5+1)]); 
        s.setCourse(courses[r.nextInt(4+1)]);
        s.setGroup(groupes[r.nextInt(4+1)]);
        s.setFaculty(faculties[r.nextInt(3+1)]);
        parseDate(s);
        student_group[i]=s;
    }
    
    };
    
    public  void print(){
     for (Student a:student_group){
         System.out.println(a);
    }
    
    }
     public void go( Student s, int n){
         
       for (int i=0; i<student_group.length;i++){
                Student.StudentSearcher a = new Student.StudentSearcher(n);
                a.compare(student_group[i], s);
           
       }
   }
     
    } 
   
         static class StudentSearcher implements Comparator <Student>{
         private int searchingField = 0;
         public static  final int search_faculty = 1;
         public static final int search_year = 2;
         public static final int search_course = 3;
         public static final int search_group = 4;
         
         public StudentSearcher(){};
         public StudentSearcher(int searchingField){
         this.searchingField=searchingField;
         };
         
         
         
         
           
        @Override
        public int compare(Student o1, Student o2) {
         switch(searchingField){
             case 1:
             { if(o1.faculty.compareTo(o2.faculty)==0){
                         System.out.println(o1);
                         
             }
             
             return 0;
             }
             
//             case 2:
//             {  if(o1.year.compareTo(o2.course)==0){
//                 System.out.println(o1);
//             }
//                   return 0;
//             }
             case 3:
             {  if(o1.course.compareTo(o2.course)==0){
                 System.out.println(o1);
             }
                   return 0;
             }
             case 4:
             {  if(o1.group.compareTo(o2.group)==0){
                 System.out.println(o1);
             }
                   return 0;
             }
             
             case 5:
             {  if(o1.course.compareTo(o2.course)==0){
                 System.out.println(o1);
             }
                   return 0;
             }
                      default: return -1;
         }
        
         
        }
     

        public int getSearchingField() {
            return searchingField;
        }

        public void setSearchingField(int searchingField) {
            this.searchingField = searchingField;
        }
       
   }
     
    public Student() {
    }

    public Student(int id, String name, String surName, String patr) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.patr = patr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        
         Student o = (Student) obj;
        if (this.id != o.id) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", surName=" + surName + ", patr=" + patr + ", birthDate=" + birthDate + ", address=" + address + ", telNumb=" + telNumb + ", faculty=" + faculty + ", course=" + course + ", group=" + group + '}';
    }

    
    public Student(int id, String name, String surName, String patr, Date birthDate, String address, String telNumb, String faculty, String course, String group) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.patr = patr;
        this.birthDate = birthDate;
        this.address = address;
        this.telNumb = telNumb;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPatr() {
        return patr;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNumb() {
        return telNumb;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPatr(String patr) {
        this.patr = patr;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }
     
 
    
    
}
