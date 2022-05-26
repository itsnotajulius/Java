package src.Interfacess.Saving;
import java.util.List;

public interface ISaveable {
    public void read(List<String> savedValues);
    public List<String> write();
}
