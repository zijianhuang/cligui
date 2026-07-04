using Fonlow.Cli;
using Plossum.CommandLine;
using System;
using Xunit;

namespace TestBetter
{
     
    public class CmdLineParserTests
    {
        [Fact]
        public void TestCommandAndArgs()
        {
            Options options = new Options();
            var parser = new CommandLineParser(options);
            parser.Parse("abcde.exe  /F DoSomething /Intp 1234 /filters f1 \"Akk kB\" f3 \"kke fff\" /byteP 123 /filters abc /filters kkk");
            Assert.False(parser.HasErrors);
            Assert.Equal("DoSomething", options.Function);
            Assert.Equal(1234, options.IntP);
            Assert.Equal(6, options.Filters.Length);
            Assert.Equal(123, options.ByteP);
            Assert.False(options.Help);
            Assert.Equal("abcde.exe", parser.ExecutablePath);
        }

        [Fact]
        public void TestCommandLineNoExecutable()
        {
            Options options = new Options();
            var parser = new CommandLineParser(options);
            parser.Parse("/F DoSomething /Intp 1234 /filters f1 \"Akk kB\" f3 \"kke fff\" /byteP 123 /h  /fi abc /fil kkk", false);
            Assert.False(parser.HasErrors);
            Assert.Equal("DoSomething", options.Function);
            Assert.Equal(1234, options.IntP);
            //   Assert.Equal(123, options.ByteP);
            Assert.Equal(6, options.Filters.Length);
            Assert.Equal(123, options.ByteP);
            Assert.True(options.Help);
            Assert.Null(parser.ExecutablePath);
        }

		[Fact]
		public void TestArgs()
		{
			string[] args = new string[] { "/filters", "f1", "Akk kB", "f3", "kke fff" };//.net console app will rip of double quotes, so all args won't be quoted string.
			Options options = new Options();
			var parser = new CommandLineParser(options);
			parser.Parse(args);
			Assert.False(parser.HasErrors);
			Assert.Equal("f1", options.Filters[0]);
			Assert.Equal(4, options.Filters.Length);
			Assert.Equal("Akk kB", options.Filters[1]);
			Assert.Null(parser.ExecutablePath);
		}

		[Fact]
		public void TestArgsWithSlashMiddle()
		{
			string[] args = new string[] { "/filters", "\"/f1\"", "Akk/kB", "f3", "kke fff" };//.net console app will rip of double quotes, so all args won't be quoted string.
			Options options = new Options();
			var parser = new CommandLineParser(options);
			parser.Parse(args);
			Assert.False(parser.HasErrors);
			Assert.Equal("/f1", options.Filters[0]);
			Assert.Equal(4, options.Filters.Length);
			Assert.Equal("Akk/kB", options.Filters[1]);
			Assert.Null(parser.ExecutablePath);
		}

		[Fact]
		public void TestArgsWithSlashMiddleLine()
		{
			string[] args = new string[] { "/filters", "\"/f1\"", "Akk/kB", "f3", "kke fff" };//.net console app will rip of double quotes, so all args won't be quoted string.
			Options options = new Options();
			var parser = new CommandLineParser(options);
			parser.Parse("/filters=\"/f1\" \"Akk/kb\" f3 \"kke fff\"", false);
			Assert.False(parser.HasErrors);
			Assert.Equal("/f1", options.Filters[0]);
			Assert.Equal(4, options.Filters.Length);
			Assert.Equal("Akk/kb", options.Filters[1]);
			Assert.Null(parser.ExecutablePath);
		}

		[Fact]
		public void TestArgsWithSlashPrefix()
		{
			string[] args = new string[] { "/filters", "\"//svg:text/svg:tspan\"", "f3", "\"/kke/fff\"" };//.net console app will rip of double quotes, so all args won't be quoted string.
			Options options = new Options();
			var parser = new CommandLineParser(options);
			parser.Parse(args);
			Assert.False(parser.HasErrors);
			Assert.Equal(3, options.Filters.Length);
			Assert.Equal("//svg:text/svg:tspan", options.Filters[0]);
			Assert.Null(parser.ExecutablePath);
		}

		[Fact]
		public void TestArgsWithSlashPrefixLine()
		{
			Options options = new Options();
			var parser = new CommandLineParser(options);
			parser.Parse("/filters=\"//svg:text/svg:tspan\" f3 \"/kke/fff\"", false);
			Assert.False(parser.HasErrors);
			Assert.Equal(3, options.Filters.Length);
			Assert.Equal("//svg:text/svg:tspan", options.Filters[0]);
			Assert.Null(parser.ExecutablePath);
		}

