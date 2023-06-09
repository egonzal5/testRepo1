package teamV2;

public class Team {
	private Player[] list;
	private int size;

	public Team(int maxSize) {
		list = new Player[maxSize];
		size = 0;
	}

	public boolean add(Player player) {
		if (size < list.length) {
			list[size++] = player;
			return true;
		}

		return false;
	}

	public String toString() {
		String answer = "";

		for (int i = 0; i < size; i++) {
			answer += list[i] + "\n";
		}

		return answer;
	}

	/*
	 * We need these get methods for the TeamIterator implementation Using inner
	 * classes will not require them.
	 */
	public int getSize() {
		return size;
	}

	public Player getPlayer(int i) {
		return list[i];
	}
}
