package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.UTurnLeft: ImageVector
    get() {
        if (_UTurnLeft != null) {
            return _UTurnLeft!!
        }
        _UTurnLeft = ImageVector.Builder(
            name = "Filled.UTurnLeft",
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
                moveTo(17f, 20f)
                verticalLineToRelative(-11.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 0f)
                verticalLineToRelative(8.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 14f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
        }.build()

        return _UTurnLeft!!
    }

@Suppress("ObjectPropertyName")
private var _UTurnLeft: ImageVector? = null
