package co.com.choucair.retofinancial.model;

public class Formulario {
    private String name;
    private String last;
    private String addres;
    private String email;
    private String phone;
    private String password;
    private String confirm;
    private String verificar;

    public String getName() {
        return this.name;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getVerificar() {return verificar; }

    public void setVerificar(String verificar) { this.verificar = verificar; }


}
