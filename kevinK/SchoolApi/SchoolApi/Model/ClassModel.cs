using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SchoolApi.Model
{
    public class ClassModel
    {
        public int id;
        public List<StudentModel> students;
        public TeacherModel teacher;

        public ClassModel(int id, List<StudentModel> students, TeacherModel teacher)
        {
            this.id = id;
            this.students = students;
            this.teacher = teacher;
        }
    }
}
