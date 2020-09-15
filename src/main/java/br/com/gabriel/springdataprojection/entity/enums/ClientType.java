package br.com.gabriel.springdataprojection.entity.enums;

public enum ClientType {

    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    ClientType(String value) {
        this.value = value;
    }
}
