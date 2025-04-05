using System;
using System.Reflection;

namespace Fonlow.Cli
{

	[AttributeUsage(AttributeTargets.Class, AllowMultiple = false)]
	public sealed class CliManagerAttribute : Attribute
	{
		public CliManagerAttribute()
		{
			OptionSeparator = "/";
			Assignment = ":";
			Assembly assembly = Assembly.GetEntryAssembly();
			if (assembly == null)
			{
				return;
			}

			foreach (object objAttribute in assembly.GetCustomAttributes(false))
			{
				AssemblyCopyrightAttribute copyrightAttribute = objAttribute as AssemblyCopyrightAttribute;
				if (copyrightAttribute != null)
				{
					Copyright = copyrightAttribute.Copyright;
					continue;
				}

				AssemblyTitleAttribute titleAttribute = objAttribute as AssemblyTitleAttribute;
				if (titleAttribute != null)
				{
					ApplicationName = titleAttribute.Title;
					continue;
				}

				AssemblyDescriptionAttribute descriptionAttribute = objAttribute as AssemblyDescriptionAttribute;
				if (descriptionAttribute != null)
				{
					Description = descriptionAttribute.Description;
					continue;
				}
			}

		}

		/// <summary>
		/// Gets or sets the name of the application.
		/// </summary>
		/// <value>The name of the application.</value>
		/// <remarks>If not explicitly specified, this value will be retrieved from the assembly information.</remarks>
		public string ApplicationName { get; set; }

		/// <summary>
		/// Gets or sets the copyright message.
		/// </summary>
		/// <value>The copyright message.</value>
		/// <remarks>If not explicitly specified, this value will be retrieved from the assembly information.</remarks>
		public string Copyright { get; set; }

		/// <summary>
		/// Gets or sets the description.
		/// </summary>
		/// <value>The description.</value>
		/// <remarks>If not explicitly specified, the application will be retrieved from the assembly information.</remarks>
		public string Description { get; set; }

		/// <summary>
		/// Gets or sets the version of this application.
		/// </summary>
		/// <value>The version of this application.</value>
		/// <remarks>If not explicitly specified, the application will be retrieved according to VersionSource.</remarks>
		public string Version
		{
			get
			{
				var av = Assembly.GetEntryAssembly();
				switch (VersionSource)
				{
					case VersionSource.AssemblyVersion:
						return av.GetName().Version.ToString();
					case VersionSource.FileVersion:
						return av.GetCustomAttribute<AssemblyFileVersionAttribute>()?.Version;
					case VersionSource.InformationVersion:
						return av.GetCustomAttribute<AssemblyInformationalVersionAttribute>()?.InformationalVersion;
					case VersionSource.UserSpecified:
						return mVersion;
					default:
						return av.GetCustomAttribute<AssemblyFileVersionAttribute>()?.Version;
				}
			}

			set
			{
				VersionSource = VersionSource.UserSpecified;
				mVersion = value;
			}
		}

		/// <summary>
		/// Gets or sets a value indicating whether options are case sensitive or not.
		/// </summary>
		/// <value>
		/// 	<c>true</c> if options are case sensitive; otherwise, <c>false</c>.
		/// </value>
		public bool IsCaseSensitive { get; set; }

		/// <summary>
		/// Gets or sets a value indicating whether options in this manager requires explicit assignment or not.
		/// </summary>
		/// <value>
		/// 	<c>true</c> if options require explicit assignment; otherwise, <c>false</c>.
		/// </value>
		/// <remarks>Explicit assignment means that the assignment character must be used to assign a value
		/// to an option. If set to false a space character after an option followed by a value will be interpreted
		/// as an assignment.
		/// <note>This value sets the default value for all options contained in this manager, but may be overridden for
		/// individual groups.</note></remarks>
		public bool RequireExplicitAssignment
		{
			get { return requireExplicitAssignment; }
			set { requireExplicitAssignment = value; RequireExplicitAssignmentAssigned = true; }
		}

		bool requireExplicitAssignment;

		public bool RequireExplicitAssignmentAssigned { get; private set; }

		/// <summary>
		/// Option separator in front of each option name.
		/// </summary>
		public string OptionSeparator { get; set; }

		/// <summary>
		/// Assignment symbol to be used between option name and values. The default is : 
		/// </summary>
		public string Assignment { get; set; }

		private string mVersion;


		/// <summary>
		/// Version displayed will be using what this specifies.
		/// </summary>
		public VersionSource VersionSource { get; set; } = VersionSource.FileVersion;
	}

	public enum VersionSource { AssemblyVersion, FileVersion, InformationVersion, UserSpecified };

}
