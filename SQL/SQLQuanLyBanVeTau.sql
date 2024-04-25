/*use master
GO

CREATE DATABASE QuanLyBanVeTau
ON PRIMARY
(NAME =N'QuanLyBanVeTau',FILENAME=N'D:\Nam3Ky2\PTUD\QL_BAN_VE_TAU\SQL\QuanLyBanVeTau.mdf',SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB)
LOG ON
( NAME = N'QuanLyBanVeTau_log', FILENAME = N'D:\Nam3Ky2\PTUD\QL_BAN_VE_TAU\SQL\QuanLyBanVeTau_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB)

GO

--name sa
--pwd 123456
*/
USE QuanLyBanVeTau;


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------TẠO BẢNG------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------1
/*
CREATE TABLE KhachHang (
    CCCD NVARCHAR(13) NOT NULL,
    HoTen NVARCHAR(50) NOT NULL,
    Email NVARCHAR(30),
    SDT NVARCHAR(10) NOT NULL,
    DoiTuong NVARCHAR(20) NOT NULL,
    PRIMARY KEY (CCCD)
); 
------------------------------------------------------------------------------------------------------2
CREATE TABLE NhanVien (
    MaNhanVien NVARCHAR(20) NOT NULL,
    HoTen NVARCHAR(50) NOT NULL,
	CCCD NVARCHAR(12) NOT NULL,
    SDT NVARCHAR(10) NOT NULL,
    Email NVARCHAR(35) NOT NULL,
    DiaChi NVARCHAR(50) NOT NULL,
    LoaiNV NVARCHAR(30) NOT NULL,
    TrangThai BIT NOT NULL,
    NgaySinh DATETIME NOT NULL,
    NgayVaoLam DATETIME NOT NULL,
    PRIMARY KEY (MaNhanVien)
); 
-------------------------------------------------------------------------------------------------3
CREATE TABLE TaiKhoan (
    TenTaiKhoan NVARCHAR(30) NOT NULL,
    MatKhau NVARCHAR(30) NOT NULL,
	MaNhanVien NVARCHAR(20) FOREIGN KEY REFERENCES NhanVien(MaNhanVien) ON DELETE SET NULL,
    PRIMARY KEY (TenTaiKhoan) 
); 
--------------------------------------------------------------------------------------------------------4
CREATE TABLE HoaDon (
    MaHoaDon NVARCHAR(20) NOT NULL ,
    GioTao TIME NOT NULL,
    NgayTao DATE NOT NULL,
    TrangThai BIT NOT NULL,
	MaNhanVien NVARCHAR(20) FOREIGN KEY REFERENCES NhanVien(MaNhanVien) ON DELETE SET NULL,
	CCCD NVARCHAR(13) FOREIGN KEY REFERENCES KhachHang(CCCD) ON DELETE SET NULL, 
	PRIMARY KEY (MaHoaDon)
); 
--------------------------------------------------------------------------------------5
CREATE TABLE Tau (
    MaTau NVARCHAR(20) NOT NULL,
    LoaiTau NVARCHAR(30) NOT NULL,
    TenTau NVARCHAR(30) NOT NULL,
    TocDo DECIMAL(10, 2) NOT NULL,
    NamSanXuat DATETIME NOT NULL,
    PRIMARY KEY (MaTau)
);
------------------------------------------------------------------------------------6


CREATE TABLE Toa(
	MaToa NVARCHAR(20) NOT NULL,
	LoaiToa NVARCHAR(20) NOT NULL,
	SoDungTich INT NOT NULL,
	NganChua INT NOT NULL,
	PRIMARY KEY (MaToa)
);
---------------------------------------------------------------------------------------7

CREATE TABLE ChoNgoi(
	MaChoNgoi NVARCHAR(20) NOT NULL ,
	MoTa NVARCHAR(50) NOT NULL,
	Gia REAL NOT NULL,
	ViTri INT NOT NULL,
	MaTau NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Tau(MaTau),
	MaToa NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Toa(MaToa),
	PRIMARY KEY (MaChoNgoi)
); 
----------------------------------------------------------------------------------8

CREATE TABLE Ga(
    TenGa NVARCHAR(50) NOT NULL PRIMARY KEY,
    CuLy REAL NOT NULL,
    DiaChi NVARCHAR(100) NOT NULL,
);
--------------------------------------------------------------------------------------9
CREATE TABLE Tuyen (
    MaTuyen NVARCHAR(20) NOT NULL ,
    TenTuyen NVARCHAR(50) NOT NULL,
	TenGa NVARCHAR(50) NOT NULL FOREIGN KEY REFERENCES Ga(TenGa),
	PRIMARY KEY (MaTuyen)
);
--------------------------------------------------------------------------------------------10
CREATE TABLE Chuyen(
    MaChuyen NVARCHAR(20) NOT NULL,
    TenChuyen NVARCHAR(50) NOT NULL,
    GioKhoiHanh DATETIME NOT NULL,
    NgayKhoiHanh DATETIME NOT NULL,
    MaTau NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Tau(MaTau),
    MaTuyen NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Tuyen(MaTuyen),
    PRIMARY KEY (MaChuyen)
);
-------------------------------------------------------------------------------------------------11

CREATE TABLE KhuyenMai(
    MaKhuyenMai NVARCHAR(20) NOT NULL PRIMARY KEY,
    TenKhuyenMai NVARCHAR(50) NOT NULL,
    LoaiKhuyenMai NVARCHAR(30) NOT NULL,
    ThoiGianBatDau DATETIME NOT NULL,
    ThoiGianKetThuc DATETIME NOT NULL,
    ChietKhau REAL NOT NULL
)
----------------------------------------------------------------------------------------------------------------------------------12
CREATE TABLE VE(
    MaVe NVARCHAR(20) NOT NULL PRIMARY KEY,
    ThoiGianLenTau DATETIME NOT NULL,
    MaChuyen NVARCHAR(20) FOREIGN KEY REFERENCES Chuyen(MaChuyen) ON DELETE SET NULL,
    MaChoNgoi NVARCHAR(20) FOREIGN KEY REFERENCES ChoNgoi(MaChoNgoi) ON DELETE SET NULL,
    GaDi NVARCHAR(50) FOREIGN KEY REFERENCES Ga(TenGa) ON DELETE SET NULL,
    GaDen NVARCHAR(50) FOREIGN KEY REFERENCES Ga(TenGa) ON DELETE NO ACTION,
    MaKhuyenMai NVARCHAR(20) FOREIGN KEY REFERENCES KhuyenMai(MaKhuyenMai) ON DELETE SET NULL,
    CCCD NVARCHAR(13) FOREIGN KEY REFERENCES KhachHang(CCCD) ON DELETE SET NULL,
    MaHoaDon NVARCHAR(20) FOREIGN KEY REFERENCES HoaDon(MaHoaDon) ON DELETE SET NULL
);
----------------------------------------------------------------------------------------------------------------------------------------------13

CREATE TABLE ChiTietKhuyenMai (
    MaHoaDon NVARCHAR(20) NOT NULL,
    MaKhuyenMai NVARCHAR(20) NOT NULL,
    CONSTRAINT FK_ChiTietKhuyenMai_HoaDon FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE NO ACTION,
    CONSTRAINT FK_ChiTietKhuyenMai_KhuyenMai FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai) ON DELETE NO ACTION,
    CONSTRAINT PK_ChiTietHoaDon PRIMARY KEY (MaHoaDon, MaKhuyenMai)
);

*/
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------DỮ LIỆU BẢNG------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------1
                                                                          /*DỮ LIỆU KHÁCH HÀNG*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------1
INSERT INTO KhachHang(CCCD, HoTen, Email, SDT, DoiTuong)
VALUES 
      ('038203000233', N'Lê Đình Nam',     'fsfsnam7@gmail.com',   '0937546286', N'Sinh viên'),
	  ('110620150000', N'Lê Đình Long',    'fsfsnam9@gmail.com',   '0937546236', N'Trẻ em'),
	  ('038203000231', N'Lê Đình Ho',      'fsfsnam11@gmail.com',  '0937542863',  N'Người lớn'),
	  ('038203000234', N'Nguyễn Thị Hằng', 'nguyenhang@gmail.com', '0937546290', N'Sinh viên'),
	  ('038203000235', N'Trần Văn Tùng',   'vantung@gmail.com',    '0937546291', N'Sinh viên'),
	  ('038203000236', N'Lê Thị Hằng',     'lehang@gmail.com',     '0937546292', N'Sinh viên'),
	  ('038203000237', N'Phạm Văn Phú',    'vanphu@gmail.com',     '0937546293', N'Người lớn'),
	  ('038203000238', N'Nguyễn Thị Thảo', 'thao@gmail.com',       '0937546294', N'Người lớn'),
	  ('038203000239', N'Trần Văn Đức',    'vanduc@gmail.com',     '0937546295', N'Người lớn'),
	  ('038203000240', N'Hoàng Minh Tuấn', 'minhtuan@gmail.com',   '0937546296', N'Người lớn'),
	  ('111120170000', N'Lê Thị Hồng',     'lehong@gmail.com',     '0937546297', N'Trẻ em'),
	  ('038203000242', N'Nguyễn Văn Hùng', 'vanhung@gmail.com',    '0937546298', N'Sinh viên'),
	  ('038203000243', N'Trần Thị Mai',    'thimai@gmail.com',     '0937546299', N'Người lớn'),
	  ('038203000244', N'Lê Văn Sơn',      'vanson@gmail.com',     '0937546300', N'Sinh viên'),
	  ('038203000245', N'Nguyễn Thị Anh',  'thianh@gmail.com',     '0937546301', N'Người lớn'),
	  ('061220180000', N'Trần Minh Tuấn',  'minhtuan2@gmail.com',  '0937546302', N'Trẻ em'),
	  ('038203000247', N'Phạm Thị Hà',     'thiha@gmail.com',      '0937546303', N'Sinh viên'),
	  ('038203000248', N'Nguyễn Văn Hùng', 'vanhung2@gmail.com',   '0937546304', N'Sinh viên'),
	  ('038203000249', N'Hoàng Thị Hồng',  'thihong@gmail.com',    '0937546305', N'Người lớn'),
	  ('210120180000', N'Lê Văn Nam',      'vannam@gmail.com',     '0937546306', N'Trẻ em')

SELECT * FROM KhachHang
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------2
                                                                                /*DỮ LIỆU NHÂN VIÊN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------2

INSERT INTO NhanVien (MaNhanVien, CCCD, HoTen, SDT, Email, DiaChi,GioiTinh, LoaiNV, TrangThai, NgaySinh, NgayVaoLam)
VALUES 
      ('NV21030001', '001012345678',  N'Lê Đình Nam',     '0937546286',  'ledinhnam@gmail.com',     N'Quận Hoàn Kiếm, Thành phố Hà Nội',      1, 'User' , 1, '2003-03-15', '2021-03-15'),
      ('NV21020002', '079023456789',  N'Lê Đình Long',    '0937546236',  'ledinhlong@gmail.com',    N'Quận 1, Thành phố Hồ Chí Minh',         1, 'User' , 1, '2002-03-16', '2021-03-16'),
      ('NV21010003', '001034567890',  N'Lê Đình Ho',      '0937546283',  'ledinhho@gmail.com',      N'Quận Ba Đình, Thành phố Hà Nội',        1, 'User' , 0, '2001-03-17', '2021-03-17'),
      ('NV21000004', '079045678901',  N'Nguyễn Thị Hằng', '0937546290',  'nguyenthihang@gmail.com', N'Quận Tân Bình, Thành phố Hồ Chí Minh',  0, 'User' , 1, '2000-03-18', '2021-03-18'),
      ('NV21990005', '001056789012',  N'Trần Văn Tùng',   '0937546291',  'tranvantung@gmail.com',   N'Quận Cầu Giấy, Thành phố Hà Nội',       1, 'User' , 1, '1999-03-19', '2021-03-19'),
      ('NV21980006', '079067890123',  N'Lê Thị Hằng',     '0937546292',  'lethihang@gmail.com',     N'Quận Bình Thạnh, Thành phố Hồ Chí Minh',0, 'User' , 0, '1998-03-20', '2021-03-20'),
      ('NV21970007', '048078901234',  N'Phạm Văn Phú',    '0937546293',  'phamvanphu@gmail.com',    N'Quận Hải Châu, Thành phố Đà Nẵng',      1, 'User' , 1, '1997-03-21', '2021-03-21'),
      ('NV21960008', '079089012345',  N'Nguyễn Thị Thảo', '0937546294',  'nguyenthithao@gmail.com', N'Quận Thủ Đức, Thành phố Hồ Chí Minh',   0, 'User' , 1, '1996-03-22', '2021-03-22'),
      ('NV21950009', '001090123456',  N'Trần Văn Đức',    '0937546295',  'tranvanduc@gmail.com',    N'Huyện Hoài Đức, Thành phố Hà Nội',      1, 'Admin', 0, '1995-03-23', '2021-03-23'),
      ('NV21940010', '079901234567',  N'Hoàng Minh Tuấn', '0937546296',  'hoangminhtuan@gmail.com', N'Huyện Củ Chi, Thành phố Hồ Chí Minh',   1, 'User' , 1, '1994-03-24', '2021-03-24');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------3
                                                                                /*DỮ LIỆU TÀI KHOẢN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------3

SELECT * FROM NhanVien

INSERT INTO TaiKhoan (TenTaiKhoan, MatKhau, MaNhanVien) VALUES 
      ('21030001', 'Passw0rd',           'NV21030001'),
      ('21020002', 'StrongPassword1',    'NV21020002'),
      ('21010003', 'SecurePassword123',  'NV21010003'),
      ('21000004', 'Secret123!',         'NV21000004'),
      ('21990005', 'Pa$$w0rd',           'NV21990005'),
      ('21980006', 'StrongP@ssw0rd',     'NV21980006'),
      ('21970007', 'SecureP@ssw0rd',     'NV21970007'),
      ('21960008', 'VeryStrongPassword', 'NV21960008'),
      ('21950009', 'Password123',        'NV21950009'),
      ('21940010', 'P@ssw0rd!2024',      'NV21940010');

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------5
                                                                                /*DỮ LIỆU TÀU*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------5

INSERT INTO Tau (MaTau, LoaiTau, TenTau, TocDo) 
VALUES
      ('SE01', N'SE', N'Super Express 01', 80),
      ('SE02', N'SE', N'Super Express 01', 80),
      ('SE03', N'SE', N'Super Express 01', 80),
      ('SE04', N'SE', N'Super Express 01', 80),
      ('TN01', N'TN', N'Tàu thống nhất sô 1', 65),
      ('TN02', N'TN', N'Tàu thống nhất số 2', 65);

Select * from Tau
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------6
                                                                               /*DỮ LIỆU TOA*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------6
	
INSERT INTO Toa (MaToa, LoaiToa, ViTri)
VALUES 
    ('TNMSE101', 'NM',  1),
    ('TNMSE102', 'NM',  2),
	('TNMSE103', 'NM',  3),
    ('TNMSE104', 'NM',  4),
    ('TG6SE105', 'G6', 5),
    ('TG6SE106', 'G6', 6),
	('TG6SE107', 'G6', 7),
    ('TG4SE108', 'G4', 8),
	('TG4SE109', 'G4', 9),
    ('TG4SE110', 'G4', 10)

select * from Toa
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU CHONGOI*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

--Tau SE01
INSERT INTO ChoNgoi (MaChoNgoi, Gia, ViTri, MaTau, MaToa,MoTa)
VALUES 
    ('SE1NM0101', 30000.0,  1,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0102', 30000.0,  2,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0103', 30000.0,  3,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0104', 30000.0,  4,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0105', 30000.0,  5,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0106', 30000.0,  6,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0107', 30000.0,  7,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0108', 30000.0,  8,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0109', 30000.0,  9,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0110', 30000.0,  10,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0111', 30000.0,  11,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0112', 30000.0,  12,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0113', 30000.0,  13,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0114', 30000.0,  14,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0115', 30000.0,  15,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0116', 30000.0,  16,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0117', 30000.0,  17,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0118', 30000.0,  18,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0119', 30000.0,  19,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0120', 30000.0,  20,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0121', 30000.0,  21,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0122', 30000.0,  22,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0123', 30000.0,  23,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0124', 30000.0,  24,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0125', 30000.0,  25,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0126', 30000.0,  26,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0127', 30000.0,  27,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0128', 30000.0,  28,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0129', 30000.0,  29,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0130', 30000.0,  30,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0131', 30000.0,  31,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0132', 30000.0,  32,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0133', 30000.0,  33,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0134', 30000.0,  34,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0135', 30000.0,  35,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0136', 30000.0,  36,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0137', 30000.0,  37,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0138', 30000.0,  38,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0139', 30000.0,  39,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0140', 30000.0,  40,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0141', 30000.0,  41,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0142', 30000.0,  42,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0143', 30000.0,  43,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0144', 30000.0,  44,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0145', 30000.0,  45,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0146', 30000.0,  46,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0147', 30000.0,  47,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0148', 30000.0,  48,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0149', 30000.0,  49,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0150', 30000.0,  50,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0151', 30000.0,  51,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0152', 30000.0,  52,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0153', 30000.0,  53,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0154', 30000.0,  54,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0155', 30000.0,  55,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0156', 30000.0,  56,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0157', 30000.0,  57,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0158', 30000.0,  58,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0159', 30000.0,  59,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0160', 30000.0,  60,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0161', 30000.0,  61,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0162', 30000.0,  62,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0163', 30000.0,  63,  'SE01', 'TNMSE101',N'Ngồi mền'),
	('SE1NM0164', 30000.0,  64,  'SE01', 'TNMSE101',N'Ngồi mền'),
    ('SE1NM0201', 30000.0,  1,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0202', 30000.0,  2,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0203', 30000.0,  3,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0204', 30000.0,  4,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0205', 30000.0,  5,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0206', 30000.0,  6,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0207', 30000.0,  7,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0208', 30000.0,  8,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0209', 30000.0,  9,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0210', 30000.0,  10,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0211', 30000.0,  11,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0212', 30000.0,  12,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0213', 30000.0,  13,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0214', 30000.0,  14,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0215', 30000.0,  15,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0216', 30000.0,  16,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0217', 30000.0,  17,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0218', 30000.0,  18,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0219', 30000.0,  19,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0220', 30000.0,  20,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0221', 30000.0,  21,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0222', 30000.0,  22,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0223', 30000.0,  23,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0224', 30000.0,  24,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0225', 30000.0,  25,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0226', 30000.0,  26,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0227', 30000.0,  27,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0228', 30000.0,  28,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0229', 30000.0,  29,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0230', 30000.0,  30,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0231', 30000.0,  31,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0232', 30000.0,  32,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0233', 30000.0,  33,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0234', 30000.0,  34,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0235', 30000.0,  35,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0236', 30000.0,  36,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0237', 30000.0,  37,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0238', 30000.0,  38,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0239', 30000.0,  39,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0240', 30000.0,  40,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0241', 30000.0,  41,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0242', 30000.0,  42,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0243', 30000.0,  43,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0244', 30000.0,  44,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0245', 30000.0,  45,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0246', 30000.0,  46,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0247', 30000.0,  47,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0248', 30000.0,  48,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0249', 30000.0,  49,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0250', 30000.0,  50,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0251', 30000.0,  51,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0252', 30000.0,  52,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0253', 30000.0,  53,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0254', 30000.0,  54,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0255', 30000.0,  55,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0256', 30000.0,  56,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0257', 30000.0,  57,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0258', 30000.0,  58,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0259', 30000.0,  59,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0260', 30000.0,  60,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0261', 30000.0,  61,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0262', 30000.0,  62,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0263', 30000.0,  63,  'SE01', 'TNMSE102',N'Ngồi mền'),
	('SE1NM0264', 30000.0,  64,  'SE01', 'TNMSE102',N'Ngồi mền'),
    ('SE1NM0301', 30000.0,  1,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0302', 30000.0,  2,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0303', 30000.0,  3,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0304', 30000.0,  4,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0305', 30000.0,  5,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0306', 30000.0,  6,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0307', 30000.0,  7,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0308', 30000.0,  8,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0309', 30000.0,  9,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0310', 30000.0,  10,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0311', 30000.0,  11,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0312', 30000.0,  12,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0313', 30000.0,  13,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0314', 30000.0,  14,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0315', 30000.0,  15,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0316', 30000.0,  16,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0317', 30000.0,  17,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0318', 30000.0,  18,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0319', 30000.0,  19,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0320', 30000.0,  20,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0321', 30000.0,  21,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0322', 30000.0,  22,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0323', 30000.0,  23,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0324', 30000.0,  24,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0325', 30000.0,  25,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0326', 30000.0,  26,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0327', 30000.0,  27,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0328', 30000.0,  28,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0329', 30000.0,  29,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0330', 30000.0,  30,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0331', 30000.0,  31,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0332', 30000.0,  32,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0333', 30000.0,  33,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0334', 30000.0,  34,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0335', 30000.0,  35,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0336', 30000.0,  36,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0337', 30000.0,  37,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0338', 30000.0,  38,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0339', 30000.0,  39,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0340', 30000.0,  40,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0341', 30000.0,  41,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0342', 30000.0,  42,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0343', 30000.0,  43,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0344', 30000.0,  44,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0345', 30000.0,  45,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0346', 30000.0,  46,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0347', 30000.0,  47,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0348', 30000.0,  48,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0349', 30000.0,  49,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0350', 30000.0,  50,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0351', 30000.0,  51,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0352', 30000.0,  52,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0353', 30000.0,  53,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0354', 30000.0,  54,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0355', 30000.0,  55,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0356', 30000.0,  56,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0357', 30000.0,  57,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0358', 30000.0,  58,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0359', 30000.0,  59,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0360', 30000.0,  60,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0361', 30000.0,  61,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0362', 30000.0,  62,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0363', 30000.0,  63,  'SE01', 'TNMSE103',N'Ngồi mền'),
	('SE1NM0364', 30000.0,  64,  'SE01', 'TNMSE103',N'Ngồi mền'),
    ('SE1NM0401', 30000.0,   1, 'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0402', 30000.0,  2,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0403', 30000.0,  3,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0404', 30000.0,  4,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0405', 30000.0,  5,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0406', 30000.0,  6,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0407', 30000.0,  7,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0408', 30000.0,  8,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0409', 30000.0,  9,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0410', 30000.0,  10,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0411', 30000.0,  11,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0412', 30000.0,  12,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0413', 30000.0,  13,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0414', 30000.0,  14,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0415', 30000.0,  15,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0416', 30000.0,  16,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0417', 30000.0,  17,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0418', 30000.0,  18,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0419', 30000.0,  19,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0420', 30000.0,  20,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0421', 30000.0,  21,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0422', 30000.0,  22,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0423', 30000.0,  23,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0424', 30000.0,  24,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0425', 30000.0,  25,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0426', 30000.0,  26,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0427', 30000.0,  27,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0428', 30000.0,  28,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0429', 30000.0,  29,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0430', 30000.0,  30,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0431', 30000.0,  31,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0432', 30000.0,  32,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0433', 30000.0,  33,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0434', 30000.0,  34,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0435', 30000.0,  35,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0436', 30000.0,  36,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0437', 30000.0,  37,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0438', 30000.0,  38,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0439', 30000.0,  39,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0440', 30000.0,  40,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0441', 30000.0,  41,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0442', 30000.0,  42,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0443', 30000.0,  43,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0444', 30000.0,  44,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0445', 30000.0,  45,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0446', 30000.0,  46,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0447', 30000.0,  47,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0448', 30000.0,  48,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0449', 30000.0,  49,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0450', 30000.0,  50,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0451', 30000.0,  51,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0452', 30000.0,  52,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0453', 30000.0,  53,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0454', 30000.0,  54,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0455', 30000.0,  55,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0456', 30000.0,  56,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0457', 30000.0,  57,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0458', 30000.0,  58,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0459', 30000.0,  59,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0460', 30000.0,  60,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0461', 30000.0,  61,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0462', 30000.0,  62,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0463', 30000.0,  63,  'SE01', 'TNMSE104',N'Ngồi mền'),
	('SE1NM0464', 30000.0,  64,  'SE01', 'TNMSE104',N'Ngồi mền'),
    ('SE1G60501', 35000.0,  1,  'SE01', 'TG6SE105',N'Khoang 1'),
	('SE1G60502', 35000.0,  2,  'SE01', 'TG6SE105',N'Khoang 1'),
	('SE1G60503', 35000.0,  3,  'SE01', 'TG6SE105',N'Khoang 1'),
	('SE1G60504', 35000.0,  4,  'SE01', 'TG6SE105',N'Khoang 1'),
	('SE1G60505', 35000.0,  5,  'SE01', 'TG6SE105',N'Khoang 1'),
	('SE1G60506', 35000.0,  6,  'SE01', 'TG6SE105',N'Khoang 1'),
	('SE1G60507', 35000.0,  1,  'SE01', 'TG6SE105',N'Khoang 2'),
	('SE1G60508', 35000.0,  2,  'SE01', 'TG6SE105',N'Khoang 2'),
	('SE1G60509', 35000.0,  3,  'SE01', 'TG6SE105',N'Khoang 2'),
	('SE1G60510', 35000.0,  4,  'SE01', 'TG6SE105',N'Khoang 2'),
	('SE1G60511', 35000.0,  5,  'SE01', 'TG6SE105',N'Khoang 2'),
	('SE1G60512', 35000.0,  6,  'SE01', 'TG6SE105',N'Khoang 2'),
	('SE1G60513', 35000.0,  1,  'SE01', 'TG6SE105',N'Khoang 3'),
	('SE1G60514', 35000.0,  2,  'SE01', 'TG6SE105',N'Khoang 3'),
	('SE1G60515', 35000.0,  3,  'SE01', 'TG6SE105',N'Khoang 3'),
	('SE1G60516', 35000.0,  4,  'SE01', 'TG6SE105',N'Khoang 3'),
	('SE1G60517', 35000.0,  5,  'SE01', 'TG6SE105',N'Khoang 3'),
	('SE1G60518', 35000.0,  6,  'SE01', 'TG6SE105',N'Khoang 3'),
	('SE1G60519', 35000.0,  1,  'SE01', 'TG6SE105',N'Khoang 4'),
	('SE1G60520', 35000.0,  2,  'SE01', 'TG6SE105',N'Khoang 4'),
	('SE1G60521', 35000.0,  3,  'SE01', 'TG6SE105',N'Khoang 4'),
	('SE1G60522', 35000.0,  4,  'SE01', 'TG6SE105',N'Khoang 4'),
	('SE1G60523', 35000.0,  5,  'SE01', 'TG6SE105',N'Khoang 4'),
	('SE1G60524', 35000.0,  6,  'SE01', 'TG6SE105',N'Khoang 4'),
	('SE1G60525', 35000.0,  1,  'SE01', 'TG6SE105',N'Khoang 5'),
	('SE1G60526', 35000.0,  2,  'SE01', 'TG6SE105',N'Khoang 5'),
	('SE1G60527', 35000.0,  3,  'SE01', 'TG6SE105',N'Khoang 5'),
	('SE1G60528', 35000.0,  4,  'SE01', 'TG6SE105',N'Khoang 5'),
	('SE1G60529', 35000.0,  5,  'SE01', 'TG6SE105',N'Khoang 5'),
	('SE1G60530', 35000.0,  6,  'SE01', 'TG6SE105',N'Khoang 5'),
	('SE1G60531', 35000.0,  1,  'SE01', 'TG6SE105',N'Khoang 6'),
	('SE1G60532', 35000.0,  2,  'SE01', 'TG6SE105',N'Khoang 6'),
	('SE1G60533', 35000.0,  3,  'SE01', 'TG6SE105',N'Khoang 6'),
	('SE1G60534', 35000.0,  4,  'SE01', 'TG6SE105',N'Khoang 6'),
	('SE1G60535', 35000.0,  5,  'SE01', 'TG6SE105',N'Khoang 6'),
	('SE1G60536', 35000.0,  6,  'SE01', 'TG6SE105',N'Khoang 6'),
	('SE1G60601', 35000.0,  1,  'SE01', 'TG6SE106',N'Khoang 1'),
	('SE1G60602', 35000.0,  2,  'SE01', 'TG6SE106',N'Khoang 1'),
	('SE1G60603', 35000.0,  3,  'SE01', 'TG6SE106',N'Khoang 1'),
	('SE1G60604', 35000.0,  4,  'SE01', 'TG6SE106',N'Khoang 1'),
	('SE1G60605', 35000.0,  5,  'SE01', 'TG6SE106',N'Khoang 1'),
	('SE1G60606', 35000.0,  6,  'SE01', 'TG6SE106',N'Khoang 1'),
	('SE1G60607', 35000.0,  1,  'SE01', 'TG6SE106',N'Khoang 2'),
	('SE1G60608', 35000.0,  2,  'SE01', 'TG6SE106',N'Khoang 2'),
	('SE1G60609', 35000.0,  3,  'SE01', 'TG6SE106',N'Khoang 2'),
	('SE1G60610', 35000.0,  4,  'SE01', 'TG6SE106',N'Khoang 2'),
	('SE1G60611', 35000.0,  5,  'SE01', 'TG6SE106',N'Khoang 2'),
	('SE1G60612', 35000.0,  6,  'SE01', 'TG6SE106',N'Khoang 2'),
	('SE1G60613', 35000.0,  1,  'SE01', 'TG6SE106',N'Khoang 3'),
	('SE1G60614', 35000.0,  2,  'SE01', 'TG6SE106',N'Khoang 3'),
	('SE1G60615', 35000.0,  3,  'SE01', 'TG6SE106',N'Khoang 3'),
	('SE1G60616', 35000.0,  4,  'SE01', 'TG6SE106',N'Khoang 3'),
	('SE1G60617', 35000.0,  5,  'SE01', 'TG6SE106',N'Khoang 3'),
	('SE1G60618', 35000.0,  6,  'SE01', 'TG6SE106',N'Khoang 3'),
	('SE1G60619', 35000.0,  1,  'SE01', 'TG6SE106',N'Khoang 4'),
	('SE1G60620', 35000.0,  2,  'SE01', 'TG6SE106',N'Khoang 4'),
	('SE1G60621', 35000.0,  3,  'SE01', 'TG6SE106',N'Khoang 4'),
	('SE1G60622', 35000.0,  4,  'SE01', 'TG6SE106',N'Khoang 4'),
	('SE1G60623', 35000.0,  5,  'SE01', 'TG6SE106',N'Khoang 4'),
	('SE1G60624', 35000.0,  6,  'SE01', 'TG6SE106',N'Khoang 4'),
	('SE1G60625', 35000.0,  1,  'SE01', 'TG6SE106',N'Khoang 5'),
	('SE1G60626', 35000.0,  2,  'SE01', 'TG6SE106',N'Khoang 5'),
	('SE1G60627', 35000.0,  3,  'SE01', 'TG6SE106',N'Khoang 5'),
	('SE1G60628', 35000.0,  4,  'SE01', 'TG6SE106',N'Khoang 5'),
	('SE1G60629', 35000.0,  5,  'SE01', 'TG6SE106',N'Khoang 5'),
	('SE1G60630', 35000.0,  6,  'SE01', 'TG6SE106',N'Khoang 5'),
	('SE1G60631', 35000.0,  1,  'SE01', 'TG6SE106',N'Khoang 6'),
	('SE1G60632', 35000.0,  2,  'SE01', 'TG6SE106',N'Khoang 6'),
	('SE1G60633', 35000.0,  3,  'SE01', 'TG6SE106',N'Khoang 6'),
	('SE1G60634', 35000.0,  4,  'SE01', 'TG6SE106',N'Khoang 6'),
	('SE1G60635', 35000.0,  5,  'SE01', 'TG6SE106',N'Khoang 6'),
	('SE1G60636', 35000.0,  6,  'SE01', 'TG6SE106',N'Khoang 6'),
	('SE1G60701', 35000.0,  1,  'SE01', 'TG6SE107',N'Khoang 1'),
	('SE1G60702', 35000.0,  2,  'SE01', 'TG6SE107',N'Khoang 1'),
	('SE1G60703', 35000.0,  3,  'SE01', 'TG6SE107',N'Khoang 1'),
	('SE1G60704', 35000.0,  4,  'SE01', 'TG6SE107',N'Khoang 1'),
	('SE1G60705', 35000.0,  5,  'SE01', 'TG6SE107',N'Khoang 1'),
	('SE1G60706', 35000.0,  6,  'SE01', 'TG6SE107',N'Khoang 1'),
	('SE1G60707', 35000.0,  1,  'SE01', 'TG6SE107',N'Khoang 2'),
	('SE1G60708', 35000.0,  2,  'SE01', 'TG6SE107',N'Khoang 2'),
	('SE1G60709', 35000.0,  3,  'SE01', 'TG6SE107',N'Khoang 2'),
	('SE1G60710', 35000.0,  4,  'SE01', 'TG6SE107',N'Khoang 2'),
	('SE1G60711', 35000.0,  5,  'SE01', 'TG6SE107',N'Khoang 2'),
	('SE1G60712', 35000.0,  6,  'SE01', 'TG6SE107',N'Khoang 2'),
	('SE1G60713', 35000.0,  1,  'SE01', 'TG6SE107',N'Khoang 3'),
	('SE1G60714', 35000.0,  2,  'SE01', 'TG6SE107',N'Khoang 3'),
	('SE1G60715', 35000.0,  3,  'SE01', 'TG6SE107',N'Khoang 3'),
	('SE1G60716', 35000.0,  4,  'SE01', 'TG6SE107',N'Khoang 3'),
	('SE1G60717', 35000.0,  5,  'SE01', 'TG6SE107',N'Khoang 3'),
	('SE1G60718', 35000.0,  6,  'SE01', 'TG6SE107',N'Khoang 3'),
	('SE1G60719', 35000.0,  1,  'SE01', 'TG6SE107',N'Khoang 4'),
	('SE1G60720', 35000.0,  2,  'SE01', 'TG6SE107',N'Khoang 4'),
	('SE1G60721', 35000.0,  3,  'SE01', 'TG6SE107',N'Khoang 4'),
	('SE1G60722', 35000.0,  4,  'SE01', 'TG6SE107',N'Khoang 4'),
	('SE1G60723', 35000.0,  5,  'SE01', 'TG6SE107',N'Khoang 4'),
	('SE1G60724', 35000.0,  6,  'SE01', 'TG6SE107',N'Khoang 4'),
	('SE1G60725', 35000.0,  1,  'SE01', 'TG6SE107',N'Khoang 5'),
	('SE1G60726', 35000.0,  2,  'SE01', 'TG6SE107',N'Khoang 5'),
	('SE1G60727', 35000.0,  3,  'SE01', 'TG6SE107',N'Khoang 5'),
	('SE1G60728', 35000.0,  4,  'SE01', 'TG6SE107',N'Khoang 5'),
	('SE1G60729', 35000.0,  5,  'SE01', 'TG6SE107',N'Khoang 5'),
	('SE1G60730', 35000.0,  6,  'SE01', 'TG6SE107',N'Khoang 5'),
	('SE1G60731', 35000.0,  1,  'SE01', 'TG6SE107',N'Khoang 6'),
	('SE1G60732', 35000.0,  2,  'SE01', 'TG6SE107',N'Khoang 6'),
	('SE1G60733', 35000.0,  3,  'SE01', 'TG6SE107',N'Khoang 6'),
	('SE1G60734', 35000.0,  4,  'SE01', 'TG6SE107',N'Khoang 6'),
	('SE1G60735', 35000.0,  5,  'SE01', 'TG6SE107',N'Khoang 6'),
	('SE1G60736', 35000.0,  6,  'SE01', 'TG6SE107',N'Khoang 6'),
	('SE1G40801', 40000.0,  1,  'SE01', 'TG4SE108',N'Khoang 1'),
	('SE1G40802', 40000.0,  2,  'SE01', 'TG4SE108',N'Khoang 1'),
	('SE1G40803', 40000.0,  3,  'SE01', 'TG4SE108',N'Khoang 1'),
	('SE1G40804', 40000.0,  4,  'SE01', 'TG4SE108',N'Khoang 1'),
	('SE1G40805', 40000.0,  1,  'SE01', 'TG4SE108',N'Khoang 2'),
	('SE1G40806', 40000.0,  2,  'SE01', 'TG4SE108',N'Khoang 2'),
	('SE1G40807', 40000.0,  3,  'SE01', 'TG4SE108',N'Khoang 2'),
	('SE1G40808', 40000.0,  4,  'SE01', 'TG4SE108',N'Khoang 2'),
	('SE1G40809', 40000.0,  1,  'SE01', 'TG4SE108',N'Khoang 3'),
	('SE1G40810', 40000.0,  2,  'SE01', 'TG4SE108',N'Khoang 3'),
	('SE1G40811', 40000.0,  3,  'SE01', 'TG4SE108',N'Khoang 3'),
	('SE1G40812', 40000.0,  4,  'SE01', 'TG4SE108',N'Khoang 3'),
	('SE1G40813', 40000.0,  1,  'SE01', 'TG4SE108',N'Khoang 4'),
	('SE1G40814', 40000.0,  2,  'SE01', 'TG4SE108',N'Khoang 4'),
	('SE1G40815', 40000.0,  3,  'SE01', 'TG4SE108',N'Khoang 4'),
	('SE1G40816', 40000.0,  4,  'SE01', 'TG4SE108',N'Khoang 4'),
	('SE1G40817', 40000.0,  1,  'SE01', 'TG4SE108',N'Khoang 5'),
	('SE1G40818', 40000.0,  2,  'SE01', 'TG4SE108',N'Khoang 5'),
	('SE1G40819', 40000.0,  3,  'SE01', 'TG4SE108',N'Khoang 5'),
	('SE1G40820', 40000.0,  4,  'SE01', 'TG4SE108',N'Khoang 5'),
	('SE1G40821', 40000.0,  1,  'SE01', 'TG4SE108',N'Khoang 6'),
	('SE1G40822', 40000.0,  2,  'SE01', 'TG4SE108',N'Khoang 6'),
	('SE1G40823', 40000.0,  3,  'SE01', 'TG4SE108',N'Khoang 6'),
	('SE1G40824', 40000.0,  4,  'SE01', 'TG4SE108',N'Khoang 6'),
	('SE1G40901', 40000.0,  1,  'SE01', 'TG4SE109',N'Khoang 1'),
	('SE1G40902', 40000.0,  2,  'SE01', 'TG4SE109',N'Khoang 1'),
	('SE1G40903', 40000.0,  3,  'SE01', 'TG4SE109',N'Khoang 1'),
	('SE1G40904', 40000.0,  4,  'SE01', 'TG4SE109',N'Khoang 1'),
	('SE1G40905', 40000.0,  1,  'SE01', 'TG4SE109',N'Khoang 2'),
	('SE1G40906', 40000.0,  2,  'SE01', 'TG4SE109',N'Khoang 2'),
	('SE1G40907', 40000.0,  3,  'SE01', 'TG4SE109',N'Khoang 2'),
	('SE1G40908', 40000.0,  4,  'SE01', 'TG4SE109',N'Khoang 2'),
	('SE1G40909', 40000.0,  1,  'SE01', 'TG4SE109',N'Khoang 3'),
	('SE1G40910', 40000.0,  2,  'SE01', 'TG4SE109',N'Khoang 3'),
	('SE1G40911', 40000.0,  3,  'SE01', 'TG4SE109',N'Khoang 3'),
	('SE1G40912', 40000.0,  4,  'SE01', 'TG4SE109',N'Khoang 3'),
	('SE1G40913', 40000.0,  1,  'SE01', 'TG4SE109',N'Khoang 4'),
	('SE1G40914', 40000.0,  2,  'SE01', 'TG4SE109',N'Khoang 4'),
	('SE1G40915', 40000.0,  3,  'SE01', 'TG4SE109',N'Khoang 4'),
	('SE1G40916', 40000.0,  4,  'SE01', 'TG4SE109',N'Khoang 4'),
	('SE1G40917', 40000.0,  1,  'SE01', 'TG4SE109',N'Khoang 5'),
	('SE1G40918', 40000.0,  2,  'SE01', 'TG4SE109',N'Khoang 5'),
	('SE1G40919', 40000.0,  3,  'SE01', 'TG4SE109',N'Khoang 5'),
	('SE1G40920', 40000.0,  4,  'SE01', 'TG4SE109',N'Khoang 5'),
	('SE1G40921', 40000.0,  1,  'SE01', 'TG4SE109',N'Khoang 6'),
	('SE1G40922', 40000.0,  2,  'SE01', 'TG4SE109',N'Khoang 6'),
	('SE1G40923', 40000.0,  3,  'SE01', 'TG4SE109',N'Khoang 6'),
	('SE1G40924', 40000.0,  4,  'SE01', 'TG4SE109',N'Khoang 6'),
	('SE1G41001', 40000.0,  1,  'SE01', 'TG4SE110',N'Khoang 1'),
	('SE1G41002', 40000.0,  2,  'SE01', 'TG4SE110',N'Khoang 1'),
	('SE1G41003', 40000.0,  3,  'SE01', 'TG4SE110',N'Khoang 1'),
	('SE1G41004', 40000.0,  4,  'SE01', 'TG4SE110',N'Khoang 1'),
	('SE1G41005', 40000.0,  1,  'SE01', 'TG4SE110',N'Khoang 2'),
	('SE1G41006', 40000.0,  2,  'SE01', 'TG4SE110',N'Khoang 2'),
	('SE1G41007', 40000.0,  3,  'SE01', 'TG4SE110',N'Khoang 2'),
	('SE1G41008', 40000.0,  4,  'SE01', 'TG4SE110',N'Khoang 2'),
	('SE1G41009', 40000.0,  1,  'SE01', 'TG4SE110',N'Khoang 3'),
	('SE1G41010', 40000.0,  2,  'SE01', 'TG4SE110',N'Khoang 3'),
	('SE1G41011', 40000.0,  3,  'SE01', 'TG4SE110',N'Khoang 3'),
	('SE1G41012', 40000.0,  4,  'SE01', 'TG4SE110',N'Khoang 3'),
	('SE1G41013', 40000.0,  1,  'SE01', 'TG4SE110',N'Khoang 4'),
	('SE1G41014', 40000.0,  2,  'SE01', 'TG4SE110',N'Khoang 4'),
	('SE1G41015', 40000.0,  3,  'SE01', 'TG4SE110',N'Khoang 4'),
	('SE1G41016', 40000.0,  4,  'SE01', 'TG4SE110',N'Khoang 4'),
	('SE1G41017', 40000.0,  1,  'SE01', 'TG4SE110',N'Khoang 5'),
	('SE1G41018', 40000.0,  2,  'SE01', 'TG4SE110',N'Khoang 5'),
	('SE1G41019', 40000.0,  3,  'SE01', 'TG4SE110',N'Khoang 5'),
	('SE1G41020', 40000.0,  4,  'SE01', 'TG4SE110',N'Khoang 5'),
	('SE1G41021', 40000.0,  1,  'SE01', 'TG4SE110',N'Khoang 6'),
	('SE1G41022', 40000.0,  2,  'SE01', 'TG4SE110',N'Khoang 6'),
	('SE1G41023', 40000.0,  3,  'SE01', 'TG4SE110',N'Khoang 6'),
	('SE1G41024', 40000.0,  4,  'SE01', 'TG4SE110',N'Khoang 6')


select * from ChoNgoi order by MaChoNgoi 



------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU TUYEN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7


INSERT INTO Tuyen (MaTuyen, TenTuyen)
VALUES 
    ('B-N', N'Bình Thuận - Sài Gòn'),
	('N-B', N'Sài Gòn - Bình Thuận')

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU GA*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO Ga (ID,TenGa, CuLy, DiaChi)
VALUES
    (1,N'Sài Gòn', 1726.2,   N'1 Nguyễn Thông, phường 9, quận 3, Thành phố Hồ Chí Minh'),
	(2,N'Gò Vấp', 1722.13, N'Số 1, đường Lê Lai, phường 3, quận Gò Vấp, Thành phố Hồ Chí Minh'),
	(3,N'Bình Triệu', 1718.34, N'Kha Vạn Cân, phường Hiệp Bình Chánh, thành phố Thủ Đức, Thành phố Hồ Chí Minh'),
	(4,N'Sóng Thần', 1710.56, N'Đại lộ Độc Lập, phường An Bình, thành phố Dĩ An, Bình Dương'),
	(5,N'Dĩ An', 1706.71, N'Đường Nguyễn An Ninh, phường Dĩ An, thành phố Dĩ An, Bình Dương'),
	(6,N'Biên Hòa', 1697.48, N'Đường Hưng Đạo Vương, phường Trung Dũng, thành phố Biên Hoà, Đồng Nai'),
	(7,N'Hố Nai', 1688.04, N'Điểu Xiển, phường Tân Hòa, thành phố Biên Hoà, Đồng Nai'),
	(8,N'Trảng Bom', 1677.51, N'Xã Quảng Tiến, huyện Trảng Bom, Đồng Nai'),
	(9,N'Trung Hòa', 1669.75,   N'Xã Trung Hòa, huyện Trảng Bom, Đồng Nai'),
	(10,N'Dầu Giây', 1661.32, N'Thị trấn Dầu Giây, huyện Thống Nhất, Đồng Nai'),
	(11,N'Long Khánh', 1649.36, N'Số 23, đường Trần Phú, phường Xuân An, thành phố Long Khánh, Đồng Nai'),
	(12,N'Bảo Chánh', 1639.83, N'Xã Xuân Thọ, huyện Xuân Lộc, Đồng Nai'),
	(13,N'Gia Ray', 1630.87, N'Xã Xuân Trường, huyện Xuân Lộc, Đồng Nai'),
	(14,N'Trản Táo', 	1619.9, N'Xã Xuân Tâm, huyện Xuân Lộc, Đồng Nai'),
	(15,N'Gia Huynh', 1613.51, N'Xã Gia Huynh, huyện Tánh Linh, Bình Thuận'),
	(16,N'Suối Kiết', 1603.1, N'Xã Suối Kiết, huyện Tánh Linh, Bình Thuận'),
	(17,N'Sông Dinh', 1595.93, N'Xã Suối Kiết, huyện Tánh Linh, Bình Thuận'),
	(18,N'Sông Phan', 	1582.86, N'Xã Sông Phan, huyện Hàm Tân, Bình Thuận'),
	(19,N'Suối Vận', 1567.72, N'Xã Hàm Cường, huyện Hàm Thuận Nam, Bình Thuận'),
	(20,N'Hàm Cường Tây', 	1559.11, N'Xã Hàm Cường, huyện Hàm Thuận Nam, Bình Thuận');

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU CHUYEN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7


INSERT INTO ChiTietTuyen (MaTuyen,ID)
VALUES
	('B-N',1),
	('B-N',2),
	('B-N',3),
	('B-N',4),
	('B-N',5),
	('B-N',6),
	('B-N',7),
	('B-N',8),
	('B-N',9),
	('B-N',10),
	('B-N',11),
	('B-N',15),
	('B-N',16),
	('B-N',17),
	('B-N',18),
	('B-N',19),
	('B-N',20),
	('N-B',1),
	('N-B',2),
	('N-B',3),
	('N-B',4),
	('N-B',5),
	('N-B',6),
	('N-B',7),
	('N-B',8),
	('N-B',9),
	('N-B',10),
	('N-B',11),
	('N-B',12),
	('N-B',13),
	('N-B',14),
	('N-B',15),
	('N-B',16),
	('N-B',17),
	('N-B',18),
	('N-B',19),
	('N-B',20)

INSERT INTO Chuyen (MaChuyen,Chieu, TenChuyen, GioKhoiHanh, NgayKhoiHanh, MaTau, MaTuyen)
VALUES
	('SE01083020052024NB',0, N'Bình Thuận - Sài Gòn',  '2024-05-20 08:30:00',  '2024-05-20', 'SE01', 'B-N'),
	('SE01164012052024BN',1, N'Sài Gòn - Bình Thuận',  '2024-05-12 16:40:00',  '2024-05-12', 'SE01', 'N-B'),
	('SE01123012052024BN',1, N'Sài Gòn - Bình Thuận',  '2024-05-12 12:30:00',  '2024-05-12', 'SE01', 'N-B'),
	('SE01123012052024NB',0, N'Bình Thuận - Sài Gòn',  '2024-05-12 12:30:00',  '2024-05-12', 'SE01', 'B-N')
	

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU KHUYENMAI*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO KhuyenMai(MaKhuyenMai, TenKhuyenMai,LoaiKhuyenMai,SoLuongVe,ThoiGianBatDau,ThoiGianKetThuc, ChietKhau,TrangThai)
VALUES 
    ('KM1302202300', N'Vé tết', N'Vé',1, '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.2',1),
	('KM1506202000', N'Trẻ em', N'Trẻ em',1, '2020-06-15 00:00:00', '2025-07-15 00:00:00', '0.25',1),
	('KM1506202001', N'Người già', N'Người già',1, '2020-06-15 00:00:00', '2025-07-15 00:00:00', '0.25',1),
	('KM1302202301', N'Vé tập 10-19', N'KMHD',10, '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.15',1),
	('KM1302202002', N'Sinh viên', N'Sinh viên',1, '2020-02-13 00:00:00', '2025-03-13 00:00:00', '0.1',1),
	('KM1302202303', N'Vé tập 20-29', N'KMHD',20, '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.2',1),
	('KM1302202304', N'Vé tập 30-49', N'KMHD',30, '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.25',1),
	('KM1302202305', N'Vé tập 50', N'KMHD',50, '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.3',1)

SELECT * FROM KhuyenMai;
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU CHITIETKHUYENMAI*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
select *from HoaDon
select *from Ve where MaHoaDon = 'HD2004240815'
select  *from Ga
select *from ChiTietVe
select *from Tau
select *from ChoNgoi
select *from 
/*
INSERT INTO ChiTietKhuyenMai(MaHoaDon, MaKhuyenMai)
VALUES
    ('HD12022300023', 'KM0609202304'),
	('HD12022300023', 'KM0609202303'),
	('HD12022300023', 'KM0609202302'),
	('HD12022300023', 'KM0609202301'),
	('HD12022300030', 'KM0609202304');
*/



