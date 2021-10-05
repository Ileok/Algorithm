#include <iostream>
#include <string>
using namespace std;

int main() {

	int n;
	cin >> n;

	cin.ignore(); // 버퍼 비워주기

	string plans;	
	getline(cin, plans);

	int x = 1; int y = 1;

    int dx[4] = {0, 0, -1, +1};
	int dy[4] = {-1, +1, 0, 0};
	char move_types[4] = { 'L', 'R', 'U', 'D' };

	for (int i = 0; i < plans.size(); i++) {
		int nx = 0; int ny = 0;
		for (int j = 0; j < 4; j++) {
			if (plans[i] == move_types[j]) {
				nx = x + dx[j];
				ny = y + dy[j];
			}
		}
		if (nx <1 || nx >n || ny <1 || ny >n) {
			continue;
		}
		else {
			x = nx; 
			y = ny;
		}
	}
	cout << x << " " << y;
	return 0;
}