import java.util.Random;

public class Randomizer {

    static class Data { // armazenagem de dados
        static String[] lowerAlph = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        private String password = ""; // string privada onde sera armazenada a senha gerada

        public String getPassword() { //getter da string privada
            return password;
        }

        public void setPassword(String password) { // setter da string privada
            this.password = password;
        }
    }
       static String randomizeChar() { // metodo para gerar uma nova senha aleatoria
        Random random = new Random();
        String randomChar = "";
        for (int i = 0; i < 8; i++) { // indexacao e concatenacao do metodo
            int index = random.nextInt(Data.lowerAlph.length);
            randomChar += Data.lowerAlph[index];
        }
        return randomChar;
       }


    public static String main(String[] args) { // chamado da nova string serializada
        Data displayPassword = new Data();
        displayPassword.setPassword(randomizeChar());
        return displayPassword.getPassword();

    }
    }