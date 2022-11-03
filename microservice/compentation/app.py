import time
from urllib import response
from flask import Flask,request
import random

app = Flask(__name__)

@app.route('/compentation')
def initiate():
    time.sleep(5)
    designation = request.args.get('designation')
    print(designation)
    response = {
        "compentation":{
            "bonus":200000,
            "stocks":{
                "unit":100,
            "price":33,
                "currency":"usd"           }
        
        }
    }
    return response


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5002)