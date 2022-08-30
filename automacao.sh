echo "Digite o nome do diretorio"
read dir
echo "Digite o nome do arquivo exe"
read exe

mkdir $dir
cd $dir

echo "cd .." >> $exe.sh
echo "mvn clean" >> $exe.sh
echo "mvn package">> $exe.sh
echo "java -jar target/MeuPet-0.0.1-SNAPSHOT.jar" >> $exe.sh

chmod 710 $exe.sh

./$exe.sh