		[Fact]
		public void TestArgsWithSlashPrefixLineWithExe()
		{
			Options options = new Options();
			var parser = new CommandLineParser(options);
			parser.Parse("myapp.exe /filters=\"//svg:text/svg:tspan\" f3 \"/kke/fff\"", true);
			Assert.False(parser.HasErrors);
			Assert.Equal(3, options.Filters.Length);
			Assert.Equal("//svg:text/svg:tspan", options.Filters[0]);
			Assert.NotNull(parser.ExecutablePath);
		}

		[Fact]
		public void TestTranslationOptions()
		{
			OptionsBase options = new OptionsForXmlWithGoogleTranslate();
			var parser = new CommandLineParser(options);
			parser.Parse("/AKF=../../Secrets/GoogleTranslate/apikey.txt /SL=en /TL=\"zh-hant\" /XPaths=\"//svg:text/svg:tspan\" /F=../Tests/TestTranslation/svg/template1.svg /TF=../Tests/TestTranslation/bin/template1.zh-Hant.svg", false);
			Assert.False(parser.HasErrors);
			var gOptions = options as OptionsForXmlWithGoogleTranslate;
			Assert.Equal(1, gOptions.XPaths.Length);
			Assert.Equal("//svg:text/svg:tspan", gOptions.XPaths[0]);
			Assert.Null(parser.ExecutablePath);
		}

		[Fact]
		public void TestTranslationOptionsBackTick()
		{
			OptionsBase options = new OptionsForXmlWithGoogleTranslate();
			var parser = new CommandLineParser(options);
			parser.Parse("/AKF=../../Secrets/GoogleTranslate/apikey.txt /SL=en /TL=\"zh-hant\" /XPaths=`//svg:text/svg:tspan` `/svg:text/svg:abc` /F=../Tests/TestTranslation/svg/template1.svg /TF=../Tests/TestTranslation/bin/template1.zh-Hant.svg", false);
			Assert.False(parser.HasErrors);
			var gOptions = options as OptionsForXmlWithGoogleTranslate;
			Assert.Equal(2, gOptions.XPaths.Length);
			Assert.Equal("//svg:text/svg:tspan", gOptions.XPaths[0]);
			Assert.Equal("/svg:text/svg:abc", gOptions.XPaths[1]);
			Assert.Null(parser.ExecutablePath);
		}

