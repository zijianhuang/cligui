using Fonlow.CommandLineGui.Gui;
using System.ComponentModel;
using System.Drawing.Design;
using System.Windows.Forms.Design;
using System;

namespace Fonlow.CommandLineGui.Robocopy
{
	public class FlagsEditor<T, TEnumType> : UITypeEditor where T : EnumFlagsUc<TEnumType>, new()
	{
		public override object EditValue(ITypeDescriptorContext context, IServiceProvider provider, object value)
		{
			if (provider == null)
				throw new ArgumentNullException("provider");

			if (value == null)
				throw new ArgumentNullException("value");

			if (value.GetType() != typeof(TEnumType))
				return value;

			// Uses the IWindowsFormsEditorService to display a 
			// drop-down UI in the Properties window.
			using (var EnumFlagsUc = (new EnumFlagsUc<TEnumType>((TEnumType)value)) as T)
			{
				IWindowsFormsEditorService edSvc = (IWindowsFormsEditorService)provider.GetService(typeof(IWindowsFormsEditorService));
				if (edSvc != null)
				{
					edSvc.DropDownControl(EnumFlagsUc);
					int flags = EnumFlagsUc.Flags;
					return flags;
				}
			}
			return value;

		}

		public override UITypeEditorEditStyle GetEditStyle(ITypeDescriptorContext context)
		{
			return UITypeEditorEditStyle.DropDown;
		}

	}

	public class CopyFlagsEditor : FlagsEditor<EnumFlagsUc<CopyFlags>, CopyFlags>
	{
	}

	public class RashFlagsEditor : FlagsEditor<EnumFlagsUc<Rashcneto>, Rashcneto>
	{
	}
}
