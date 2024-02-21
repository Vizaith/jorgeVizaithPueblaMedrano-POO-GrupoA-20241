public class Persona {
    
        private String name;
        private int age;
        private String gender;
    
        public Persona(String name, int age, String gender){
            this.name=name;
            this.age=age;
            this.gender=gender;
    
        }
    
        public String getName(){
            return name;
        }
    
        public int getAge(){
            return age;
        }
    
        public String getGender(){
            return gender;
        }
    
        public static void main(String[] args){
            Persona person1=new Persona("Alejandro", 82, "Male");
            Persona person2=new Persona("Sianya", 18, "Female");
            Persona person3=new Persona("Vizaith", 21, "Male");
            Persona person4=new Persona("Andrea", 2, "Female");
            Persona person5=new Persona("Mariana", 12, "Female");
            Persona person6=new Persona("Alberto", 32, "Male");
    
            System.out.println("Name: "+person1.getName()+" Age: "+person1.getAge()+" Gender: "+person1.getGender());
            System.out.println("Name: "+person2.getName()+" Age: "+person2.getAge()+" Gender: "+person2.getGender());
            System.out.println("Name: "+person3.getName()+" Age: "+person3.getAge()+" Gender: "+person3.getGender());
            System.out.println("Name: "+person4.getName()+" Age: "+person4.getAge()+" Gender: "+person4.getGender());
            System.out.println("Name: "+person5.getName()+" Age: "+person5.getAge()+" Gender: "+person5.getGender());
            System.out.println("Name: "+person6.getName()+" Age: "+person6.getAge()+" Gender: "+person6.getGender());
        }

}
