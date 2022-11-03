import imp
from urllib import response
from flask import Flask
import time
app = Flask(__name__)

@app.route('/notify')
def initiate():
    time.sleep(10)
    print('Email Notified successfully...')
    return "success"


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5007)