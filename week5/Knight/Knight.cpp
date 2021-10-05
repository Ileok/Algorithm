#include <iostream>
#include <string>
using namespace std;

int dx[8] = {-2, -2, -1, 1, 2,  2, +1, -1};
int dy[8] = {-1, +1, 2, 2, -1, 1, -2, -2};

int main() {
	int answer = 0;

	string location;
	cin >> location; 
	int x = (location[1]-'0') -1; 
	int y = location[0] - 'a';

	for (int i = 0; i < 8; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
		if (nx < 0 || nx >7 || ny < 0 || ny >7)
			continue;
		else
			answer++;
	}
	cout << answer;
	return 0;
}