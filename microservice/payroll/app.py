from urllib import response
from flask import Flask,request

app = Flask(__name__)

@app.route('/payroll')
def initiate():
    designation = request.args.get('designation')
    if designation != 'Lead Engineer':
        return {
        "basepay": 2500000,
        "PF": 120000,
        "other": 540000
    }

    response = {
        "basepay": 600000,
        "PF": 120000,
        "other": 340000
    }
    return response


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5003)