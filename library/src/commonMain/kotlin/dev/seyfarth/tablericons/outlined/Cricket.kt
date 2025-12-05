package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Cricket: ImageVector
    get() {
        if (_Cricket != null) {
            return _Cricket!!
        }
        _Cricket = ImageVector.Builder(
            name = "Filled.Cricket",
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
                moveTo(11.105f, 18.79f)
                lineToRelative(-1f, 0.992f)
                arcToRelative(4.159f, 4.159f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.038f, -5.715f)
                lineToRelative(0.157f, -0.166f)
                lineToRelative(8.282f, -8.401f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(3.45f, -3.391f)
                arcToRelative(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.057f, 2.815f)
                lineToRelative(-0.116f, 0.126f)
                lineToRelative(-3.391f, 3.45f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-3.668f, 3.617f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7.5f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
            }
        }.build()

        return _Cricket!!
    }

@Suppress("ObjectPropertyName")
private var _Cricket: ImageVector? = null
