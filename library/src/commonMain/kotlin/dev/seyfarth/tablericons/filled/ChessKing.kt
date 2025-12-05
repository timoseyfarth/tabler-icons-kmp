package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ChessKing: ImageVector
    get() {
        if (_ChessKing != null) {
            return _ChessKing!!
        }
        _ChessKing = ImageVector.Builder(
            name = "Filled.ChessKing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.758f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.033f, -0.734f)
                lineToRelative(0.24f, -0.018f)
                lineToRelative(0.227f, -0.006f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 4.5f)
                arcToRelative(4.504f, 4.504f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.064f, 4.478f)
                lineToRelative(-0.217f, 0.016f)
                lineToRelative(-0.219f, 0.006f)
                horizontalLineToRelative(-7f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.501f, -8.241f)
                lineToRelative(-0.001f, -1.759f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.987f, -1.768f)
                lineToRelative(0.011f, -0.174f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.998f, -1.058f)
                close()
            }
        }.build()

        return _ChessKing!!
    }

@Suppress("ObjectPropertyName")
private var _ChessKing: ImageVector? = null
