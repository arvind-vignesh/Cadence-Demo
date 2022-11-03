from urllib import response
from flask import Flask, request

app = Flask(__name__)

@app.route('/finance',methods = ['POST'])
def initiate():
    print(request.data)
    print(request.get_json())
    content = request.get_json()
    if 'compenstation' in content and 'payroll' in content:
        return {"resp":True}
    else:
        return {"resp":False}

if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5001)