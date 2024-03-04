package m46_error_exception_handling;

    public class Person {

        private String name;
        private int age;

        public void setName(String name) {
            if(name.isEmpty()){
                throw new RuntimeException("Name of person can not be empty");
            }
            this.name = name;
        }

        public void setAge(int age) {
            if(age <= 0){
                throw new RuntimeException("Age of person can not be zero or negative");
            }
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
