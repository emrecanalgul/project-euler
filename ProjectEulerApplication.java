import ProjectEuler.PE001;
import ProjectEuler.PE002;
import ProjectEuler.PE003;
import base.IProjectEuler;

public class ProjectEulerApplication {

    public  static  void main(String[] args){
        IProjectEuler projectEuler = new PE003();
        projectEuler.Run();
    }

}
