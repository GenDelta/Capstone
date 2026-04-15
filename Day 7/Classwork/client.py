import socket 

client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

while True:
    msg = input("You: ")
    client_socket.sendto(msg.encode(), ("127.0.0.1", 5566))
    data, _ = client_socket.recvfrom(1024)
    print("Server:", data.decode())