------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------4
                                                                                /*DỮ LIỆU HOÁ ĐƠN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------4


INSERT INTO HoaDon (MaHoaDon, GioTao, NgayTao, TrangThai, MaNhanVien, CCCD)
VALUES 
	('HD2004241341', '2024-04-20 12:40:00', '2024-04-20', 1, 'NV21020002', '038203000235'),
	('HD2004241241', '2024-04-20 12:40:00', '2024-04-20', 1, 'NV21020002', '038203000235'),
    ('HD2004240815', '2024-04-20 08:15:00', '2024-04-20', 1, 'NV21020002', '038203000233'),
	('HD2004240940', '2024-04-20 09:40:00', '2024-04-20', 1, 'NV21020002', '038203000231'),
	('HD2004241240', '2024-04-20 12:40:00', '2024-04-20', 1, 'NV21020002', '038203000235')

    

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU VE*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7




INSERT INTO Ve (MaVe, ThoiGianLenTau, MaChuyen, MaChoNgoi, MaKhuyenMai, CCCD, MaHoaDon,TrangThai)
VALUES
('12301205240029Aplus', '2024-04-23 12:30:00', 'SE01123012052024BN', 'SE1G60512', null, '038203000244', 'HD2004241341',1),

	('12301205240019Aplus', '2024-05-26 12:30:00', 'SE01123012052024BN', 'SE1G60512', null, '038203000244', 'HD2004241241',1),

    ('12301205240000Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1G60632',null, '038203000236', 'HD2004240815',1),
	('12301205240001Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1NM0353', 'KM1302202002', '111120170000', 'HD2004240815',1),
	('12301205240002Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1NM0219', null, '038203000238', 'HD2004240940',1),
	('12301205240003Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1G60521', null, '038203000249', 'HD2004240940',1),
	('12301205240004Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1G60522', null, '038203000244', 'HD2004240940',1),
	('12301205240005Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1G60624',null, '038203000236', 'HD2004241240',1),
	('12301205240006Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1NM0354', 'KM1302202002', '111120170000', 'HD2004241240',1),
	('12301205240007Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1NM0218', null, '038203000238', 'HD2004241240',1),
	('12301205240008Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1G60502', null, '038203000249', 'HD2004241240',1),
	('12301205240009Aplus', '2024-05-12 12:30:00', 'SE01123012052024BN', 'SE1G60512', null, '038203000244', 'HD2004241240',1);





INSERT INTO ChiTietVe (MaVe,ID,Chieu)
VALUES
	('12301205240029Aplus',5,0),
	('12301205240029Aplus',2,1),
('12301205240019Aplus',5,0),
	('12301205240019Aplus',2,1),

	('12301205240000Aplus',2,1),
	('12301205240000Aplus',5,0),
	('12301205240001Aplus',2,1),
	('12301205240001Aplus',5,0),
	('12301205240002Aplus',2,1),
	('12301205240002Aplus',7,0),
	('12301205240003Aplus',2,1),
	('12301205240003Aplus',7,0),
	('12301205240004Aplus',2,1),
	('12301205240004Aplus',7,0),
	('12301205240005Aplus',1,1),
	('12301205240005Aplus',3,0),
	('12301205240006Aplus',3,1),
	('12301205240006Aplus',6,0),
	('12301205240007Aplus',4,1),
	('12301205240007Aplus',5,0),
	('12301205240008Aplus',4,1),
	('12301205240008Aplus',8,0),
	('12301205240009Aplus',6,1),
	('12301205240009Aplus',8,0)





                                                                                /*XOÁ BẢNG*/
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*DROP TABLE KhachHang;
DROP TABLE NhanVien;
DROP TABLE TaiKhoan;
DROP TABLE HoaDon;
DROP TABLE Tau;
DROP TABLE Toa;
DROP TABLE ChoNgoi;
DROP TABLE Chuyen;
DROP TABLE Tuyen;
DROP TABLE Ga;
DROP TABLE ChiTietKhuyenMai;*/
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------2
                                                                                /*CHẠY BẢNG*/
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------2
----------------------------------------------------------
-----------------------CHỌN BẢNG--------------------------
----------------------------------------------------------
SELECT * FROM KhachHang;        --1
SELECT * FROM NhanVien;         --2
SELECT * FROM TaiKhoan;         --3
SELECT * FROM HoaDon;           --4
SELECT * FROM Tau;              --5
SELECT * FROM Toa;              --6
SELECT * FROM ChoNgoi;          --7
SELECT * FROM Chuyen;           --8
SELECT * FROM Tuyen;            --9
SELECT * FROM Ga;               --10
SELECT * FROM Ve;  
SELECT * FROM ChiTietVe order by MaVe
--11
        --12
