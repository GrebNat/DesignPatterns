package strategy.lect;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        File file = new File("text.txt");

        AESEncryptorImpl aesEncryptor = new AESEncryptorImpl();
        file.encrypt(aesEncryptor);
        Encryptor encryptor = ()->"apply enother encr";
        file.encrypt(encryptor);
    }
}
