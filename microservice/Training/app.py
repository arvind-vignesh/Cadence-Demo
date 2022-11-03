from urllib import response
from flask import Flask,request
import json
app = Flask(__name__)

@app.route('/training',methods = ['POST'])
def initiate():
    trainings = []
    trainings.append({
                "url":"http://local.training.com/training1",
                "courseName":"training1"
            })
    trainings.append({
                "url":"http://local.training.com/training2",
                "courseName":"training2"
            })
    content = request.get_json()
    print(type(content['training']))
    #content = json.loads(content['training'].replace("'", '"'))
    print(content)
    print("-----------------------------------------------------------------")
    if 'training' in content:
        print(content['training'])
        for  training in content['training']:
            trainings.append({
                "url":"http://local.training.com/"+training,
                "courseName":training
            })
        return trainings

    return trainings


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5006)