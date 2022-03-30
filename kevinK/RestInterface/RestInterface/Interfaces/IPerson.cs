using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RestInterface.Interfaces
{
    public interface IPerson
    {
        int id { get; set; }
        string firstName { get; set; }
        string lastName { get; set; }
        DateTime birthDate { get; set; }

    }
}
