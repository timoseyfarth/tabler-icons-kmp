package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ChessQueen: ImageVector
    get() {
        if (_ChessQueen != null) {
            return _ChessQueen!!
        }
        _ChessQueen = ImageVector.Builder(
            name = "Filled.ChessQueen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.572f, 3.236f)
                lineToRelative(0.793f, 1.983f)
                lineToRelative(1.702f, -1.702f)
                arcToRelative(2.003f, 2.003f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.933f, -2.517f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.674f, 3.884f)
                lineToRelative(-1.69f, 9.295f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.865f, 0.814f)
                lineToRelative(-0.119f, 0.007f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.956f, -0.705f)
                lineToRelative(-0.028f, -0.116f)
                lineToRelative(-1.69f, -9.295f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.607f, -1.367f)
                lineToRelative(1.701f, 1.702f)
                lineToRelative(0.794f, -1.983f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.572f, -3.236f)
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

        return _ChessQueen!!
    }

@Suppress("ObjectPropertyName")
private var _ChessQueen: ImageVector? = null
