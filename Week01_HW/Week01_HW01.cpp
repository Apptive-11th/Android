#include <iostream>

using namespace std;

class mobilePhone {
protected:
	int price;
	float size;

public:
	mobilePhone() {}
	mobilePhone(int price, float size);

	void setPrice(int price);
	void setSize(float size);
};

mobilePhone::mobilePhone(int price, float size) {
	this->price = price;
	this->size = size;
}

void mobilePhone::setPrice(int price) {
	this->price = price;
}

void mobilePhone::setSize(float size) {
	this->size = size;
}

class samsung : public mobilePhone {
public:
	samsung() {}
	samsung(int price, float size);

	void printPrice();
	void printSize();
};

samsung::samsung(int price, float size) :mobilePhone(price, size) {}

void samsung::printPrice() {
	cout << "This samsung device is " << this->price << " won." << endl;
}

void samsung::printSize() {
	cout << "This samsung device has " << this->size << "-inch screen." << endl;
}

int main() {
	samsung galaxy(1000000, 8.0);

	galaxy.printPrice();
	galaxy.printSize();

	system("pause");
	return 0;
}
