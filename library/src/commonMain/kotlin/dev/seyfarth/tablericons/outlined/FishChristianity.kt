package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.FishChristianity: ImageVector
    get() {
        if (_FishChristianity != null) {
            return _FishChristianity!!
        }
        _FishChristianity = ImageVector.Builder(
            name = "Filled.FishChristianity",
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
                moveTo(22f, 7f)
                reflectiveCurveToRelative(-5.646f, 10f, -12.308f, 10f)
                curveToRelative(-3.226f, 0.025f, -6.194f, -1.905f, -7.692f, -5f)
                curveToRelative(1.498f, -3.095f, 4.466f, -5.025f, 7.692f, -5f)
                curveToRelative(6.662f, 0f, 12.308f, 10f, 12.308f, 10f)
            }
        }.build()

        return _FishChristianity!!
    }

@Suppress("ObjectPropertyName")
private var _FishChristianity: ImageVector? = null
