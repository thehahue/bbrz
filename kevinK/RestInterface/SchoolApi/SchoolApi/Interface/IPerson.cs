using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SchoolApi.Interface
{
    public interface IPerson
    {
        int id { get; set; }
        string firstName { get; set; }
        string lastName { get; set; }
        DateTime birthDate { get; set; }

    }
}
