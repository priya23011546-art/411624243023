from fastapi import FastAPI 
from routes import Router

app = FastAPI()
app.include_router(Router)