package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Fence: ImageVector
    get() {
        if (_Fence != null) {
            return _Fence!!
        }
        _Fence = ImageVector.Builder(
            name = "Filled.Fence",
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
                moveTo(4f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-4f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-6f)
                lineToRelative(-2f, -2f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 16f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-6f)
                lineToRelative(-2f, -2f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _Fence!!
    }

@Suppress("ObjectPropertyName")
private var _Fence: ImageVector? = null
