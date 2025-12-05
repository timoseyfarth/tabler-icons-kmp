package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PlaneInflight: ImageVector
    get() {
        if (_PlaneInflight != null) {
            return _PlaneInflight!!
        }
        _PlaneInflight = ImageVector.Builder(
            name = "Filled.PlaneInflight",
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
                moveTo(15f, 11.085f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 4f)
                horizontalLineToRelative(-15f)
                lineToRelative(-3f, -6f)
                horizontalLineToRelative(3f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(3f)
                lineToRelative(-2f, -7f)
                horizontalLineToRelative(3f)
                lineToRelative(4f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
            }
        }.build()

        return _PlaneInflight!!
    }

@Suppress("ObjectPropertyName")
private var _PlaneInflight: ImageVector? = null
