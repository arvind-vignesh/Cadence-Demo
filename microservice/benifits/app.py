from urllib import response
from flask import Flask
import time
app = Flask(__name__)

@app.route('/')
def main():
    return 'success'

@app.route('/benifit')
def initiate():
    time.sleep(5)
    response = {
       "wellbeing": [
        "shareCare",
        "grokers"
      ],
      "travel": True,
      "training": [
        "Leadership Anchor"
      ]
    }
    return response


if __name__ == '__main__':
    app.run(host="0.0.0.0",port=5005)