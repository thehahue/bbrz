using Microsoft.AspNetCore.Mvc;
using SchoolApi.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SchoolApi.Controllers
{
    [ApiController]
    [Route("[teacher]")]
    public class TeacherController : ControllerBase
    {

        [HttpGet]
        public TeacherModel Get()
        {
            TeacherModel teacher = new TeacherModel(1, "test", "test", DateTime.Today, "test");
            return teacher;

        }
    }
}
