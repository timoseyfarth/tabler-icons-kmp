package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChessRook: ImageVector
    get() {
        if (_ChessRook != null) {
            return _ChessRook!!
        }
        _ChessRook = ImageVector.Builder(
            name = "Filled.ChessRook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                lineToRelative(-1.447f, 0.724f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.553f, 0.894f)
                verticalLineToRelative(2.382f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2.382f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.553f, -0.894f)
                lineToRelative(-1.447f, -0.724f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                lineToRelative(1f, -9f)
                horizontalLineToRelative(6f)
                lineToRelative(1f, 9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 4f)
                lineToRelative(0.5f, 3f)
                horizontalLineToRelative(11f)
                lineToRelative(0.5f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 4f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 4f)
                verticalLineToRelative(3f)
            }
        }.build()

        return _ChessRook!!
    }

@Suppress("ObjectPropertyName")
private var _ChessRook: ImageVector? = null
