namespace ShredShop
{
    partial class LoginPage
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(LoginPage));
            this.logInBtn = new System.Windows.Forms.Button();
            this.passwordLbl = new System.Windows.Forms.Label();
            this.usernameLbl = new System.Windows.Forms.Label();
            this.passwordTxt = new System.Windows.Forms.TextBox();
            this.usernameTxt = new System.Windows.Forms.TextBox();
            this.logoPicBox = new System.Windows.Forms.PictureBox();
            this.signUpLbl = new System.Windows.Forms.Label();
            this.ExitLabel = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.logoPicBox)).BeginInit();
            this.SuspendLayout();
            // 
            // logInBtn
            // 
            resources.ApplyResources(this.logInBtn, "logInBtn");
            this.logInBtn.Name = "logInBtn";
            // 
            // passwordLbl
            // 
            resources.ApplyResources(this.passwordLbl, "passwordLbl");
            this.passwordLbl.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.passwordLbl.Name = "passwordLbl";
            // 
            // usernameLbl
            // 
            resources.ApplyResources(this.usernameLbl, "usernameLbl");
            this.usernameLbl.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.usernameLbl.Name = "usernameLbl";
            // 
            // passwordTxt
            // 
            resources.ApplyResources(this.passwordTxt, "passwordTxt");
            this.passwordTxt.Name = "passwordTxt";
            this.passwordTxt.UseSystemPasswordChar = true;
            this.passwordTxt.TextChanged += new System.EventHandler(this.passwordTxt_TextChanged);
            // 
            // usernameTxt
            // 
            resources.ApplyResources(this.usernameTxt, "usernameTxt");
            this.usernameTxt.Name = "usernameTxt";
            this.usernameTxt.TextChanged += new System.EventHandler(this.usernameTxt_TextChanged);
            // 
            // logoPicBox
            // 
            this.logoPicBox.BackColor = System.Drawing.Color.Transparent;
            resources.ApplyResources(this.logoPicBox, "logoPicBox");
            this.logoPicBox.Name = "logoPicBox";
            this.logoPicBox.TabStop = false;
            this.logoPicBox.Click += new System.EventHandler(this.logoPicBox_Click);
            // 
            // signUpLbl
            // 
            resources.ApplyResources(this.signUpLbl, "signUpLbl");
            this.signUpLbl.BackColor = System.Drawing.Color.Transparent;
            this.signUpLbl.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            this.signUpLbl.Name = "signUpLbl";
            this.signUpLbl.Click += new System.EventHandler(this.SignUpLbl_Click);
            // 
            // ExitLabel
            // 
            resources.ApplyResources(this.ExitLabel, "ExitLabel");
            this.ExitLabel.BackColor = System.Drawing.Color.White;
            this.ExitLabel.ForeColor = System.Drawing.Color.Black;
            this.ExitLabel.Name = "ExitLabel";
            this.ExitLabel.Click += new System.EventHandler(this.label1_Click);
            this.ExitLabel.MouseEnter += new System.EventHandler(this.label1_MouseEnter);
            this.ExitLabel.MouseLeave += new System.EventHandler(this.ExitLabel_MouseLeave);
            // 
            // button1
            // 
            resources.ApplyResources(this.button1, "button1");
            this.button1.Name = "button1";
            // 
            // LoginPage
            // 
            resources.ApplyResources(this, "$this");
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.button1);
            this.Controls.Add(this.ExitLabel);
            this.Controls.Add(this.signUpLbl);
            this.Controls.Add(this.logInBtn);
            this.Controls.Add(this.logoPicBox);
            this.Controls.Add(this.passwordLbl);
            this.Controls.Add(this.usernameLbl);
            this.Controls.Add(this.passwordTxt);
            this.Controls.Add(this.usernameTxt);
            this.DoubleBuffered = true;
            this.Name = "LoginPage";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.logoPicBox)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button logInBtn;
        private System.Windows.Forms.PictureBox logoPicBox;
        private System.Windows.Forms.Label passwordLbl;
        private System.Windows.Forms.Label usernameLbl;
        private System.Windows.Forms.TextBox passwordTxt;
        private System.Windows.Forms.TextBox usernameTxt;
        private System.Windows.Forms.Label signUpLbl;
        private System.Windows.Forms.Label ExitLabel;
        private System.Windows.Forms.Button button1;
    }
}

