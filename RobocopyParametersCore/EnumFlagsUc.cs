using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Text;
using System.Windows.Forms;
using System.ComponentModel.Design;
using System.Drawing.Design;
using System.Windows.Forms.Design;

namespace Fonlow.CommandLineGui.Gui
{
	public class EnumFlagsUc<TEnumType> : FlagsUC
	{
		public EnumFlagsUc(): base()
		{

		}

		public EnumFlagsUc(TEnumType flags): base()
		{
			checkedListBox.ColumnWidth = columnWidth;
			checkedListBox.Items.Clear();

			string[] items = GetFlagCharactersInLines().Split(new string[] { Environment.NewLine }, StringSplitOptions.RemoveEmptyEntries);
			checkedListBox.Width = columnWidth * items.Length + 4;
			ClientSize = new Size(checkedListBox.Width + 6, ClientSize.Height);
			checkedListBox.Items.AddRange(items);

			FlaggedEnumConverter<TEnumType> converter = new FlaggedEnumConverter<TEnumType>();// explicit conversion is needed, as U can not be type casted into int.
			Flags = (int)converter.ConvertTo(flags, typeof(int));
		}

		/// <summary>
		/// Analyze enum type U and build a string each of which character represents a flag.
		/// The characters are separated by line breaks.
		/// </summary>
		/// <returns></returns>
		static string GetFlagCharactersInLines()
		{
			string[] flagNames = Enum.GetNames(typeof(TEnumType));
			StringBuilder builder = new StringBuilder();

			foreach (string s in flagNames)
			{
				if (s.Length == 1)
				{
					builder.Append(s + Environment.NewLine);
				}
			}
			return builder.ToString();
		}
	}
}
