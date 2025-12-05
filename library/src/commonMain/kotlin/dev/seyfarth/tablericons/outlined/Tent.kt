package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Tent: ImageVector
    get() {
        if (_Tent != null) {
            return _Tent!!
        }
        _Tent = ImageVector.Builder(
            name = "Filled.Tent",
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
                moveTo(11f, 14f)
                lineToRelative(4f, 6f)
                horizontalLineToRelative(6f)
                lineToRelative(-9f, -16f)
                lineToRelative(-9f, 16f)
                horizontalLineToRelative(6f)
                lineToRelative(4f, -6f)
            }
        }.build()

        return _Tent!!
    }

@Suppress("ObjectPropertyName")
private var _Tent: ImageVector? = null
