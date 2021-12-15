import React from 'react'
import { Dropdown, Menu, Image } from 'semantic-ui-react'

export default function SignedIn({signOut}) {
    return (
        <div>
            <Menu.Item>
                <Image avatar spaced="right" src="https://scontent.fdiy1-2.fna.fbcdn.net/v/t1.6435-9/122494433_3723746384312768_3736838746619832446_n.jpg?_nc_cat=109&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=C-61QkZaRm8AX-F3IJI&_nc_ht=scontent.fdiy1-2.fna&oh=00_AT-BLOOPNEP8ocIK6Raul-Cv-HzkmobftuxiR1OO-Cjz9g&oe=61DCEF9F"></Image>
                <Dropdown pointing="top left" text="Hanifi">
                    <Dropdown.Menu>

                    <Dropdown.Item text="Bilgilerim" icon="info" />
                    <Dropdown.Item onClick={signOut} text="Çıkış yap" icon="sign-out" />

                </Dropdown.Menu>
                </Dropdown>

            </Menu.Item>
        </div>
    )
}
