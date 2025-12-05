package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Filled.Gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(6f)
                close()
                moveTo(19f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6f)
                close()
                moveTo(16.5f, 2f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.163f, 5f)
                horizontalLineToRelative(0.337f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(0.337f)
                arcToRelative(3.486f, 3.486f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.337f, -1.5f)
                curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.483f, -3.5f)
                curveToRelative(1.755f, -0.03f, 3.312f, 1.092f, 4.381f, 2.934f)
                lineToRelative(0.136f, 0.243f)
                curveToRelative(1.033f, -1.914f, 2.56f, -3.114f, 4.291f, -3.175f)
                lineToRelative(0.209f, -0.002f)
                close()
                moveTo(7.5f, 4f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                horizontalLineToRelative(3.143f)
                curveToRelative(-0.741f, -1.905f, -1.949f, -3.02f, -3.143f, -3f)
                close()
                moveTo(16.483f, 4f)
                curveToRelative(-1.18f, -0.02f, -2.385f, 1.096f, -3.126f, 3f)
                horizontalLineToRelative(3.143f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.017f, -3f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null
