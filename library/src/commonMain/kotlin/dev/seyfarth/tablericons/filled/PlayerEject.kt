package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.PlayerEject: ImageVector
    get() {
        if (_PlayerEject != null) {
            return _PlayerEject!!
        }
        _PlayerEject = ImageVector.Builder(
            name = "Filled.PlayerEject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.247f, 3.341f)
                lineToRelative(-7f, 8f)
                curveToRelative(-0.565f, 0.647f, -0.106f, 1.659f, 0.753f, 1.659f)
                horizontalLineToRelative(14f)
                curveToRelative(0.86f, 0f, 1.318f, -1.012f, 0.753f, -1.659f)
                lineToRelative(-7f, -8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.506f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                close()
            }
        }.build()

        return _PlayerEject!!
    }

@Suppress("ObjectPropertyName")
private var _PlayerEject: ImageVector? = null
