using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WMPLib;
using System.Data.SqlClient;

namespace ShredShop
{
    public partial class LoginPage : Form
    {
        DataTable mytable = new DataTable();
        SqlConnection myconn = new SqlConnection();
        SqlDataAdapter myadapter = new SqlDataAdapter();

        private String TxtUN = "";
        private String TxtPW = "";

        WindowsMediaPlayer player = new WindowsMediaPlayer();
        public LoginPage()
        {
            InitializeComponent();
           // player.URL = "intro.mp3";
            SetStyle(ControlStyles.SupportsTransparentBackColor, true);
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            player.controls.play();
            this.BackColor = Color.Transparent;
            //logoPicBox.Image = ShredShop.Properties.Resources.ss_logo;
        }

        private void SignUpLbl_Click(object sender, EventArgs e)
        {
            this.Hide();
            RegisterPage f2 = new RegisterPage();
            f2.ShowDialog();
        }

        private void LogInBtn_Click(object sender, EventArgs e)
        {
            //NEED : Validation & Authentication Methodss
            //Establish a connection
            myconn.ConnectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;AttachDbFilename=C:\\Users\\Krzys\\Desktop\\FINAL SEMESTER!\\Visual Studio .net\\FINAL PROJ\\ShredShop\\MembersDB.mdf;Integrated Security=True;Connect Timeout=30";
            myconn.Open();
            SqlCommand mycommand = new SqlCommand();
            mycommand.CommandText = "Select Count(*) From MembersT where MemUN = @UN"; //AND MemPW = @PW
            mycommand.Parameters.Add("@UN", SqlDbType.VarChar, 50);
            mycommand.Parameters["@UN"].Value = usernameTxt.Text;
            //mycommand.Parameters.Add("@PW", SqlDbType.VarChar, 50);
            //mycommand.Parameters["@PW"].Value = passwordTxt.Text;
            mycommand.Connection = myconn;

            //Create adapter (messenger)
            myadapter.SelectCommand = mycommand;
            myadapter.Fill(mytable);
            if (mytable.Rows[0][0].ToString() == "1") {
                //Redirect to page
                this.Hide();
                MainPage Mp = new MainPage();
                Mp.ShowDialog();
            }
            else
            {
                MessageBox.Show("Error no UN like that");
            }
            myconn.Close();
        }

        private void logoPicBox_Click(object sender, EventArgs e)
        {
            //Redirect to page
            this.Hide();
            MainPage Mp = new MainPage();
            Mp.ShowDialog();
        }

        private void label1_Click(object sender, EventArgs e)
        {
            DialogResult dr = MessageBox.Show("Do you want to exit.", "Message", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (dr == DialogResult.Yes)
            {
                Application.ExitThread();
            }
            else { }
        }

        private void label1_MouseEnter(object sender, EventArgs e)
        {
            ExitLabel.ForeColor = Color.Red;
        }

        private void ExitLabel_MouseLeave(object sender, EventArgs e)
        {
            ExitLabel.ForeColor = Color.Black;
        }
        private void usernameTxt_TextChanged(object sender, EventArgs e)
        {
            TxtUN = usernameTxt.Text;
        }
        private void passwordTxt_TextChanged(object sender, EventArgs e)
        {
            TxtPW = passwordTxt.Text;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

        }
    }
}
