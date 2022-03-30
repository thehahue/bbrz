using RestInterface.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace RestInterface.Models
{
    public class TeacherModel : IPerson
    {
        public int id { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
        public string firstName { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
        public string lastName { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
        public DateTime birthDate { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }

        public string subject;

        public TeacherModel(int id, string firstName, string lastName, DateTime birthDate, string subject)
        {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.subject = subject;
        }
    }
}