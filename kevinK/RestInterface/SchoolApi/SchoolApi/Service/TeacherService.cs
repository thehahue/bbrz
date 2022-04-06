using SchoolApi.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;
using System.Web;

namespace SchoolApi.Service
{
    public class TeacherService
    {
        static HttpClient client = new HttpClient();

        static async Task<TeacherModel> getTeacher(string path)
        {
            TeacherModel teacher = null;
            HttpResponseMessage response = await client.GetAsync(path);

            if (response.IsSuccessStatusCode)
            {
                teacher = await response.Content.ReadAsStringAsync();
            }
            Console.WriteLine(teacher.firstName);
            return teacher;
        }
    }
}
