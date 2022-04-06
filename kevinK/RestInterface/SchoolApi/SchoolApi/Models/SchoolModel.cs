using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SchoolApi.Models
{
    public class SchoolModel
    {
        public int id;
        public List<RoomModel> rooms;
        public List<ClassModel> classes;
        public List<TeacherModel> teachers;
        public TeacherModel director;

        public SchoolModel(int id, List<RoomModel> rooms, List<ClassModel> classes, List<TeacherModel> teachers, TeacherModel director)
        {
            this.id = id;
            this.rooms = rooms;
            this.classes = classes;
            this.teachers = teachers;
            this.director = director;

        }

    }
}
