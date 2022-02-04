package homework.week5;

public class Student {
    private String firstName;
    private String email;
    private int age;

    public void setFirstName(String firstName) {
        boolean check =  true;
        for(int i = 1; i < firstName.length();i++){
            if(firstName.charAt(i)<'a'||firstName.charAt(i)>'z'){
                check = false;
                break;
            }
            if (firstName.charAt(0) < 'A' || firstName.charAt(0) > 'Z') {
                check = false;
                break;
            }
        }
        if (check == true) {
            this.firstName=firstName;
        }else{
            System.out.println("Name shouldn't contain symbols and should start with capital letter and  have only small letter");
        }
    }

    public String getFirstName() {
        return firstName;
    }
}
