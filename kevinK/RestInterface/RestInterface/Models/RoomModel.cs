using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace RestInterface.Models
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