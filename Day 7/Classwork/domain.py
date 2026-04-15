import socket 

def resolve(domain):
    try:
        ip = socket.gethostbyname(domain)
        print(f"{domain} resolves to {ip}")
    except socket.gaierror:
        print(f"Could not resolve {domain}")

resolve("youtube.com")
