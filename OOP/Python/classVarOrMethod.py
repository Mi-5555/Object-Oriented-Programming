class Book:
    total_books = 0             '''Class variable'''

    def __init__(self, title, author):
        self.title = title
        self.author = author
        Book.total_books += 1   '''Accessing Class Variable'''

    def display_info(self):
        return f"Title: {self.title}, Author: {self.author}"

    @classmethod                '''Class Method /Annotation or decorator'''
    def get_total_books(cls):   '''cls is just a reference to Book '''
        return cls.total_books  '''Book.total_books'''

book1 = Book("1984", "George Orwell")
book1.display_info()
Book.get_total_books()
