package problemsToDo;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class ProblemsInFP1 {
    public  static  void main(String[] args){
        List<Student> list= Arrays.asList(
                new Student(1,"david","ca",22),
                new Student(2,"alex","cs",21),
                new Student(3,"raj","cs",20),
                new Student(4,"prakash","ca",19),
                new Student(5,"charles","bba",18),
                new Student(6,"alwin","bba",17),
                new Student(7,"antony","en",17),
                new Student(8,"kulandai","en",19),
                new Student(9,"monaliza","ms",18),
                new Student(10,"ravi","ms",17));

       System.out.println(list.stream().filter(age->age.getAge()>18).collect(toList()));
       System.out.println(list.stream().filter(id->id.getId()==5).collect(toList()));
       System.out.println(list.stream().map(name->name.getName()).collect(toList()));
       System.out.println(list.stream().map(dpt->dpt.getDept()).collect(toSet()));
       String string="helloo";
       System.out.println(string.chars().mapToObj(c->(char) c).collect(groupingBy(c->c, counting())));
    }
}
