using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ShredShop
{
    public partial class RegisterPage : Form
    {
        public RegisterPage()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void RegisterBtn_Click(object sender, EventArgs e)
        {
            //Establish a connection
            SqlConnection myconn = new SqlConnection(@"Data Source=(LocalDB)\\MSSQLLocalDB;AttachDbFilename=C: \\Users\\Krzys\\Desktop\\FINAL SEMESTER!\\Visual Studio .net\\FINAL PROJ\\ShredShop\\MembersDB.mdf;Integrated Security=True;Connect Timeout=30");
            myconn.Open();
            //Create adapter (messenger)
            SqlDataAdapter myadapter = new SqlDataAdapter();
            DataTable dt = new DataTable();


            SqlCommand mycommand = new SqlCommand();
            mycommand.CommandText = "Select Count(*) From MembersT where MemUN = @UN";
            mycommand.Parameters.Add("@UN", SqlDbType.VarChar, 50);
            mycommand.Parameters["@UN"].Value = usernameTxt.Text;
            mycommand.Connection = myconn;




            //NEED : Verify user doesn't already exist in system
           

            //   Create an Adapter  (messenger carrying our request)
            myadapter.SelectCommand = mycommand;



            Boolean RegisteredSuccessfully = false;
            if (RegisteredSuccessfully) {
                MessageBox.Show("Sucessfully Registered");
                //Redirect back to Login
                this.Hide();
                LoginPage f1 = new LoginPage();
                f1.ShowDialog();
            }
            else { }

        }
    }
}
