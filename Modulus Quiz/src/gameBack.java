
public class gameBack
	{
		String answer;
		int question;
		public String getAnswer()
			{
				return answer;
			}
		public void setAnswer(String answer)
			{
				this.answer = answer;
			}
		public int getQuestion()
			{
				return question;
			}
		public void setQuestion(int question)
			{
				this.question = question;
			}
		public gameBack(int q, String a)
		{
			answer = a;
			question = q;
		}
	}
