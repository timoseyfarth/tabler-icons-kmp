package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowBack: ImageVector
    get() {
        if (_ArrowBack != null) {
            return _ArrowBack!!
        }
        _ArrowBack = ImageVector.Builder(
            name = "Filled.ArrowBack",
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
                moveTo(9f, 11f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, -4f)
                horizontalLineToRelative(11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
                horizontalLineToRelative(-1f)
            }
        }.build()

        return _ArrowBack!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBack: ImageVector? = null
