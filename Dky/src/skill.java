import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;

public class skill {
    //private String Skill= new ArrayList<>();
    public String Num_to_Skill(int num){
        String sk="";
        switch (num){
            case 1:
                sk=("Làm Việc Nhóm"); break;
            case 2:
                sk=("Thuyết Trình"); break;
            case 4:
                sk=("Giao Tiếp"); break;
            case 3:
                sk=("<html>Làm Việc Nhóm<br>Thuyết Trình</html>"); break;
            case 5:
                sk=("<html>Làm Việc Nhóm<br>Giao Tiếp</html>"); break;
            case 6:
                sk=("<html>Thuyết Trình<br>Giao Tiếp</html>"); break;
            case 7:
                sk=("<html>Làm Việc Nhóm<br>Thuyết Trình<br>Giao Tiếp</html>"); break;
        }
        return sk;
    };
}
