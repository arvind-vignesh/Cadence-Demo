from urllib import response
from flask import Flask, request
import json
app = Flask(__name__)

@app.route('/')
def main():
    return 'success'

@app.route('/hr',methods = ['POST'])
def initiate():
    content = request.get_json()
    response = {
      "emailNotified": content['emailNotified'],
      "compenstation": content['compenstation'],
      "payroll": content['payroll'],
      "financeEnabled": content['financeEnabled']
    }
    return response


if __name__ == '__main__':
    app.run(host="0.0.0.0")