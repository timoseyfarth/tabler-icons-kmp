package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Chisel: ImageVector
    get() {
        if (_Chisel != null) {
            return _Chisel!!
        }
        _Chisel = ImageVector.Builder(
            name = "Filled.Chisel",
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
                moveTo(14f, 14f)
                lineToRelative(1.5f, 1.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.347f, 15.575f)
                lineToRelative(2.08f, 2.079f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.773f, 2.772f)
                lineToRelative(-2.08f, -2.079f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.773f, -2.772f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                lineToRelative(3f, -3f)
                lineToRelative(7.414f, 7.414f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.586f, 1.414f)
                verticalLineToRelative(2.172f)
                horizontalLineToRelative(-2.172f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -0.586f)
                lineToRelative(-7.414f, -7.414f)
                close()
            }
        }.build()

        return _Chisel!!
    }

@Suppress("ObjectPropertyName")
private var _Chisel: ImageVector? = null
