$packCmd = 'dotnet pack $Name --no-build --output C:/NugetLocalFeeds --configuration Release'
$projList = 'Fonlow.Cli/Fonlow.Cli.csproj', 'Fonlow.AntlrParser/Fonlow.AntlrParser.csproj'

foreach($name in $projList){
    Invoke-Expression $ExecutionContext.InvokeCommand.ExpandString($packCmd)
}