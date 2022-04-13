using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SchoolApi.Model
{
    public class RoomModel
    {
        public int id;
        public string name;

        public RoomModel(int id, string name)
        {
            this.id = id;
            this.name = name;
        }
    }
}
