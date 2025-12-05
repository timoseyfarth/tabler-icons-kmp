package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Plug: ImageVector
    get() {
        if (_Plug != null) {
            return _Plug!!
        }
        _Plug = ImageVector.Builder(
            name = "Filled.Plug",
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
                moveTo(9.785f, 6f)
                lineToRelative(8.215f, 8.215f)
                lineToRelative(-2.054f, 2.054f)
                arcToRelative(5.81f, 5.81f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8.215f, -8.215f)
                lineToRelative(2.054f, -2.054f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 20f)
                lineToRelative(3.5f, -3.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 4f)
                lineToRelative(-3.5f, 3.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 9f)
                lineToRelative(-3.5f, 3.5f)
            }
        }.build()

        return _Plug!!
    }

@Suppress("ObjectPropertyName")
private var _Plug: ImageVector? = null
