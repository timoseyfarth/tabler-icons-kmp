package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Quote: ImageVector
    get() {
        if (_Quote != null) {
            return _Quote!!
        }
        _Quote = ImageVector.Builder(
            name = "Filled.Quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.13f, -1.65f, 5.193f, -4.757f, 5.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.486f, -1.94f)
                curveToRelative(2.227f, -0.557f, 3.243f, -1.827f, 3.243f, -4.03f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.13f, -1.65f, 5.193f, -4.757f, 5.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.486f, -1.94f)
                curveToRelative(2.227f, -0.557f, 3.243f, -1.827f, 3.243f, -4.03f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
            }
        }.build()

        return _Quote!!
    }

@Suppress("ObjectPropertyName")
private var _Quote: ImageVector? = null
