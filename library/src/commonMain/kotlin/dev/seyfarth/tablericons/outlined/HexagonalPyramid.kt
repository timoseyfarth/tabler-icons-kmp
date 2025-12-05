package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.HexagonalPyramid: ImageVector
    get() {
        if (_HexagonalPyramid != null) {
            return _HexagonalPyramid!!
        }
        _HexagonalPyramid = ImageVector.Builder(
            name = "Filled.HexagonalPyramid",
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
                moveTo(11.162f, 2.457f)
                lineToRelative(-7.846f, 12.954f)
                arcToRelative(1.988f, 1.988f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.267f, 2.483f)
                lineToRelative(2.527f, 2.523f)
                curveToRelative(0.374f, 0.373f, 0.88f, 0.583f, 1.408f, 0.583f)
                horizontalLineToRelative(8.964f)
                curveToRelative(0.528f, 0f, 1.034f, -0.21f, 1.408f, -0.583f)
                lineToRelative(2.527f, -2.523f)
                arcToRelative(1.988f, 1.988f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.267f, -2.483f)
                lineToRelative(-7.846f, -12.954f)
                arcToRelative(0.996f, 0.996f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.676f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                lineToRelative(-5f, 18.9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                lineToRelative(5f, 18.9f)
            }
        }.build()

        return _HexagonalPyramid!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonalPyramid: ImageVector? = null
