package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChristmasTreeOff: ImageVector
    get() {
        if (_ChristmasTreeOff != null) {
            return _ChristmasTreeOff!!
        }
        _ChristmasTreeOff = ImageVector.Builder(
            name = "Filled.ChristmasTreeOff",
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
                moveTo(9.5f, 5.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(4f, 4f)
                lineToRelative(-2f, 1f)
                lineToRelative(4f, 4f)
                lineToRelative(-1.5f, 0.5f)
                moveToRelative(0.5f, 4.5f)
                horizontalLineToRelative(-12f)
                lineToRelative(4f, -4f)
                lineToRelative(-3f, -1f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _ChristmasTreeOff!!
    }

@Suppress("ObjectPropertyName")
private var _ChristmasTreeOff: ImageVector? = null
