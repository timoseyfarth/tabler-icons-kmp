package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.SquareRoundedLetterB: ImageVector
    get() {
        if (_SquareRoundedLetterB != null) {
            return _SquareRoundedLetterB!!
        }
        _SquareRoundedLetterB = ImageVector.Builder(
            name = "Filled.SquareRoundedLetterB",
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
                moveTo(10f, 16f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                horizontalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(7.2f, 0f, 9f, 1.8f, 9f, 9f)
                reflectiveCurveToRelative(-1.8f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -1.8f, -9f, -9f)
                reflectiveCurveToRelative(1.8f, -9f, 9f, -9f)
                close()
            }
        }.build()

        return _SquareRoundedLetterB!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRoundedLetterB: ImageVector? = null
