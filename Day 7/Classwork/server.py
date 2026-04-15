import socket

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server.bind(("127.0.0.1", 5566))

print("Server is running...")


while True:
    data, addr = server.recvfrom(1024)
    print(f"{addr} : {data.decode()}")
    server.sendto(b"Received", addr)