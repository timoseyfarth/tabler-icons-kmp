package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Brightness2: ImageVector
    get() {
        if (_Brightness2 != null) {
            return _Brightness2!!
        }
        _Brightness2 = ImageVector.Builder(
            name = "Filled.Brightness2",
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
                moveTo(12f, 12f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 6f)
                horizontalLineToRelative(3.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(2.5f, -2.5f)
                close()
            }
        }.build()

        return _Brightness2!!
    }

@Suppress("ObjectPropertyName")
private var _Brightness2: ImageVector? = null
