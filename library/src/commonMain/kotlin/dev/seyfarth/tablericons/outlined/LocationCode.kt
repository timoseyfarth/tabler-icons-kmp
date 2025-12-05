package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LocationCode: ImageVector
    get() {
        if (_LocationCode != null) {
            return _LocationCode!!
        }
        _LocationCode = ImageVector.Builder(
            name = "Filled.LocationCode",
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
                moveTo(11.505f, 17.01f)
                lineToRelative(-1.505f, -3.01f)
                lineToRelative(-7f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1f)
                lineToRelative(18f, -6.5f)
                lineToRelative(-3.677f, 10.184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 21f)
                lineToRelative(2f, -2f)
                lineToRelative(-2f, -2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 17f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
            }
        }.build()

        return _LocationCode!!
    }

@Suppress("ObjectPropertyName")
private var _LocationCode: ImageVector? = null
