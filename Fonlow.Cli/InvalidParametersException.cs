using System.Runtime.Serialization;

namespace Fonlow.Cli
{
	[Serializable]
    public class InvalidParametersException : Exception
    {
        public InvalidParametersException():base()
        {

        }

        public InvalidParametersException(string message):base(message) { }

        public InvalidParametersException(string message, Exception innerException)
            : base(message, innerException)
        {

        }
    }

}
