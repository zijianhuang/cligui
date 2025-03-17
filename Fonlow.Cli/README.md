Command Line GUI (CliGui) project includes a command line arguments parser library for constructing .NET console app with complex arguments. This is a migration from [Command Line GUI](https://github.com/zijianhuang/commandlinegui) (commandlinegui) which was developed for .NET Framework.

You define a data model class decorated by some attributes for represeting arguments/parameters. The core library will:
1. Parse the commaline arguments and populate the Plain Old CLR Object which is the router of the functionality of your command line program.
1. Provide basic validations.
1. Provide extended validations of the app.
1. Generates CLI help page.
1. Support rules of inclusion, exclusion and combination among options.


## References

* [Get the Best of Both Worlds: Command Line and GUI](https://www.codeproject.com/Articles/649950/Get-the-Best-of-Both-Worlds-Command-Line-and-GUI)
