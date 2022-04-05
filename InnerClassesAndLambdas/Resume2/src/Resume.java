/* TODO
The imports will self populate. You don't have to do anything.*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
/* TODO
Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.*/
    public class Education {
        String school;
        String major;

        public String getSchool() {
            return this.school;
        }

        public String getMajor() {
            return this.major;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        @Override
        public String toString() {
            return this.major + " at " + this.school;
        }
    }
    public static class Experience {
        String jobTitle;
        int startYear;
        int toYear;

        public Experience(String jobTitle, int startYear, int toYear) {
            this.jobTitle = jobTitle;
            this.startYear = startYear;
            this.toYear = toYear;
        }

        @Override
        public String toString() {
            return this.startYear + "-" + this.toYear + ": " + this.jobTitle;
        }
    }
/* TODO
Create a member variable of type Person (exactly as in task 2)*/
    private Person person;
/* TODO
Create a List to hold values of type Education (exactly as in task 2)*/
    private List<Education> education;
/* TODO
Create a Priority Queue that holds values of type Experience.*/
    private PriorityQueue<Experience> experience;

    public Resume(Person p){
/* TODO
Assign a value to the Person variable.*/
        this.person = p;
/* TODO
Initialize the List with Education objects.*/
        this.education = new ArrayList<>();
/* TODO
Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.*/
        this.experience = new PriorityQueue<>(new Comparator<Experience>() {
            @Override
            public int compare(Experience experience1, Experience experience2) {
                return (experience2.toYear - experience1.toYear);
            }
        });
    }

/* TODO
Add a standard getter for the experiences. getExperience. it should return a priority queue.*/
    public PriorityQueue<Experience> getExperience() {
        return this.experience;
    }

/* TODO
Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)*/
    public void addEducation(Education education) {
        this.education.add(education);
    }
    public void addExperience(Experience experience) {
        this.experience.add(experience);
    }
    @Override
    public String toString() {
        return (
                this.person +
                        "\nExperience\n" + this.experience +
                        "\nEducation\n" + this.education
        );
    }

}