SELECT * FROM ChiTietKhuyenMai; --13



--------------Lấy danh sách ghế còn trống tại ga
SELECT Ve.MaVe, MaChoNgoi, 
  MAX(CASE WHEN Chieu = 1 THEN ID END) AS ID1, 
  MAX(CASE WHEN Chieu = 0 THEN ID END) AS ID2
FROM Ve 
JOIN ChiTietVe ON Ve.MaVe = ChiTietVe.MaVe 
WHERE Ve.MaChuyen = 'SE01123012052024BN'
GROUP BY Ve.MaVe, MaChoNgoi


SELECT * From Ve 

SELECT Ve.MaVe, MaChoNgoi,
MAX(CASE WHEN Chieu = 1 THEN ID END) AS ID1, 
MAX(CASE WHEN Chieu = 0 THEN ID END) AS ID2
FROM Ve 
JOIN ChiTietVe ON Ve.MaVe = ChiTietVe.MaVe 
WHERE Ve.MaChuyen = 'SE01123012052024BN' AND TrangThai = 1
GROUP BY Ve.MaVe, MaChoNgoi
HAVING MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) = 3 
	OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 3 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 3) 
		OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 6 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 6)
			OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) > 3 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) < 6)


----- Lấy danh sách chổ ngồi chưa đặt chổ vị trí toa
SELECT * 
from ChoNgoi join Toa on ChoNgoi.MaToa = Toa.MaToa
WHERE Toa.ViTri = 5 AND MaChoNgoi  IN (
	SELECT MaChoNgoi
	FROM Ve 
	JOIN ChiTietVe ON Ve.MaVe = ChiTietVe.MaVe
	WHERE Ve.MaChuyen = 'SE01123012052024BN' 
	GROUP BY MaChoNgoi
	HAVING MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) = 1 
		OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 1 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 1) 
			OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 11 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 11)
				OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) > 1 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) < 11))
