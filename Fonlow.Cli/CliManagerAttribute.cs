using Plossum.CommandLine;
using System;
using System.Reflection;

namespace Fonlow.Cli
{

	[AttributeUsage(AttributeTargets.Class, AllowMultiple = false)]
	public sealed class CliManagerAttribute: CommandLineManagerAttribute
	{
		public CliManagerAttribute():base()
		{

		}

		public string ApplicationVersion
		{
			get
			{
				var av = Assembly.GetEntryAssembly();
				switch (VersionSource)
				{
					case VersionSource.AssemblyVersion:
						return Version;
					case VersionSource.FileVersion:
						return av.GetCustomAttribute<AssemblyFileVersionAttribute>()?.Version;
					case VersionSource.InformationVersion:
						return av.GetCustomAttribute<AssemblyInformationalVersionAttribute>()?.InformationalVersion;
					case VersionSource.UserSpecified:
						return Version;
					default:
						return av.GetCustomAttribute<AssemblyFileVersionAttribute>()?.Version;
				}
			}
		}

		public VersionSource VersionSource { get; set; } = VersionSource.FileVersion;
	}

	public enum VersionSource { AssemblyVersion, FileVersion, InformationVersion, UserSpecified };

}
