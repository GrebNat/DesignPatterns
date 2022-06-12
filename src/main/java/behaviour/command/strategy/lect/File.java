package behaviour.command.strategy.lect;

/*
 * Created by grebena1 on 30.05.2022
 * Description:
 */
public class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void encrypt(Encryptor encryptor){
        System.out.println(encryptor.encryptFile() + "to" + fileName);
    }
}