ORDER BY MaChoNgoi DESC

----- 

SELECT * 
from ChoNgoi join Toa on ChoNgoi.MaToa = Toa.MaToa
WHERE MaChoNgoi IN (
	SELECT MaChoNgoi
	FROM Ve 
	JOIN ChiTietVe ON Ve.MaVe = ChiTietVe.MaVe
	WHERE Ve.MaChuyen = 'SE01123012052024BN' 
	GROUP BY MaChoNgoi
	HAVING MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) = 3 
		OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 3 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 3) 
			OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 6 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 6)
				OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) > 3 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) < 6))



SELECT * 
FROM Toa 
WHERE MaToa IN(
	SELECT MaToa from Chuyen join Tau on Chuyen.MaTau = Tau.MaTau 
		join ChoNgoi on ChoNgoi.MaTau = Tau.MaTau WHERE MaChuyen = 'SE01123012052024BN' GROUP BY MaToa)


SELECT Tuyen.MaTuyen
FROM Tuyen join ChiTietTuyen on Tuyen.MaTuyen = ChiTietTuyen.MaTuyen
WHERE ID = 6 OR ID = 4
GROUP BY Tuyen.MaTuyen


SELECT Toa.MaToa, LoaiToa, Toa.ViTri
from ChoNgoi join Toa on ChoNgoi.MaToa = Toa.MaToa
WHERE MaChoNgoi NOT IN (
	SELECT MaChoNgoi
	FROM Ve 
	JOIN ChiTietVe ON Ve.MaVe = ChiTietVe.MaVe
	WHERE Ve.MaChuyen = 'SE01123012052024BN' 
	GROUP BY MaChoNgoi
	HAVING MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) = 3 
		OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 3 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 3) 
			OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) < 6 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) > 6)
				OR (MAX(CASE WHEN ChiTietVe.Chieu = 1 THEN ID END) > 3 AND MAX(CASE WHEN ChiTietVe.Chieu = 0 THEN ID END) < 6))
GROUP BY Toa.MaToa, LoaiToa, Toa.ViTri
ORDER BY Toa.ViTri


SELECT * FROM Ve Join ChiTietVe on ve.MaVe = ChiTietVe.MaVe


SELECT * From HoaDon