		[Fact]
        public void TestPickyAllPropertiesAssigned()
        {
            var options = new PickyOptions();
            
            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa /Option2AtMostOne:bb /Option1AtLeastOne:ab /Option2AtLeastOne:kk /Option1ExactlyOne:eee /Option2ExactlyOne:nnn /Option1All:ttt /Option2All:ggg", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(2, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestPickyAllPropertiesAssignedInvalid()
        {
            var options = new PickyOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa /Option2AtMostOne:bb  ", false);
            var s = parser.ErrorMessage;

            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(4, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestPickyAtMostOne()
        {
            var options = new PickyOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa /Option2AtMostOne:bb /Option1AtLeastOne:ab /Option2AtLeastOne:kk /Option1ExactlyOne:eee /Option1All:ttt /Option2All:ggg", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestPickyAtLeastOne()
        {
            var options = new PickyOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa     /Option1ExactlyOne:eee   /Option1All:ttt /Option2All:ggg", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestPickyExactlyOne()
        {
            var options = new PickyOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa  /Option1ExactlyOne:eee  /Option1All:ttt /Option2All:ggg", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestPickyAll()
        {
            var options = new PickyOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa  /Option1AtLeastOne:ab  /Option1ExactlyOne:eee  /Option1All:ttt ", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestProhibitsAllPropertiesAssigned()
        {
            var options = new POptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa /Option2AtMostOne:bb /Option1AtLeastOne:ab /Option2AtLeastOne:kk /Option1ExactlyOne:eee /Option2ExactlyOne:nnn /Option1All:ttt /Option2All:ggg", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(5, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestProhibitsAllPropertiesAssignedWithAlias()
        {
            var options = new POptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option1AtMostOne:aa /Option2AtMostOne:bb /Option1AtLeastOne:ab /Option2AtLeastOne:kk /Option1ExactlyOne:eee /O2E1:nnn /Option1All:ttt /Option2All:ggg", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(5, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestProhibitsPropertiesAssigned()
        {
            var options = new POptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Option2AtLeastOne:ab /Op2eOne:hahah", false);
            var s = parser.ErrorMessage;

            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestMaxOccursOK()
        {
            var options = new MaxOccursOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Files:abc efg", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Null(s);
        }

        [Fact]
        public void TestMaxOccursSilly()
        {
            var options = new MaxOccursOptionsSilly
            {
                Silly = "kk"
            };

            var parser = new CommandLineParser(options);
            parser.Parse("/Silly:kk", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestMaxOccurs()
        {
            var options = new MaxOccursOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Files:abc efg hijkdfd 444", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestMinOccursExpect2But1()
        {
            var options = new MaxOccursOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Files:abc ", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }



        [Fact]
        public void TestNumericOptionsWithGoodValue()
        {
            var options = new NumericOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Money:100", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Null(s);
        }

        [Fact]
        public void TestNumericOptionsWithTooSmallValue()
        {
            var options = new NumericOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Money:5", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestNumericOptionsWithTooGreatValue()
        {
            var options = new NumericOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Money:100000", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestNumericOptionsWithArray()
        {
            var options = new NumericOptions
            {
                Prices = new int[] { 5, 100, 300, 5000, 100000 }
            };

            var parser = new CommandLineParser(options);
            parser.Parse("/Prices:5 100 300 5000 100000", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(2, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }




        [Fact]
        public void TestDecimalOptionsWithTooSmallValue()
        {
            var options = new DecimalOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Money:5", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestDecimalOptionsWithTooGreatValue()
        {
            var options = new DecimalOptions();

            var parser = new CommandLineParser(options);
            parser.Parse("/Money:100000", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(1, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }

        [Fact]
        public void TestDecimalOptionsWithArray()
        {
            var options = new DecimalOptions
            {
                Prices = new decimal[] { 5, 100, 300, 5000, 100000 }
            };

            var parser = new CommandLineParser(options);
            parser.Parse("/Prices:5 100 300 5000 100000", false);
            var s = parser.ErrorMessage;
            System.Diagnostics.Debug.WriteLine(s);
            Assert.Equal(2, s.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries).Length);
        }


    }

	[CliManager(Description = "Use Google Translate v2 or v3 to translate XML Text based on XPaths", OptionSeparator = "/", Assignment = ":")]
	internal sealed class OptionsForXmlWithGoogleTranslate : OptionsWithGoogleTranslate
	{
		[CommandLineOption(Aliases = "XPS", Description = "XML text nodes to be translated represented by Xpaths, e.g., /XPS=\"//svg:text/svg:tspan\" \"//ns:pp/ns:span\"")]
		public string[] XPaths { get; set; } = [];

		[CommandLineOption(Aliases = "XPSF", Description = "Each line declares a XPath for text nodes to be translated, e.g., /XPSF=XPaths.txt")]
		public string XPathsFile { get; set; }

	}

	public class OptionsWithGoogleTranslate : OptionsBase
	{
		[CommandLineOption(Aliases = "AK", Description = "Google Translate API key. e.g., /AK=zasdfSDFSDfsdfdsfs234sdsfki")]
		public string ApiKey { get; set; }

		[CommandLineOption(Aliases = "AKF", Description = "Google Translate API key stored in a text file. e.g., /AKF=C:/Users/Public/DevApps/GtApiKey.txt")]
		public string ApiKeyFile { get; set; }

		[CommandLineOption(Aliases = "AV", Description = "Google Translate API version. Default to V2. If V3, a client secret JSON file is expected.")]
		public string ApiVersion { get; set; } = "V2";

		[CommandLineOption(Aliases = "CSF", Description = "Google Cloud Translate V3 does not support API key but rich ways of authentications. This app uses client secret JSON file you could download from your Google Cloud Service account.")]
		public string ClientSecretFile { get; set; }

		[CommandLineOption(Aliases = "Reversed", Description = "Translate from target language to source language and save the result to the target file so you can compare. Both SourceFile and TargetFile must be defined.")]
		public bool ReversedTranslation { get; set; }

	}

	/// <summary>
	/// Common options
	/// </summary>
	public class OptionsBase
	{
		[CommandLineOption(Aliases = "F", Description = "Source file path")]
		public string SourceFile { get; set; }

		[CommandLineOption(Aliases = "TF", Description = "Target file path. Without this, the source file is also the target file.")]
		public string TargetFile { get; set; }

		[CommandLineOption(Aliases = "SL", Description = "Source language. e.g., /SL=fr")]
		public string SourceLang { get; set; }

		[CommandLineOption(Aliases = "TL", Description = "Target language. e.g., /TL=zh")]
		public string TargetLang { get; set; }

		[CommandLineOption(Aliases = "B", Description = "Batch processing of string array to improve overall speed.")]
		public bool Batch { get; set; }

		[CommandLineOption(Aliases = "h ?", Name = "Help", Description = "Shows this help text")]
		public bool Help
		{
			get;
			set;
		}
	}
}
