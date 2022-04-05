import java.util.ArrayList;
import java.util.List;

public class Resume {
/* TODO
Create a public member inner class Education according to the specifications.*/
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
/* TODO
Create a public static inner class called Experience, according to the specifications.*/
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
Create the Person and List of Education and List of experience objects. They should be private.*/
    private Person person;
    private List<Education> education;
    private List<Experience> experience;

    public Resume(Person p) {
/* TODO
This constructor should initialize the person and do all necessary initializations for the other methods to work. */
        this.person = p;
        this.education = new ArrayList<>();
        this.experience = new ArrayList<>();
    }

/* TODO
Create the addEducation, addExperience and override the toString methods as specified.*/
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
