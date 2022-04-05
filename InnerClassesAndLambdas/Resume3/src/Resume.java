import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
/* TODO
Same two inner classes and member variables as in task 3.*/
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

    private Person person;
    private List<Education> education;
    private PriorityQueue<Experience> experience;

    public Resume(Person p) {
/* TODO
Same initialization of Person and the List of Education objects */
        this.person = p;
        this.education = new ArrayList<>();
 /* TODO
Initialize the priority queue in one line, without importing the Comparator interface. */
        this.experience = new PriorityQueue<>((experience1, experience2) -> experience2.toYear - experience1.toYear);
    }

    public PriorityQueue<Experience> getExperience() {
        return this.experience;
    }

/* TODO
The getter for experience and the methods to add education and experience objects stay the same, as well as the toString() */
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
