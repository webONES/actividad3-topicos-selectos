class Product < ActiveRecord::Base
  validates :name, :price, uniqueness: true
end
