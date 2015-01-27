@Grab(group='com.github.groovy-wslite', module='groovy-wslite', version='0.8.0')
import wslite.soap.*
import groovy.swing.SwingBuilder


def client = new SOAPClient('http://www.webservicex.net/stockquote.asmx')
def response = client.send(SOAPAction: 'http://www.webserviceX.NET/GetQuote') {
    body {
        GetQuote( xmlns: 'http://www.webserviceX.NET/') {
           //symbol('GOOG')
           //mkp.yieldUnescaped "<symbol>${stock}</symbol>"
        }
    }
}

println response.GetQuoteResponse.GetQuoteResult.text()