package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Metronome: ImageVector
    get() {
        if (_Metronome != null) {
            return _Metronome!!
        }
        _Metronome = ImageVector.Builder(
            name = "Filled.Metronome",
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
                moveTo(14.153f, 8.188f)
                lineToRelative(-0.72f, -3.236f)
                arcToRelative(2.493f, 2.493f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.867f, 0f)
                lineToRelative(-3.025f, 13.614f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.952f, 2.434f)
                horizontalLineToRelative(7.014f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.952f, -2.434f)
                lineToRelative(-0.524f, -2.357f)
                moveToRelative(-4.935f, 1.791f)
                lineToRelative(9f, -13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
            }
        }.build()

        return _Metronome!!
    }

@Suppress("ObjectPropertyName")
private var _Metronome: ImageVector? = null
