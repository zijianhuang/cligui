namespace Fonlow.CommandLineGui.Gui
{
    partial class FlagsUC
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

		#region Component Designer generated code

		/// <summary> 
		/// Required method for Designer support - do not modify 
		/// the contents of this method with the code editor.
		/// </summary>
		private void InitializeComponent()
		{
			checkedListBox = new System.Windows.Forms.CheckedListBox();
			SuspendLayout();
			// 
			// checkedListBox
			// 
			checkedListBox.CheckOnClick = true;
			checkedListBox.ColumnWidth = 40;
			checkedListBox.FormattingEnabled = true;
			checkedListBox.Items.AddRange(new object[] { "D", "A", "T", "S", "O", "U" });
			checkedListBox.Location = new System.Drawing.Point(4, 3);
			checkedListBox.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
			checkedListBox.MultiColumn = true;
			checkedListBox.Name = "checkedListBox";
			checkedListBox.Size = new System.Drawing.Size(246, 22);
			checkedListBox.TabIndex = 13;
			// 
			// FlagsUC
			// 
			AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
			AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			Controls.Add(checkedListBox);
			Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
			Name = "FlagsUC";
			Size = new System.Drawing.Size(296, 29);
			ResumeLayout(false);
		}

		#endregion

		protected System.Windows.Forms.CheckedListBox checkedListBox;
    }
}
