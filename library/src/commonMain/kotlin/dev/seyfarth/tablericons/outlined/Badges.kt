package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Badges: ImageVector
    get() {
        if (_Badges != null) {
            return _Badges!!
        }
        _Badges = ImageVector.Builder(
            name = "Filled.Badges",
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
                moveTo(17f, 17f)
                verticalLineToRelative(-4f)
                lineToRelative(-5f, 3f)
                lineToRelative(-5f, -3f)
                verticalLineToRelative(4f)
                lineToRelative(5f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 8f)
                verticalLineToRelative(-4f)
                lineToRelative(-5f, 3f)
                lineToRelative(-5f, -3f)
                verticalLineToRelative(4f)
                lineToRelative(5f, 3f)
                close()
            }
        }.build()

        return _Badges!!
    }

@Suppress("ObjectPropertyName")
private var _Badges: ImageVector? = null
