using System;

namespace Fonlow.Cli
{
	/// <summary>
	/// Helper functions to provide colorful print of console messages.
	/// </summary>
	public static class AppConsole
	{
		public static void PrintException(Exception ex)
		{
			if (ex != null)
			{
				Error($"Message: {ex}");
				Console.WriteLine();
				PrintException(ex.InnerException);
			}
		}

		public static void Info(string s, params object[] formatArgs)
		{
			WriteColoredText(ConsoleColor.White, s, formatArgs);
		}

		public static void Debug(string s, params object[] formatArgs)
		{
			WriteColoredText(ConsoleColor.Gray, s, formatArgs);
		}

		public static void Warn(string s, params object[] formatArgs)
		{
			WriteColoredText(ConsoleColor.Magenta, s, formatArgs);
		}

		public static void Error(string s, params object[] formatArgs)
		{
			WriteColoredText(ConsoleColor.Red, s, formatArgs);
		}

		public static void Success(string s, params object[] formatArgs)
		{
			WriteColoredText(ConsoleColor.Green, s, formatArgs);
		}

		static void WriteColoredText(ConsoleColor color, string s, params object[] formatArgs)
		{
			var c = Console.ForegroundColor;
			Console.ForegroundColor = color;
			Console.WriteLine(s, formatArgs);
			Console.ForegroundColor = c;
		}
	}
}
