
class EmployeeAge {

    private int age;

    public boolean setAge(int age) {
        // Validate and store age
        if (age >= 18 && age <= 60) {
            this.age = age;
            return true;
        } else {
            return false;
        }

    }

    public int getAge() {
        // Return the stored age
        return age;
    }
}
