from urllib import response
from flask import Flask

app = Flask(__name__)

@app.route('/')
def main():
    return 'success'

@app.route('/asset')
def initiate():
    response = {
        "Desktop": {
        "serial": "SER10201"
      }
    }
    return response


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5004)