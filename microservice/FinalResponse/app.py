from urllib import response
from flask import Flask,request
import json
app = Flask(__name__)

@app.route('/response',methods = ['POST'])
def initiate():
    

    try:
        rdata = request.data.replace("\'","\"")
        print(rdata)
        content = json.loads(rdata)
        print(content)
        basic_profile = content['employeeDetails']
        response_template = {
        "name": basic_profile['name'],
        "designiation": basic_profile['designiation'],
        "eployeeId": basic_profile['employeeId'],
        "email": basic_profile['email'],
        "bankInfo":basic_profile['bankInfo'] ,
        "hr":content['hr'],
            "benifits": content['benifits'],
        "Asset": content['asset'],
            "training": content['training']
        }

        return response_template
    except Exception as e:
        print(e)
        return request.data


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5008)