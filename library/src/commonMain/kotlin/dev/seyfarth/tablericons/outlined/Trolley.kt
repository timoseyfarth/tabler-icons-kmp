package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Trolley: ImageVector
    get() {
        if (_Trolley != null) {
            return _Trolley!!
        }
        _Trolley = ImageVector.Builder(
            name = "Filled.Trolley",
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
                moveTo(11f, 19f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                lineToRelative(3f, 2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                lineToRelative(8f, -12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 10f)
                lineToRelative(2f, 1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.592f, 4.695f)
                lineToRelative(3.306f, 2.104f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.396f, 1.8f)
                lineToRelative(-3.094f, 4.811f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.792f, 0.394f)
                lineToRelative(-3.306f, -2.104f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.396f, -1.8f)
                lineToRelative(3.094f, -4.81f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.792f, -0.394f)
                close()
            }
        }.build()

        return _Trolley!!
    }

@Suppress("ObjectPropertyName")
private var _Trolley: ImageVector? = null
