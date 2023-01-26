import bank.Bank;

// Access modifiers ko access krne k tarike
/*Baaki sb to access krna easy hai, Protected jab use krenge to jo claas name hai uska jab object bnayenge
tabhi uske andr k properties/methods ko use kr skenge.

	Or jab private krenge, tab usko access krne k liye hum log getters & setters ka use krte hain.*/
class Manifest{
    public String name;
    protected String email;
    private String password;
    public String getPassword(){
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class OOPs {
    public static void main(String args[])
    {
        Bank obj = new Bank();
        obj.account();
//        System.out.println(obj.show());

        Manifest user = new Manifest();

        user.name = "Shradha";
        user.email = "mishra.shashankofficial06@gmail.com";
        user.setPassword("Aabcd");
        System.out.println("User name=> "+user.name+", User email=> "+user.email+", User password=> "+ user.getPassword());
    }
}
