package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Diamonds: ImageVector
    get() {
        if (_Diamonds != null) {
            return _Diamonds!!
        }
        _Diamonds = ImageVector.Builder(
            name = "Filled.Diamonds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.005f)
                curveToRelative(-0.777f, 0f, -1.508f, 0.367f, -1.971f, 0.99f)
                lineToRelative(-5.362f, 6.895f)
                curveToRelative(-0.89f, 1.136f, -0.89f, 3.083f, 0f, 4.227f)
                lineToRelative(5.375f, 6.911f)
                arcToRelative(2.457f, 2.457f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -0.017f)
                lineToRelative(5.361f, -6.894f)
                curveToRelative(0.89f, -1.136f, 0.89f, -3.083f, 0f, -4.227f)
                lineToRelative(-5.375f, -6.911f)
                arcToRelative(2.446f, 2.446f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.958f, -0.974f)
                close()
            }
        }.build()

        return _Diamonds!!
    }

@Suppress("ObjectPropertyName")
private var _Diamonds: ImageVector? = null
