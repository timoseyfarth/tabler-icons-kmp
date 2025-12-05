package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Droplet: ImageVector
    get() {
        if (_Droplet != null) {
            return _Droplet!!
        }
        _Droplet = ImageVector.Builder(
            name = "Filled.Droplet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.708f, 2.372f)
                arcToRelative(2.382f, 2.382f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 0.686f)
                lineToRelative(-4.892f, 7.26f)
                curveToRelative(-1.981f, 3.314f, -1.22f, 7.466f, 1.767f, 9.882f)
                curveToRelative(2.969f, 2.402f, 7.286f, 2.402f, 10.254f, 0f)
                curveToRelative(2.987f, -2.416f, 3.748f, -6.569f, 1.795f, -9.836f)
                lineToRelative(-4.919f, -7.306f)
                curveToRelative(-0.722f, -1.075f, -2.192f, -1.376f, -3.295f, -0.686f)
                close()
            }
        }.build()

        return _Droplet!!
    }

@Suppress("ObjectPropertyName")
private var _Droplet: ImageVector? = null
