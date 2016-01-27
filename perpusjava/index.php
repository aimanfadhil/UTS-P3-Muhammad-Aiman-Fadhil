<?php
	$DB_SERVER 	="localhost";
	$DB_NAME		="db_lat";
	$DB_USER		="root";
	$DB_PASSWD	="";
	
	define("__DB_SERVER__"	,$DB_SERVER);
	define("__DB_NAME__"		,$DB_NAME);
	define("__DB_USER__"		,$DB_USER);
	define("__DB_PASSWD__"	,$DB_PASSWD);
	
	//connection db
	function DB(){
		$DB = mysqli_connect(__DB_SERVER__,__DB_USER__,__DB_PASSWD__,__DB_NAME__);

	// Check connection
		if (mysqli_connect_errno()){ 
			return "Failed to connect to MySQL: " . mysqli_connect_error();
		}
		else{
			return $DB;
		}
	}
	
	function ifset($str){
		if(isset($_REQUEST[$str])){
			return $_REQUEST[$str];
		}
		else{
			return null;
		}
	}

	$op = ifset('op');
	$subop = ifset('subop');
	$subop2 = ifset('subop2');
	$kd_buku=ifset('kd_buku');
	$judul=ifset('judul');
	$pengarang=ifset('pengarang');
	$penerbit=ifset('penerbit');
	$harga=ifset('harga');
	$nama=ifset('nama');
	$npm=ifset('npm');
	$jenis_kelamin=ifset('jenis_kelamin');
	$prodi=ifset('prodi');
	$kode=ifset('kode');
	$lama=ifset('lama');
	$denda=ifset('denda');
	$biaya=ifset('biaya');
	$total=ifset('total');
	$sem=ifset('sem');
	$tgl_k=ifset('tgl_k');
	$tgl_p=ifset('tgl_p');
	$val=$$subop2;
	$cari=ifset('cari');
	if(!empty($op)){
	$DB = DB();
		if($op == "insert"){
			if($subop=="Buku"){
				$sql = "insert into buku values ('$kd_buku','$judul','$pengarang','$penerbit',$harga);";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="mahasiswa"){
				$sql = "insert into mahasiswa values ('" . $npm . "','" . $nama . "','" . $jenis_kelamin . "','" . $prodi . "')";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Peminjaman"){
				$sql = "insert into t_peminjaman values ('$npm','$kode','$tgl_p','$tgl_k',$lama)";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Sementara"){
				$sql = "insert into sementara values('$npm',$sem)";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Kembali"){
				$sql = "insert into t_kembali values('$npm','$tgl_k',$denda)";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Total"){
				$sql = "insert into t_total values('$npm','$kd_buku',$biaya,$total)";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
		}
		else if($op == "update"){
			if($subop=="Buku"){
				$sql = "update buku set kd_buku ='$kd_buku',judul = '$judul',pengarang='$pengarang',penerbit='$penerbit'  where kd_buku = '$kd_buku'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="mahasiswa"){
				$sql = "update mahasiswa set npm ='$npm',nama = '$nama',jenis_kelamin='$jenis_kelamin',prodi='$prodi' where npm = '$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Peminjaman"){
				$sql = "update t_peminjaman set kode='$kode',tgl_pinjam='$utgl_p',tgl_kembali='$tgl_k',lama=$lama where npm='$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Sementara"){
				$sql = "update sementara set tgl_kembali=$sem where npm='$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Kembali"){
				$sql = "update t_kembali set tgl_pengembalian='";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Total"){
				$sql = "insert into t_total values('$npm','$kd_buku',$biaya,$total)";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
		}
		
		
		else if($op == "delete"){
			if($subop=="Buku"){
				$sql = "delete from buku where kd_buku ='$kd_buku'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="mahasiswa"){
				$sql = "delete from mahasiswa where npm ='$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Peminjaman"){
				$sql = "delete from t_peminjaman where npm='$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Sementara"){
				$sql = "delete from t_peminjaman where npm='$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Kembali"){
				$sql = "delete from t_peminjaman where npm='$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
			if($subop=="Total"){
				$sql = "delete from t_total where npm='$npm'";
				$q = mysqli_query($DB,$sql)or die(mysqli_error($DB));
				if($q){
					echo 1;
				}
				else{
					echo "gagal";
				}
			}
		}
		
		elseif($op=="viewdata"){
			$sql = "select * from $subop where $subop2 like '%$val%' ";
			$q = mysqli_query($DB,$sql);
			$count = mysqli_num_fields($q);
			$data = array();
						
			while($d=mysqli_fetch_array($q)){
				$fname = array();
				$dataa = array();
				for($i=0;$i<$count;$i++){
					array_push($dataa,$d[$i]);
				}
				$finfo = mysqli_fetch_fields($q);
				foreach ($finfo as $val) {
					array_push($fname,$val->name);
				}
				$combine = array_combine($fname,$dataa);
				array_push($data,$combine);
			}
				$json = json_encode($data); 
				echo $json;	
		}
		
		elseif($op=="viewttotal"){
			$sql = "select * from t_total a inner join mahasiswa b on a.npm = b.npm inner join buku c on a.kd_buku=c.kd_buku inner join t_peminjaman d on ((a.npm = d.npm))
			 and (a.kd_buku=d.kd_buku) inner join t_kembali e on ((a.npm = e.npm))
			 where a.npm like '%$cari%' 
				or a.kd_buku like '%$cari%'";
			$q = mysqli_query($DB,$sql);
			$count = mysqli_num_fields($q);
			$data = array();
						
			while($d=mysqli_fetch_array($q)){
				$fname = array();
				$dataa = array();
				for($i=0;$i<$count;$i++){
					array_push($dataa,$d[$i]);
				}
				$finfo = mysqli_fetch_fields($q);
				foreach ($finfo as $val) {
					array_push($fname,$val->name);
				}
				$combine = array_combine($fname,$dataa);
				array_push($data,$combine);
			}
				$json = json_encode($data); 
				echo $json;	
		}
		
		
	}
	else{
		//jika op (operasi tidak ada);
		
		echo "tidak ada operasi";
	}

?>
