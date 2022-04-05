public class Task {
    public static void main(String[] args){
/* TODO
This code is exactly the same as in Task 3 and should yield the same output.*/
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /* TODO
Create an education object. Schoo is NEIU, major is Computer Science.*/
        Resume.Education education = r.new Education("NEIU", "Computer Science");
       /* TODO
add this education object to the resume "r"*/
        r.addEducation(education);
        /* TODO
Create a new Experience object and add it to the resume.*/
        Resume.Experience experience = new Resume.Experience("Tutor", 2018, 2019);
        r.addExperience(experience);
        r.addExperience(new Resume.Experience ("Advisor", 2020, 2021));
        System.out.println(r); //watch the resume print.

    }
}