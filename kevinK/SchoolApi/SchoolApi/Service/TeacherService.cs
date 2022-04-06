using SchoolApi.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;

namespace SchoolApi.Service
{
    public class TeacherService
    {
        static HttpClient client = new HttpClient();


        static async Task<TeacherModel> getTeacher(string path)
        {
            TeacherModel teacher = null;
            HttpResponseMessage response = await client.GetAsync(path);
            string teacherString = "";

            if (response.IsSuccessStatusCode)
            {
                teacherString = await response.Content.ReadAsStringAsync();
            }

            Console.WriteLine(teacherString);

            return teacher;
        }
    }
}
