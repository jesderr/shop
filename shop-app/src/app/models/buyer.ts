export class Buyer {
  id: number | undefined;
  name: string | undefined;
  surname: string | undefined;
  gender: string | undefined;
  bankCardId: number | undefined;


  constructor(name: string, surname: string, gender: string) {
    this.name = name;
    this.surname = surname;
    this.gender = gender;
  }
}
